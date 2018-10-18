public class UnionFind5 implements UF {
	private int[] parent;
	private int[] rank;
	public UnionFind5(int size) {
		parent=new int[size];
		rank=new int[size];
		for(int i=0;i<size;i++) {
			parent[i]=i;
			rank[i]=1;
		}
	}
	@Override
	public int getSize() {
		return parent.length;
	}
	private int find(int p) {
		if(p<0||p>parent.length) {
			throw new IllegalArgumentException("p is out of bound");
		}
		while(p!=parent[p]) {
			parent[p]=parent[parent[p]];
			p=parent[p];
		}
		return p;
	}
	@Override
	public boolean isConnected(int p,int q) {
		return find(p)==find(q);
	}
	public void unionElements(int p,int q) {
		int proot=find(p);
		int qroot=find(q);
		if(qroot==proot) {
			return;
		}
		if(rank[qroot]<rank[proot]) {
			parent[qroot]=proot;
		}else if(rank[proot]<rank[qroot]) {
			parent[proot]=qroot;
		}else {
			parent[proot]=qroot;
			rank[qroot]+=1;
		}
	}
}
