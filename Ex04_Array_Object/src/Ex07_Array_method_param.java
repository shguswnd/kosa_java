class Human{
	String name;
}

class OverTest{
	int add(int i, int j) {
		return i + j;
	}
	void add(Human human) { //Humen 객체의 주소값.......
		System.out.println(human.name);
	}
	//1. add(new Human());
	//2. Human h = new Human(); add(h);
	
	//Today point (배열도 타입이다 == 배열은 객체다)
	int add(int param) {
		return param+100;
	}
	int[] add(int[] params) { //point params은 int[] 배열의 [[주소값]]을 받는다.
		//return null; //int[] 배열의 주소값 return
		int[] target = new int[params.length];
		for(int i = 0; i < target.length; i++) {
			target[i] = params[i] + 1;
		}
		return target;
	}
	int[] add(int[] so, int[] so2) {
		return null;
	}
}

public class Ex07_Array_method_param {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverTest overTest = new OverTest();
		
		int[] source = {10, 20, 30, 40, 50};
		
		int[] ta = overTest.add(source);
		
		for(int value : ta) {
			System.out.println(value);
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
