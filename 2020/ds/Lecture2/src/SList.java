//	��带 �����ϱ� ���� Ŭ����
class Node<E> {
	private E item;
	private Node<E> next;	//	���� ��带 ����Ű�� ���۷��� ����
	//	������
	//	newItem	�����Ǵ� ����� ������
	//	node �� �����Ǵ� ��尡 ����� ��ġ�Դϴ�.
	public Node(E newItem, Node<E> node) {
		item = newItem;
		next = node;
	}
	public E getItem() { return item; }
	public Node<E> getNext() { return next; }
	public void setItem(E newItem) { item=newItem; }
	public void setNext(Node<E> newNext) { next=newNext; }
}

public class SList<E> {
	protected Node head;	//	���� ���� ����Ʈ�� ù��° ��带 ����ų ����
	
	//	������
	public SList() {
		head = null;
	}
	
	//	���ο� ������ �߰�
	public void insert(E newItem) {
		head = new Node(newItem, head);
	}
	
	//	�� �տ� �ִ� ������ ����
	public void remove() {
		if(head==null) { //	Error exception
			return;
		}
		head = head.getNext();
	}
	
	//	���Ḯ��Ʈ�� �ִ� ��� �� ���
	public void show() {
		for(Node t=head; t!=null; t=t.getNext()) {
			System.out.println(t.getItem());
		}
	}
}






