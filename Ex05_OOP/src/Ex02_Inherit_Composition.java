
class Shape{
	String color = "glod"; //����Ӽ�
	void draw() {
		System.out.println("������ �׸���.");
	}
}

class Point{
	int x;
	int y;
	public Point(){
		this(1,1);
//		Point(1,1);
	}
	/*
	  this();�� �Ⱦ��� ������ Point(x,y); �� ���ԵǸ� Public void�� ��ߵ�
	  //Point()���ϸ� �����ڸ� �޴°� �ƴ϶� �޼ҵ带 �޴µ�?
	  public void Point(int i, int j) {
			
	  }
	*/
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/*���� ���弼�� (���� ���� : ���� ������ �������� ������ �ִ�.)
	  1. ���� �����̴�(is ~ a) : shape
	  2. ���� ���� ������ �ִ�(has ~ a) : point >> member field
	  3. ���� �������� ������ �ִ�(Ư��, ��ü) : 
	*/
}
//���� �������� �ʱⰪ 10�� ������.
//���� ��ǥ�� �ʱⰪ (10,15) ������.
//�ʱⰪ�� ���� �����Ҷ� �������� ���� ���� �Է��� ���� �� �ִ�(���� ����� ����)
class Circle extends Shape{//���
	Point point; //����(��ǰ)
	int r;//Ư����
	
	public Circle(){
		this(10, new Point(10,15));
	}
	public Circle(int r, Point point) {
		//System.out.println(r);
		this.r = r;
		this.point = point;
	}
}


//����2)
/*
 �ﰢ�� Ŭ������ ���弼��.
 
 �ﰢ���� 3���� ���� ����� �׸��� �׸��� ��� ������ �ִ�.
 
 shape, point
 
 */
/*
 * //70�� + 10 class Triangle extends Shape{ Point x; Point y; Point z;
 * 
 * public Triangle() { this(new Point(0,0), new Point(1,1), new Point(2,2)); //
 * x = new Point(0,0); // y = new Point(1,1); // z = new Point(2,2); } public
 * Triangle(Point x, Point y, Point z) { this.x = x; this.y = y; this.z = z; } }
 */
//��üȭ, Ư��ȭ
//�߰����� ���


//100��¥�� �ڵ�
class Triangle extends Point{
	Point p[];
	public Triangle() {
		this(new Point[] {new Point(10,20), new Point(30,40), new Point(50,60)});
	}
	public Triangle(Point[] p) {
		this.p = p;
	}
	void trianglePoint() {
		for(Point point : this.p) {
			System.out.printf("x :(%d,%d)\t",point.x , point.y);
		}
		/*
		System.out.printf("x :(%d,%d)\t",x.x , x.y);
		System.out.printf("y :(%d,%d)\t",y.x , y.y);
		System.out.printf("z :(%d,%d)\t",z.x , z.y);
		System.out.println();
		*/
	}
	
}
public class Ex02_Inherit_Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Circle circle = new Circle();
//		System.out.println(circle.r);
//		System.out.println(circle.color);
//		System.out.println(circle.point.x);
//		System.out.println(circle.point.y);
//		circle.draw();
//		//������, ������ ���� �Է��ϰ� �ʹ�.
//		Circle circle2 = new Circle(3, new Point(10,10));
//		System.out.println(circle2.r);
//		System.out.println(circle2.color);
//		System.out.println(circle2.point.x);
//		System.out.println(circle2.point.y);
//		circle2.draw();
		
	Triangle tri3 = new Triangle(new Point[] {new Point(10,20), new Point(20,50), new Point(40,60)});
	//Point[] parray = new Point[] {new Point(10,20), new Point(20,50), new Point(40,60)}
	//Triangle2 tri3 = new Triangle
	}

}
