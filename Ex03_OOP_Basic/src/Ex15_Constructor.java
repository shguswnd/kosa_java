/*
 ������ �Լ�(constructor)
 1. �Լ�(Ư���� ����)
 2. ����(member field �ʱ�ȭ) >> static{}, {�ʱ�ȭ ����} 
 
 3. �Ϲ��Լ��� �ٸ���.
 3.1 �Լ��� �̸��� ����(class �̸� ����)
 3.2 return type ����(��ü ������ ���ÿ� ȣ��) (return �� ���� ����� ����.)
 3.3 ������� >> new ��ü ���� >> heap ���� ���� >> member field �ڸ� >> �ڵ����� ������ �Լ� ȣ��
 3.4 return type(x) >> void >> public void(����) Ŭ���� �̸� >> public Ŭ���� �̸� () {}
 
  
 4. why : �����Ǵ� ��ü����[����������] member field ���� �ʱ�ȭ.
 
 class Car {String color;}
 >> ���赵�� �������, .... �ڵ����� ������ ���鶧 �˾Ƽ� ��
 
 A) ������ �Ķ��� ���� ����..... ó������ �Ķ������� ����
 	class Car{String color = "blue";} 
 B) �� ������ �˾Ƽ� ��.
 
 class Car {String color;}
 Car car = new Car();
 car.color = "gold";
 ����)
 �ڵ��� ������ �����Ͽ� �������� ����.
 null �̶� ����(���� ����)
 
 >> ������ ���鶧 ������ ������ �Է��ϰ� �� �� �ִ� ��� .....
 >> �Լ� ..... , {} (�������� ���ų� �Ǵ� �Է°��� �������� ����.)

 5. ������ �Լ�(.... overloading ��� ���� ����)
 
 6. ������ �����ε��� ���ؼ� �پ��� �������� ���� ... ************************
 
 ******** �����ڸ� ���� ���� �߿��� ������ [������] �ʱ�ȭ(member field) ********
 */


class Car{
	String carname="����";
	
	//����� ���� Car ���赵�� ���鶧 ....
	//�����Ϸ��� �˾Ƽ� �Լ��� ���� .....
	//������ �Լ�
	//public Car(){} �ڵ� ���� ....
	
	//�����ڰ� ���� ���� 
	public Car() { //main ���� new Car()�� ȣ����.
		System.out.println(carname);
		System.out.println("�⺻������ȣ��");
		carname = "������";
		System.out.println(carname);
	}
}


class Car2{
	String carname;
	public Car2() {
		carname="����";
	}
}

class Car3{
	String carname;
	public Car3() { // �������� �ǵ� : �⺻ �ڵ��� ���ų� �ϰ� ���ϸ� �ڵ��� �̸��� �־ �����ض�.
		carname = "�⺻�̸�";
	}
	//overloading ���ؼ�
	public Car3(String name) { //���� POINT
		carname = name;
	}
}

class Car4{
	String carname;
	//�����Ǿ� �ִ�.
	//public Car4(){} ������ ����
}

class Car5{ //***����***
	String carname;
	//�����Ǿ� �ִ�.
	public Car5(String name){ //���� POINT
		carname = name;
	} 
	
}
//�� �ڵ�� public Car5() �������� �ʾƵ� .... �������� �ʾƵ� �����Ϸ��� �ڵ� ������.
//���������� ... �����ڰ� overloading�� �����ڸ� �Ѱ��� ����ٸ�, �����Ϸ��� �ڵ����� default �����ڸ� ������ ����.

//�ڵ����� �̸��� ������ �ڵ����� ����� ���� ����ϰ� �� .... ���赵.

public class Ex15_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car(); //new Car() ��ȣ�� �Լ��� ��ȣ //default constructor
		System.out.println("������");
		Car3 car3 = new Car3();
		System.out.println(car3.carname);
		
		Car3 car4 = new Car3("myCar");
		System.out.println(car4.carname);
		
	}
}