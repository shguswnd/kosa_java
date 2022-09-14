package kr.or.kosa;

import java.util.List;

//JAVA API 제공하는 stack 직접 구현해보기

//1. stack 저장공간 (Array), 저장공간 타입(Object)
//2. 위치정보 : 저장되는 값이 있는 위치 (index) hint)전자제품 매장 cart 사용해서 처리
//3. 기능 : push(), pop(), boolean empty(), boolean full()

public class MyStack{
	private Object[] stackarr;//저장소
	private int maxsize; //최대크기
	private int top; //배열의 index값 (위치정보)
	private boolean empty;
	//	private int index;
    //	private List<Object> stackList;

	
	
	
	
	public MyStack(int maxsize) {
		this.maxsize = maxsize;
		stackarr = new Object[maxsize];
		top = -1; //배열의 시작값 0 (index)
	}

//	public void push(Object obj) {
//		if(this.maxsize != (this.top+1))
//		{
//			top++;
//			stackarr[top] = obj;
//		}
//		else {
//			System.out.println("허용범위가 아닙니다.");
//		}
//	}
//
//	public void pop() {
//		if(!empty())
//		{
//			System.out.println(stackarr[top]);
//			stackarr[top] = null;
//			top--;
//		}
//	}
//	public boolean empty() {
//		if(stackarr[0]==null)
//		{
//			this.empty = true;	
//			System.out.println("비어있습니다.");
//		}
//		else
//			this.empty = false;
//		return this.empty;
//	}

	public boolean isEmpty() {
		return (top == -1); //true
	}
	public boolean isFull() {
		return (maxsize == top+1); //true
	}
	
	public void push(Object i) {
		if(isFull()) {
			System.out.println("stack full...");
		}
		else {
			stackarr[++top] = i;
		}
	}
	public Object pop() {
		Object value = null;
		if(isEmpty()) {
			System.out.println("stack empty");
		}
		else {
			value = stackarr[top];
			stackarr[top] = null;
			top--;
		}
		return value;
	}
	
}
