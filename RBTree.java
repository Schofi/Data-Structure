public class RBTree<K extends Comparable<K>,V> implements Map<K,V> {
	private static final boolean RED=true;
	public static final boolean BLACK=false;
	private class Node{
		public K key;
		public V value;
		public Node left,right;
		public boolean color;
		public Node(K key,V value) {
			this.key=key;
			this.value=value;
			left=null;
			right=null;
			color=RED;
		}
	}
	private Node root;
	private int size;
	
	public RBTree() {
		root=null;
		size=0;
	}
	@Override
	public int getSize() {
		return size;
	}
	@Override
	public boolean isEmpty() {
		return size==0;
	}
	private boolean isRed(Node node) {
		if(node==null) {
			return BLACK;
		}
		return node.color;
	}
	private Node leftRotate(Node node) {
		Node x=node.right;
		//左旋
		node.right=x.left;
		x.left=node;
		x.color=node.color;
		node.color=RED;
		return x;
	}
	private Node rightRotate(Node node) {
		Node x=node.right;
		//右旋转
		node.left=x.right;
		x.right=node;
		x.color=node.color;
		node.color=RED;
		return x;
	}
	private void flipColors(Node node) {
		node.color=RED;
		node.left.color=BLACK;
		node.right.color=BLACK;
	}
	public void add(K key,V value) {
		root=add(root,key,value);
		root.color=BLACK;
	}
	private Node add(Node node,K key,V value) {
		if(node==null) {
			size++;
			return new Node(key,value);
		}
		if(key.compareTo(node.key)<0) {
			node.left=add(node.left,key,value);
		}else if(key.compareTo(node.key)>0) {
			node.right=add(node.right,key,value);
		}else {
			node.value=value;
		}
		if(isRed(node.right)&&!isRed(node.left)) {
			node=leftRotate(node);
		}
		if(isRed(node.left)&&isRed(node.right)) {
			node=rightRotate(node);
		}
		if(isRed(node.left)&&isRed(node.right)) {
			flipColors(node);
		}
		return node;
	}
	private Node getNode(Node node,K key){
		if(node==null) {
			return null;
		}
		if(key.compareTo(node.key)==0) {
			return node;
		}else if(key.compareTo(node.key)<0) {
			return getNode(node.left,key);
		}else {
			return getNode(node.right,key);
		}
	}
	@Override
	public V get(K key) {
		Node node=getNode(root,key);
		return node== null ?null:node.value;
	}
	@Override
	public void set(K key,V newValue) {
		Node node =getNode(root,key);
		if(node==null) {
			throw new IllegalArgumentException(key+"doesn't exist");
		}
		node.value=newValue;
	}
	
	private Node minimum(Node node) {
		if(node.left==null) {
			return node;
		}
		return minimum(node.left);
	}
	private Node removeMin(Node node) {
		if(node.left==null) {
			Node rightNode =node.right;
			node.right=null;
			size--;
			return rightNode;
		}
		node.left=removeMin(node.left);
		return node;
	}
	@Override
	public boolean contains(K key) {
		return getNode(root,key)!=null;
	}
	@Override
	public V remove(K key) {
		Node node=getNode(root,key);
		if(node!=null) {
			root=remove(root,key);
		}
		return null;
	}
	private Node remove(Node node,K key ) {
		if(node==null) {
			return null;
		}
		if(key.compareTo(node.key)<0) {
			node.left=remove(node.left,key);
			return node;
		}
		else if(key.compareTo(node.key)>0) {
			node.right=remove(node.right,key);
			return node;
		}else {
			if(node.left==null) {
				Node rightNode=node.right;
				node.right=null;
				size--;
				return rightNode;
			}
			if(node.right==null) {
				Node leftNode =node.left;
				node.left=null;
				size--;
				return leftNode;
			}
			Node successor=minimum(node.right);
			successor.right=removeMin(node.right);
			successor.left=node.left;
			node.left=node.right=null;
			return successor;
		}
	}
}
