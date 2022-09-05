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
		System.out.println(filename.indexOf("개폭망")); // -1 리턴 (배열에서 값이 없다)
		//신문사설에서 원하는 단어 검색 .... 내가 원하는 문자열이 포함되어있는지 파악할때 쓰면 좋을듯?
		
		
		
		if(filename.indexOf("wo") != -1) {
			System.out.println("wo 단어가 하나라도 있다");
		}
		System.out.println(filename.lastIndexOf("va")); //뒤에서부터 a를 찾아서 해당 a를 앞에서부터 찾아 배열 인덱스 출력.
		
		//length(), indexOf(), substring(), replace(), split()
		
		String result = "superman";
		System.out.println(result.substring(0)); // index부터 뒤에 쫙 출력
		System.out.println(result.substring(1, 2)); // index a~(b-1)까지 출력.
		
		
		/*
		 * System.out.println(result.replace('s', 'd'));
		 * System.out.println(result.replace(filename, result));
		 */
		
		
		//Quiz
		String filename2 = "home.jpeg"; // 또는 or 이 파일명이 h.png, aaaaa.hwp 
		//여기서 파일명과 확장자를 분리해서 출력.
		
		int index = filename2.lastIndexOf(".");
		
		System.out.println(filename2.substring(0,index));
		System.out.println(filename2.substring(index+1,filename2.length()));
		
		
		
		String str3 = "ABCDADDDDDA";
		String result3 = str3.replace("DDDDD", "오늘은 금요일");
		System.out.println(result3);
		
		result3 = str3.replace("A","a");
		System.out.println(result3);
		
		//ETC
	
		System.out.println("ETC");
		System.out.println(str3.charAt(0));
		System.out.println(str3.charAt(3));
		System.out.println(str3.endsWith("DDDA")); //뒤에가 이렇게 끝나는지 확인.
		System.out.println(str3.endsWith("BDDDA"));
		System.out.println(str3.equalsIgnoreCase("aBCDADDDDDa")); //대소문자 구별없이 비교해라.
		
		
		//Today Point
		String str4 = "슈퍼맨,팬티,노랑색,우하하,하하하";
		String[] namearray = str4.split(",");
		
		for(String value : namearray)
		System.out.println(value);

		
		

		///정규표현식(문자들을 조합해서 규칙을 만들고 : 그 규칙하고 데이터를 비교해서 판단)
		//우편번호 : {\d3}-{\d3} >> 12 - 123 (false) , 123*123(false),
		// 위 정규표현식으로 갔다면 패턴에 맞게 만들어야됨 111-111(true);
		
		//정규표현식은 표준을 따라감.(java, javascript, Oracle....등등) 전부 표준으로 사용
		// "."은 정규표현식 데이터이라 아래는 정규표현식으로 인식하고 있음.
		// \\. 이렇게 사용하자.
		//핸드폰, 차량번호, 도메인주소, 이메일 정규표현으로 구현 >> 입력한 데이터 유효성 검증
		//다음주 과제로 제출
		
		
		String str5 = "슈퍼맨.팬티.노랑색.우하하.하하하";
		String[] namearray2 = str4.split("\\.");
		
		for(String value : namearray2)
		System.out.println(value);
		
		
		String filename3 = "kosa.hwp";
		String[] nameArraySplit = filename3.split("\\.");
		
		for(String value : nameArraySplit)
			System.out.println(value);

		
		String str6 = "a/b,c-d.f";
		StringTokenizer sto = new StringTokenizer(str6,"/,-.");  //문자열의 특수 구분할 문자들을 여러개 구분할 수 있다.
		
		while(sto.hasMoreElements())
		{
			System.out.println(sto.nextToken());
		}
		
		
		//넌센스
		
		String str7 = "홍          길            동";
		//저장 >> 공색제거 >> "홍길동"
		
		String str_Array = str7.replace(" ", "");
		
		System.out.println(str_Array);
		
		String str8 = "        홍길동        ";
		
//		System.out.println(">>>>>" + str8 + "<<<<<<<<<<");
		System.out.println(">>"+str8.trim()+"<<<<");
//		System.out.println(">>"+str8.replace(" ", "")+"<<<<");
		
		String str9 = "    홍   길    동   ";
		
		//System.out.println(">>>>>" + str9.replace(" ", "") + "<<<<<<<<<<");
		System.out.println(">>>>>" + str9.replace(" ", "") + "<<<<<<<<<<");
		
		//************************여러개의 함수를 사용할 경우 (method chain 기법)
		System.out.println(str9.trim().replace(" ", "").substring(2));
	}

}
