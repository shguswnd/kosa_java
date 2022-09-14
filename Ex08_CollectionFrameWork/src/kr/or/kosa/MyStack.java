package kr.or.kosa;

import java.util.List;

//JAVA API �����ϴ� stack ���� �����غ���

//1. stack ������� (Array), ������� Ÿ��(Object)
//2. ��ġ���� : ����Ǵ� ���� �ִ� ��ġ (index) hint)������ǰ ���� cart ����ؼ� ó��
//3. ��� : push(), pop(), boolean empty(), boolean full()

public class MyStack{
	private Object[] stackarr;//�����
	private int maxsize; //�ִ�ũ��
	private int top; //�迭�� index�� (��ġ����)
	private boolean empty;
	//	private int index;
    //	private List<Object> stackList;

	
	
	
	
	public MyStack(int maxsize) {
		this.maxsize = maxsize;
		stackarr = new Object[maxsize];
		top = -1; //�迭�� ���۰� 0 (index)
	}

//	public void push(Object obj) {
//		if(this.maxsize != (this.top+1))
//		{
//			top++;
//			stackarr[top] = obj;
//		}
//		else {
//			System.out.println("�������� �ƴմϴ�.");
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
//			System.out.println("����ֽ��ϴ�.");
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
