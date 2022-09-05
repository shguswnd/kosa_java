
public class Quiz_String {

	public static void main(String[] args) {
		String jumin = "123456-1234567";
		String test;
		String jumsu = jumin.replace("-","");
		int sum=0;
		for(int i=0;i<jumsu.length();i++)
		{
			test = jumsu.substring(i,i+1);
			sum += Integer.parseInt(test);
		}
			
			System.out.println(sum);			
		
			
		String[] split = jumin.replace("-","").split("");
		
		sum = 0;
		
		for(String value:split)
		{
			sum += Integer.parseInt(value);
		}
		System.out.println(sum);
		
		

	}

}
