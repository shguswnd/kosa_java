
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * char alp = 'A';
		 * 
		 * while(true) { System.out.println(alp); alp++; if(alp > 'Z') break; }
		 */
		
		int alp = 'A'; //A 65, Z 90

		for(int i=0 ; i<26; i++,alp++)
		{
			System.out.println((char)(alp));
		}
		
	}

}
