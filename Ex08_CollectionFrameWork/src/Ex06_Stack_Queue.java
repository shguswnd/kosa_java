import kr.or.kosa.MyStack;

public class Ex06_Stack_Queue {

	public static void main(String[] args) {
		// Java API �����ϴ� Ŭ����
		// Collection Java API ����
		
		//Stack �ڷᱸ�� ������ Ŭ���� ���� ����.
		
//		Stack stack = new Stack();
//
//		stack.push("A");
//		stack.push("B");
//		stack.push("C");
//		
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
		MyStack test = new MyStack(2);
		test.push(1);
		test.push(2);
		test.push(3);
		test.push(4);
		
		
		test.pop();
		test.pop();
		test.pop();
	}

}
