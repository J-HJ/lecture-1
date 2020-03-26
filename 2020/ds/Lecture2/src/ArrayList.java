//	Implement Array List
public class ArrayList<E> {
	private E a[];			//	a[] �迭�� E Ÿ���� �ڷḦ ������ ����.
	private int size;		//	����Ʈ�� ����ִ� �ڷ��� ����
	
	//	������ 
	public ArrayList() {
		a = (E[]) new Object[1];		//	1���� ���Ҹ� ���� �迭�� ������� �Ѵ�.
		size = 0;			//	����ִ� �ڷ�����̹Ƿ� size�� 0���� �ʱ�ȭ�Ѵ�.
	}
	
	//	������ �߰��ϴ� �Լ� ����
	//	���� : �����÷ο�(overflow)�� �߻��ϸ�, ������ �� �ִ� ������ 2��� �ø����� ����.
	//	newItem�� �迭�� �� �������� �߰��Ѵ�.
	public void append(E newItem) {
		//	�����÷ο찡 �߻��ϴ��� �˻�
		if(size >= a.length) {
			Object[] t = new Object[size*2];
			for(int i=0; i < size; i++) {
				t[i] = a[i];
			}
			a = (E[]) t;
		}
		a[size++] = newItem;
	}
	
	//	����Ʈ ������ ���Ҹ� ����
	public void removeLast() {
		size--;
	}
	
	//	k �ε����� ���� �������� �Լ�
	public E Get(int k) {
		if(k < 0 || k >= size) { // Error exception
			return a[0];
		}
		return a[k];
	}
	
	//	������ �迭 ũ�⸦ ���� �Լ�
	public int GetSize() { return a.length; }
}

