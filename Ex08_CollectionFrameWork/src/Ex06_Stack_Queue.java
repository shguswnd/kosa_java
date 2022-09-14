import kr.or.kosa.MyStack;

public class Ex06_Stack_Queue {

	public static void main(String[] args) {
		// Java API 제공하는 클래스
		// Collection Java API 제공
		
		//Stack 자료구조 가지는 클래스 제공 받음.
		
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
