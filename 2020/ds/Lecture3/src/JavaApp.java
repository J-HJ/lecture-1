//	���߿��Ḯ��Ʈ�� ���� ��� Ŭ����
class DNode<E> {
	private E item;			//	�����͸� ������ ����
	private DNode next;		//	���� ��带 ����ų ����
	private DNode prev;		//	���� ��带 ����ų ����
	//	������
	public DNode() {
		prev = this;
		next = this;
	}
	public DNode(E newItem, DNode p, DNode n) {
		item = newItem;
		prev = p;
		next = n;
	}
	//	private�� ����� �������� �׼����� �� �ִ� �޼ҵ�� ����
	public E getItem() { return item; }
	public DNode getNext() { return next; }
	public DNode getPrev() { return prev; }
	public void setNext(DNode n) { next=n; }
	public void setPrev(DNode p) { prev=p; }
}

//	���߿��� ����Ʈ�� �����ϱ� ���� Ŭ����
class DList<E> {
	private DNode head;		//	����ִ� head ���
	private DNode cur;		//	���� �����ϴ� ���
	//	������
	public DList() {
		head = new DNode();
		cur = head;
	}
	//	����ִ��� �˻��ϴ� �Լ�
	public boolean empty() {
		return head.getNext() == head;
	}
	public void insert(E newItem) {
		insert(cur, newItem);
	}
	//	�־��� ��� �տ� ���ο� ��� ����ֱ�
	public void insert(DNode cur, E newItem) {
		DNode node = new DNode(newItem, cur.getPrev(), cur);
		cur.setPrev(node);
		node.getPrev().setNext(node);
	}
	//	�־��� ��� ����
	public void remove(DNode cur) {
		cur.getPrev().setNext(cur.getNext());
		cur.getNext().setPrev(cur.getPrev());
	}
	//	��尪�� ��������
	public DNode getHead() { return head; }
}

public class JavaApp {
	public static void main(String[] args) {
		DList<String> list = new DList<String>();
		DNode<String> head = list.getHead();
		list.insert(head, "apple");
		list.insert(head, "orange");
		list.insert(head, "banana");
		//	���������� ����Ʈ ��ȸ
		System.out.println("Forward traversal");
		for(DNode<String> t=head.getNext(); t!=head; t=t.getNext())
			System.out.println(t.getItem());
		//	���������� ����Ʈ ��ȸ
		System.out.println("Backward traversal");
		for(DNode<String> t=head.getPrev(); t!=head; t=t.getPrev())
			System.out.println(t.getItem());
		//	head�� ������� �������� ��������.
		list.remove(head.getNext());
		System.out.println("After remove apple");
		for(DNode<String> t=head.getNext(); t!=head; t=t.getNext())
			System.out.println(t.getItem());
	}

}

