
class test{
    public static void main(String[] args)
    {
    	int jumsu = ((int)(Math.random()*10) + 1)*100;
    	System.out.println("��÷��ȣ : " + jumsu);
    	String msg = "";
    	msg += "������ ������ : " + jumsu + " �̰� ��ǰ�� : ";
    	
    	switch(jumsu) {
    		case 1000:msg+="TV";
    		case 900:msg+=" NoteBook";
    		case 800:msg+=" �����";
    		case 700:msg+=" �ѿ�";
    		case 600:msg+=" ���� ";
    			break;
    		default:msg+=" ĩ��";
    	}
    	System.out.println(msg);

 }
}
/*    	int ran = ((int)(Math.random()* 1000) + 1);
    	String item = "";
    	switch(ran/100)
    	{
    		case 10 :
    			item = "TV , NoteBook , ����� , �ѿ켼Ʈ , ����";
    		break;
    		case 9 :
    			item = "NoteBook , ����� , �ѿ켼Ʈ , ����";
    		break;
    		case 8 :
    			item = "����� , �ѿ켼Ʈ , ����";
    		break;
    		case 7 :
    			item = "�ѿ켼Ʈ , ����";
    		break;
    		case 6 :
    			item = "����";
    		break;
    		default:
    			item = "ĩ��";
    	}
    	System.out.println(ran + "������ " + item +"�� ��÷�Ǿ����ϴ�.");
    }*/



/*
 * �츮�� ��ȭ�� ��ǰ �ý����� ������� �Ѵ�
 * 
 * ��ǰ �ý����� ������ ������ ���� ��ǰ�� �����ϴ� �ý����̴�
 * 
 * ��ǰ ��÷�� 1000 ������ ������
 * 
 * ��ǰ���� TV , NoteBook , ����� , �ѿ켼Ʈ , ����
 * 
 * ��ǰ ��÷�� 900 ������ ������
 * 
 * ��ǰ���� NoteBook , ����� , �ѿ켼Ʈ , ����
 * 
 * ��ǰ ��÷�� 800 ������ ������
 * 
 * ��ǰ���� ����� , �ѿ켼Ʈ , ����
 * 
 * ��ǰ ��÷�� 700 ������ ������
 * 
 * ��ǰ���� �ѿ켼Ʈ , ����
 * 
 * ��ǰ ��÷�� 600 ������ ������
 * 
 * ��ǰ���� ����
 * 
 * �׿� ������ 100 ~ 500 ������ ĩ��
 * 
 * ��ǰ�ý����� ���� ������ 100 ~ 1000 ������ �����Ǿ� �ִ�
 * 
 * ����ڰ� ��ǰ �ý����� ���� �����ϰ� 100 ~ 1000������ ���� ������ �Ǿ� �ֽ��ϴ�.
 */