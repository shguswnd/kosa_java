
class Shape{
	String color = "glod"; //공통속성
	void draw() {
		System.out.println("도형을 그리다.");
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
	  this();를 안쓰고 생성자 Point(x,y); 를 쓰게되면 Public void를 써야됨
	  //Point()를하면 생성자를 받는게 아니라 메소드를 받는듯?
	  public void Point(int i, int j) {
			
	  }
	*/
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/*원을 만드세요 (원의 정의 : 원은 한점과 반지름을 가지고 있다.)
	  1. 원은 도형이다(is ~ a) : shape
	  2. 원은 점을 가지고 있다(has ~ a) : point >> member field
	  3. 원은 반지름을 가지고 있다(특수, 구체) : 
	*/
}
//원의 반지름은 초기값 10을 가진다.
//점의 좌표는 초기값 (10,15) 가진다.
//초기값을 직접 설정할때 반지름과 점을 값을 입력을 받을 수 있다(원이 만들어 질때)
class Circle extends Shape{//상속
	Point point; //포함(부품)
	int r;//특수성
	
	public Circle(){
		this(10, new Point(10,15));
	}
	public Circle(int r, Point point) {
		//System.out.println(r);
		this.r = r;
		this.point = point;
	}
}


//문제2)
/*
 삼각형 클래스를 만드세요.
 
 삼각형은 3개의 점과 색상과 그리고 그리다 기능 가지고 있다.
 
 shape, point
 
 */
/*
 * //70점 + 10 class Triangle extends Shape{ Point x; Point y; Point z;
 * 
 * public Triangle() { this(new Point(0,0), new Point(1,1), new Point(2,2)); //
 * x = new Point(0,0); // y = new Point(1,1); // z = new Point(2,2); } public
 * Triangle(Point x, Point y, Point z) { this.x = x; this.y = y; this.z = z; } }
 */
//구체화, 특수화
//추가적인 기능


//100점짜리 코드
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
//		//반지름, 원값을 내가 입력하고 싶다.
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
