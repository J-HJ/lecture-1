
public class JavaApp {

	//	<summary>Main Method</summary>
	//	<param name=args>arguments</param>
	public static void main(String[] args) {
		// Hello World!�� ����ϵ��� �մϴ�.
		System.out.println("Hello World!");
		
		//	���� ���� �� ����
		int a = 3, b = 5;
		System.out.println(a+b);
		
		//	�迭 (�������� ���ʴ�� �����ϴ� ���ο� ����Ÿ��)
		int[] arr = { 1, 3, 5, 7 };
		System.out.println(arr[1]);
		
		//	�ݺ��� (�⺻ for����)
		System.out.println("Basic for loop");
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		//	�ݺ��� (for each ����)
		System.out.println("for each loop");
		for(int i : arr) {
			System.out.println(i);
		}
		
		//	���ǹ� (if - else if - else)
		int score = 76;
		if(score >= 90) System.out.println("A");
		else if(score >= 80) System.out.println("B");
		else if(score >= 70) System.out.println("C");
		else if(score >= 60) System.out.println("D");
		else System.out.println("F");
		//--end
	}

}
