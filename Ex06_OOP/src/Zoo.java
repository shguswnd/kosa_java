

interface breed{
	boolean bady(); //true : ����, false : �� 
}

abstract class Animal{
	abstract void eating();
	abstract void legs();
	abstract void alive();
}


abstract class landPlace extends Animal{
	void alive() {
		System.out.println("�ɾ�ٴϴ� �����Դϴ�.");
	}
}

abstract class seaPlace extends Animal{
	void alive() {
		System.out.println("���ġ�� �����Դϴ�.");
	}
}

abstract class skyPlace extends Animal{
	void alive() {
		System.out.println("���ƴٴϴ� �����Դϴ�.");
	}
}

//����

class Lion extends landPlace implements breed{
	
	String name;
	int legs;
	
	public Lion() {
		this.name = "����";
		this.legs=4;
	}
	
	@Override
	public boolean bady() {
		return true;
	}
	
	@Override
		
	void eating() {
		System.out.println("��⸦ �Խ��ϴ�..");
		
	}
	@Override
	void legs() {
		System.out.printf("�ٸ��� %d���Դϴ�.",this.legs);
	}
	void print() {
		System.out.printf("%s�� ",this.name);
		super.alive();
		System.out.printf("%s�� ",this.name);
		eating();
	}
}

//�ٴ�

class Turtle extends seaPlace implements breed{
	
	String name;
	int legs;
	
	public Turtle() {
		this.name = "�ź���";
		this.legs=4;
	}
	
	@Override
	public boolean bady() {
		return false;
	}
	
	@Override
		
	void eating() {
		System.out.println("��ȣ�� �Խ��ϴ�.");
		
	}
	@Override
	void legs() {
		System.out.printf("�ٸ��� %d���Դϴ�.",this.legs);
	}
	void print() {
		System.out.printf("%s�� ",this.name);
		super.alive();
		System.out.printf("%s�� ",this.name);
		eating();
	}
}
//����
class Bat extends skyPlace implements breed{
	
	String name;
	int legs;
	
	public Bat() {
		this.name = "����";
		this.legs=2;
	}
	
	@Override
	public boolean bady() {
		return true;
	}
	
	@Override
		
	void eating() {
		System.out.println("�Ǹ� ���ƸԽ��ϴ�.");
		
	}
	@Override
	void legs() {
		System.out.printf("�ٸ��� %d���Դϴ�.",this.legs);
	}
	void print() {
		System.out.printf("%s�� ",this.name);
		super.alive();
		System.out.printf("%s�� ",this.name);
		eating();
	}
}

class makeAnimal{
//	Animal animal;

	public makeAnimal(Animal animal) {
		if(animal instanceof landPlace)
		{
			//�Լ�
		}
		else if(animal instanceof seaPlace)
		{
			
		}
		else {
			
		}
	}
}






public class Zoo {

	public static void main(String[] args) {
//		Bat  bat = new Bat();
//		bat.print();
//		Turtle turtle = new Turtle();
//		turtle.print();
//		Lion lion = new Lion();
//		lion.print();

		Bat  bat = new Bat();
		Turtle turtle = new Turtle();
		Lion lion = new Lion();

	}

}
