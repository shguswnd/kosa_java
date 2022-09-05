import java.util.StringTokenizer;

public class Ex06_String_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String concatstr = str.concat(" world");
		boolean bo = str.contains("el");
		System.out.println(bo);
		
		String str2 = "a b c d"; // [a] [] [b] [] [c] [] [d] ...
		System.out.println(str2.length());
		
		String filename = "hello java world";
		System.out.println(filename.indexOf("h"));
		System.out.println(filename.indexOf("java"));
		System.out.println(filename.indexOf("������")); // -1 ���� (�迭���� ���� ����)
		//�Ź��缳���� ���ϴ� �ܾ� �˻� .... ���� ���ϴ� ���ڿ��� ���ԵǾ��ִ��� �ľ��Ҷ� ���� ������?
		
		
		
		if(filename.indexOf("wo") != -1) {
			System.out.println("wo �ܾ �ϳ��� �ִ�");
		}
		System.out.println(filename.lastIndexOf("va")); //�ڿ������� a�� ã�Ƽ� �ش� a�� �տ������� ã�� �迭 �ε��� ���.
		
		//length(), indexOf(), substring(), replace(), split()
		
		String result = "superman";
		System.out.println(result.substring(0)); // index���� �ڿ� �� ���
		System.out.println(result.substring(1, 2)); // index a~(b-1)���� ���.
		
		
		/*
		 * System.out.println(result.replace('s', 'd'));
		 * System.out.println(result.replace(filename, result));
		 */
		
		
		//Quiz
		String filename2 = "home.jpeg"; // �Ǵ� or �� ���ϸ��� h.png, aaaaa.hwp 
		//���⼭ ���ϸ�� Ȯ���ڸ� �и��ؼ� ���.
		
		int index = filename2.lastIndexOf(".");
		
		System.out.println(filename2.substring(0,index));
		System.out.println(filename2.substring(index+1,filename2.length()));
		
		
		
		String str3 = "ABCDADDDDDA";
		String result3 = str3.replace("DDDDD", "������ �ݿ���");
		System.out.println(result3);
		
		result3 = str3.replace("A","a");
		System.out.println(result3);
		
		//ETC
	
		System.out.println("ETC");
		System.out.println(str3.charAt(0));
		System.out.println(str3.charAt(3));
		System.out.println(str3.endsWith("DDDA")); //�ڿ��� �̷��� �������� Ȯ��.
		System.out.println(str3.endsWith("BDDDA"));
		System.out.println(str3.equalsIgnoreCase("aBCDADDDDDa")); //��ҹ��� �������� ���ض�.
		
		
		//Today Point
		String str4 = "���۸�,��Ƽ,�����,������,������";
		String[] namearray = str4.split(",");
		
		for(String value : namearray)
		System.out.println(value);

		
		

		///����ǥ����(���ڵ��� �����ؼ� ��Ģ�� ����� : �� ��Ģ�ϰ� �����͸� ���ؼ� �Ǵ�)
		//�����ȣ : {\d3}-{\d3} >> 12 - 123 (false) , 123*123(false),
		// �� ����ǥ�������� ���ٸ� ���Ͽ� �°� �����ߵ� 111-111(true);
		
		//����ǥ������ ǥ���� ����.(java, javascript, Oracle....���) ���� ǥ������ ���
		// "."�� ����ǥ���� �������̶� �Ʒ��� ����ǥ�������� �ν��ϰ� ����.
		// \\. �̷��� �������.
		//�ڵ���, ������ȣ, �������ּ�, �̸��� ����ǥ������ ���� >> �Է��� ������ ��ȿ�� ����
		//������ ������ ����
		
		
		String str5 = "���۸�.��Ƽ.�����.������.������";
		String[] namearray2 = str4.split("\\.");
		
		for(String value : namearray2)
		System.out.println(value);
		
		
		String filename3 = "kosa.hwp";
		String[] nameArraySplit = filename3.split("\\.");
		
		for(String value : nameArraySplit)
			System.out.println(value);

		
		String str6 = "a/b,c-d.f";
		StringTokenizer sto = new StringTokenizer(str6,"/,-.");  //���ڿ��� Ư�� ������ ���ڵ��� ������ ������ �� �ִ�.
		
		while(sto.hasMoreElements())
		{
			System.out.println(sto.nextToken());
		}
		
		
		//�ͼ���
		
		String str7 = "ȫ          ��            ��";
		//���� >> �������� >> "ȫ�浿"
		
		String str_Array = str7.replace(" ", "");
		
		System.out.println(str_Array);
		
		String str8 = "        ȫ�浿        ";
		
//		System.out.println(">>>>>" + str8 + "<<<<<<<<<<");
		System.out.println(">>"+str8.trim()+"<<<<");
//		System.out.println(">>"+str8.replace(" ", "")+"<<<<");
		
		String str9 = "    ȫ   ��    ��   ";
		
		//System.out.println(">>>>>" + str9.replace(" ", "") + "<<<<<<<<<<");
		System.out.println(">>>>>" + str9.replace(" ", "") + "<<<<<<<<<<");
		
		//************************�������� �Լ��� ����� ��� (method chain ���)
		System.out.println(str9.trim().replace(" ", "").substring(2));
	}

}
