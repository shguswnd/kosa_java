package kr.or.kosa;

//����� ����
public class Emp { 
	//Emp��� Ŭ������ ������ Ÿ���̴�(ūŸ��)
	public int number;
	private int empno;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		if(empno < 0) 
		{
			this.empno = 0;
		}
		else
			this.empno = empno;
	}
	
	public void print()
	{
		System.out.println("�����ȣ : " + empno);
	}
}