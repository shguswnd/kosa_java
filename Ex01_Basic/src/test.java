
class test{
    public static void main(String[] args)
    {
    	int jumsu = ((int)(Math.random()*10) + 1)*100;
    	System.out.println("추첨번호 : " + jumsu);
    	String msg = "";
    	msg += "고객님의 점수는 : " + jumsu + " 이고 상품은 : ";
    	
    	switch(jumsu) {
    		case 1000:msg+="TV";
    		case 900:msg+=" NoteBook";
    		case 800:msg+=" 냉장고";
    		case 700:msg+=" 한우";
    		case 600:msg+=" 휴지 ";
    			break;
    		default:msg+=" 칫솔";
    	}
    	System.out.println(msg);

 }
}
/*    	int ran = ((int)(Math.random()* 1000) + 1);
    	String item = "";
    	switch(ran/100)
    	{
    		case 10 :
    			item = "TV , NoteBook , 냉장고 , 한우세트 , 휴지";
    		break;
    		case 9 :
    			item = "NoteBook , 냉장고 , 한우세트 , 휴지";
    		break;
    		case 8 :
    			item = "냉장고 , 한우세트 , 휴지";
    		break;
    		case 7 :
    			item = "한우세트 , 휴지";
    		break;
    		case 6 :
    			item = "휴지";
    		break;
    		default:
    			item = "칫솔";
    	}
    	System.out.println(ran + "점으로 " + item +"이 당첨되었습니다.");
    }*/



/*
 * 우리는 백화점 경품 시스템을 만들려고 한다
 * 
 * 경품 시스템은 나오는 점수에 따라 경품을 지급하는 시스템이다
 * 
 * 경품 추첨시 1000 점수가 나오면
 * 
 * 경품으로 TV , NoteBook , 냉장고 , 한우세트 , 휴지
 * 
 * 경품 추첨시 900 점수가 나오면
 * 
 * 경품으로 NoteBook , 냉장고 , 한우세트 , 휴지
 * 
 * 경품 추첨시 800 점수가 나오면
 * 
 * 경품으로 냉장고 , 한우세트 , 휴지
 * 
 * 경품 추첨시 700 점수가 나오면
 * 
 * 경품으로 한우세트 , 휴지
 * 
 * 경품 추첨시 600 점수가 나오면
 * 
 * 경품으로 휴지
 * 
 * 그외 점수는 100 ~ 500 까지는 칫솔
 * 
 * 경품시스템의 점수 범위는 100 ~ 1000 점까지 한정되어 있다
 * 
 * 사용자가 경품 시스템을 사용시 랜덤하게 100 ~ 1000까지의 값이 나오게 되어 있습니다.
 */