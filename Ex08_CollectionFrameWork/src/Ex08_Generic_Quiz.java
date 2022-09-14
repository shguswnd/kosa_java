import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Copies;

import kr.or.kosa.CopyEmp;
import kr.or.kosa.Emp;

class Product{
	int price;
	int bonusPoint;
	//Product(){}
	
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(this.price/10.0);
	}
}

class KtTv extends Product{
	KtTv(){
		super(5000);
	}
	KtTv(int price){
		super(price);
	}
	
	//이름
	@Override
	public String toString() {
		return "KtTv";
	}
}


class Audio extends Product{
	Audio(){
		super(1000);
	}
//	Audio(int price){
//		super(price);
//	}
	
	//이름
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product{
	NoteBook(){
		super(1500);
	}
//	Audio(int price){
//		super(price);
//	}
	
	//이름
	@Override
	public String toString() {
		return "NoteBook";
	}
}
public class Ex08_Generic_Quiz {

	public static void main(String[] args) {
		// 1. Array 사용해서 tv, audio, notebook을 담을 수 있는 cart 배열을 생성하고 제품을 담으세요.
		// 2. ArrayList Generic 사용해서 cart 배열 만들고 제품을 담으세요.
		
		//3. Emp 클래스 (kr.or.kosa)
		//ArrayList Generic 사용해서 사원 3명을 만드세요.
		
		//3.1 사원의 정보를 toString() 사용하지말고 사번, 이름, 직종을 출력하세요 (개선된 for문)
		//3.2 위와 동일한데 개선된 for문이 아니고 일반 for문을 사용해서 사번, 이름, 직종을 출력하세요.
		
		Product[] cart = new Product[3];
		
		cart[0] = new KtTv();
		cart[1] = new Audio();
		cart[2] = new NoteBook();
		
		
		List<Product> pcart = new ArrayList<Product>();
		KtTv tv = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();

		pcart.add(tv);
		pcart.add(audio);
		pcart.add(notebook);
		
		
		for(Product product : pcart) {
			System.out.println(product);
		}

		
		List<Emp> Generic = new ArrayList<Emp>();		
		
		
		Generic.add(new Emp(1, "노현중", "it"));
		Generic.add(new Emp(2, "노현중2", "it2"));
		Generic.add(new Emp(3, "노현중3", "it3"));
		
		for(Emp emp : Generic) {
			System.out.println(emp.getEmpno() + " / " + emp.getName() + " / " + emp.getJob());
		}
		
		for(int i = 0 ; i < Generic.size() ; i++) {
			System.out.println(Generic.get(i).getEmpno() + " / " + Generic.get(i).getName() + " / " + Generic.get(i).getJob());
		}
		
		
		List<CopyEmp> clist = new ArrayList<CopyEmp>();
		clist.add(new CopyEmp(100, "김씨",1000));
		clist.add(new CopyEmp(200, "이씨",2000));
		clist.add(new CopyEmp(300, "박씨",3000));
		
		
		//1. 200번 사원의 급여를 6000으로 수정하세요. (일반 포문을 통해서)
		
		for(int i=0 ; i<clist.size(); i++) {
			if(clist.get(i).getEmpno()==200)
			{
				clist.get(i).setSal(6000);
			}
		}
		for(CopyEmp emp : clist)
		{
			if(emp.getSal()==300) {
				emp.setName("궁금해씨");
			}
		}
	}

}
