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
	
	//�̸�
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
	
	//�̸�
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
	
	//�̸�
	@Override
	public String toString() {
		return "NoteBook";
	}
}
public class Ex08_Generic_Quiz {

	public static void main(String[] args) {
		// 1. Array ����ؼ� tv, audio, notebook�� ���� �� �ִ� cart �迭�� �����ϰ� ��ǰ�� ��������.
		// 2. ArrayList Generic ����ؼ� cart �迭 ����� ��ǰ�� ��������.
		
		//3. Emp Ŭ���� (kr.or.kosa)
		//ArrayList Generic ����ؼ� ��� 3���� ���弼��.
		
		//3.1 ����� ������ toString() ����������� ���, �̸�, ������ ����ϼ��� (������ for��)
		//3.2 ���� �����ѵ� ������ for���� �ƴϰ� �Ϲ� for���� ����ؼ� ���, �̸�, ������ ����ϼ���.
		
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
		
		
		Generic.add(new Emp(1, "������", "it"));
		Generic.add(new Emp(2, "������2", "it2"));
		Generic.add(new Emp(3, "������3", "it3"));
		
		for(Emp emp : Generic) {
			System.out.println(emp.getEmpno() + " / " + emp.getName() + " / " + emp.getJob());
		}
		
		for(int i = 0 ; i < Generic.size() ; i++) {
			System.out.println(Generic.get(i).getEmpno() + " / " + Generic.get(i).getName() + " / " + Generic.get(i).getJob());
		}
		
		
		List<CopyEmp> clist = new ArrayList<CopyEmp>();
		clist.add(new CopyEmp(100, "�达",1000));
		clist.add(new CopyEmp(200, "�̾�",2000));
		clist.add(new CopyEmp(300, "�ھ�",3000));
		
		
		//1. 200�� ����� �޿��� 6000���� �����ϼ���. (�Ϲ� ������ ���ؼ�)
		
		for(int i=0 ; i<clist.size(); i++) {
			if(clist.get(i).getEmpno()==200)
			{
				clist.get(i).setSal(6000);
			}
		}
		for(CopyEmp emp : clist)
		{
			if(emp.getSal()==300) {
				emp.setName("�ñ��ؾ�");
			}
		}
	}

}
