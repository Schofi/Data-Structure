
public class LinkedListStack<E> implements Stack<E> {
	private LinkedList<E> list;
	public LinkedListStack() {
		list=new LinkedList<>();
	}
	@Override
	public int getSize() {
		return list.getSize();
	}
	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}
	@Override
	public void push(E e) {
		list.addFirst(e);
	}
	public E pop() {
		return list.removeFirst();
	}
	public E top() {
		return list.getFirst();
	}
	public String toString() {
		StringBuilder res=new StringBuilder();
		res.append("stack top ");
		res.append(list);
		return res.toString();
	}
}
