/*
	1. 切郊亜 薦因馬澗 奄沙 展脊(獣什奴 展脊 : 据獣展脊) >> 8亜走
	2. 8亜走 奄沙 展脊 [葵聖 煽舌]馬澗 展脊
	3. 収切 > 舛呪 > (製税 舛呪, 0, 丞税舛呪) byte (8bit) -128 ~ 127  ex) byte b = 10;
	 									char 廃庚切研 妊薄馬澗 切戟莫 (慎庚切, 働呪庚切, 因拷) 1byte
	 										 廃越 1切 > 2郊戚闘
	 										 漠税) char (2郊戚闘) : 廃越, 慎庚切, 働呪庚切, 因拷 雌淫蒸戚 2郊戚闘稽 紫遂馬切.
	 										 滴奄拭 雌淫蒸戚 2郊戚闘 >> unicode >> 焼什徹坪球
	 										 
	 										 ex) char c = 'A', char c2 = '亜'
	 									short (c情嬢 硲発失)
	 									int (-21 ~ 21 常 舛呪 : 4郊戚闘) *** 舛呪税 奄沙 展脊 ***
	 									loag(8byte)
		   > 叔呪(採疑社呪繊) : 			float (4byte)
	 									double(8byte) >> 舛腔亀亜 float 左陥 株陥(妊薄鞠澗 呪税 骨是亜 滴陥) *** 叔呪税 奄沙展脊 ***
		   轄軒 > 凧, 暗憎 > true, flase	boolean
	
	
** 庚切伸税 妊薄 ** 
String name = "" 紫遂 >> String 精 鎧舌 適掘什 (凧繕 展脊) 据掘澗 String str = new String()
汝社澗 葵展脊 坦軍 紫遂馬切.

切郊展脊
1. 葵展脊 : 8亜走 奄沙 > int i = 100; int j = 200;
2. 凧繕展脊(爽社葵) : 適掘什, 壕伸 : 痕呪拭 葵戚 煽舌鞠澗 依戚 焼艦虞 爽社葵戚 煽舌 ref type

 */

//class == 竺域亀 == Data Type

class Car2{
	//Car2澗 汽戚斗 展脊, Car2竺域亀 戚陥 >> 姥端鉢 >> 五乞軒 臣顕.(new)
	String color;
	int window;
}

public class Ex04_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = new String("asd");
//		System.out.print(str);
		String str = "畠掩疑";
		int age = 100;
		
		Car2 c; //c澗 main 敗呪 照拭 赤澗 走蝕 痕呪戚陥.
		c = new Car2(); // 走蝕痕呪 段奄鉢 叔楳 災亜管.
		//c虞澗 痕呪税 段奄鉢 >> 爽社葵聖 亜走惟 馬澗依 >> new 尻至切研 搭背辞 五乞軒拭 拝雁 爽社.
		
		System.out.print(c);
		
		
		Car2 c2 = new Car2();
		
		c2.window = 100;
		c2.color = "gold";
		
		int i = 10;
		int j;
		j = 20;
		
		int k;
		k = j; //point (葵拝雁 j 痕呪亜 亜走澗 葵聖 k拭惟 拝雁)
		System.out.println("k : " + k); //20
		k = 300;
		System.out.println("k : " + k);
		System.out.println("j葵精 痕発 蒸陥 : " + j);
		
//		int p, q, g; //疏焼馬走 省製.
		//戚訓 井酔澗 Array : int[] arr = new int[3];
		
		//int (-21常 ~ 21常)
		int p = 100000000;
//		int p2 = 10000000000;
		//The literal 10000000000 of type int is out range
		//鯵降切亜 送羨 脊径廃 葵 ( 軒斗確(赤澗益企稽)葵 舛呪葵精 int虞澗 益県拭 眼焼辞 坦軒廃陥.)
		//4郊戚闘 益県昔汽, 脊径廃 壕伸葵聖 角嬢 獄顕.
		//1. 背衣号狛
		//long p3 = 10000000000L;
		//long 展脊生稽 郊戚闘潅軒壱 痕呪葵亀 莫縦拭 限惟 L聖 細昔陥.
		//聡 軒斗群葵聖 long 益県生稽 眼焼辞 拝雁.
		
		long l = 100;
		//拙精 展脊葵戚 笛 展脊拭 隔澗依精 庚薦亜 照喫. 悪薦 莫痕発 獣鉄.

		
//		int p2 = 10000000000L;
		// 軒斗群 葵精 戚薦 庚薦亜 蒸走幻 汽戚斗展脊戚 戚賎 庚薦亜 吉陥.

		int p2 = (int) 10000000000L;
		//蝶什特 >>展脊 痕発
		//是坦軍 拝 井酔 蟹勧 交税 蟹袴走 汽戚斗亜 煽舌鞠糠稽 汽戚斗 謝叔喫.
		
		
		System.out.print(p2);
		
		
//		char 2byte 舛呪葵
//		廃庚切研 妊薄馬奄 是背辞 幻窮 切戟莫.
//		慎庚切 働呪庚切 因拷 廃越猿走亀 廃庚切稽 妊薄馬形壱敗.
//		庚切伸 (庚切税 増杯) : "けいしけいし" String name = "as";
// 		庚切 (廃庚切) : 'け'	char ch = 'a'

		char single = '亜';
		System.out.println(single);
		char s = 'A';
		System.out.println(single);
		
		//char 舛呪 展脊
		//char 庚切研 煽舌馬走幻 鎧採旋生稽 舛呪葵聖 亜走壱 赤製.
		//舛呪葵精 焼什徹 坪球妊研 奄鋼生稽 紫遂.
		//舛呪 硲発
		
		
		int intch = 'A';
		// 鎧採旋生稽 切疑 莫痕発戚 析嬢蟹辞.... 章獣旋(幸獣旋)
		char ch2 = 'a';
		System.out.println(ch2);
		int intch2 = (int)ch2; //鎧採旋生稽 坦軒鞠走幻 ... casting 送羨坦軒.
		
		System.out.println(intch2);
		
		int intch3 = 65;
		char ch3 = (char)intch3;
		System.out.println(ch3);
		
		//紗走源切 (拝雁拭 赤嬢, 葵聖 左走源壱 益葵聖 眼壱赤澗 展脊聖 左切)
		//誤獣旋 莫痕発引 章獣旋 莫痕発 糎仙.
		//悪薦, 誤獣旋 莫痕発
		
		/*
		 Today point
		 1. 拝雁拭辞 痕呪亜 亜走壱 赤澗 葵聖 左走源壱 痕呪税 展脊聖 左切
		 2. 痕呪税 展脊 滴奄研 溌昔馬切
		 3. 笛展脊拭澗 拙精 展脊聖 葵聖 隔聖呪 赤陥.
		 4. 拙精 展脊拭澗 笛 展脊聖 隔壱粛陥檎 悪薦稽 (casting)
		 奪績精 酔軒亜.
		 char << int 悪薦稽 char << (char)int 汽戚斗 謝叔 降持 亜管. 
		 int << char 鎧採旋生稽 陳督析君亜 庁箭馬惟 int << (int)char 坦軒敗.
		 */
		
		//String 庚切伸聖 眼聖 呪 赤澗 展脊
		//床澗狛 : int, double 坦軍 紫遂.
		
		
		String name = "hello world";
		
		System.out.println(name);
		
		String name2 = name + "号亜号亜";
		
		System.out.println(name2);
		//syso ctrl+Space
		
		// + >> 至綬尻至, 衣杯 尻至
		//tip) Oracle 汽戚斗今戚什(情嬢) > + 至綬尻至, || 衣杯尻至切 (ex '照括' ||'号亜')
		
		//tip) 切郊拭辞 働呪庚切 坦軒.
		//戚什追戚覗庚切 : 働舛庚切 蒋拭 \ 細戚奄.
		char sing ='\''; // \搭背辞 ' 汽戚斗績聖 妊薄
		
		System.out.println(sing);
		
		String test1 = "畠\"掩\"疑";
		System.out.println(test1);
		
		String str3 = "1000";
		String str4 = "10";
		String result = str3 + str4;
		
		System.out.println(result);
		
		
		String path = "C:\\Temp";
		System.out.println(path);
		
		//叔呪莫 展脊 (採疑社呪繊)
		//float 4byte
		//double 8byte //叔呪 軒斗群 奄沙葵精 double戚陥.
		
		float f = 3.14f;
		//軒斗群 葵戚 奄沙 double戚奄 凶庚拭
		// float f = 3.14; 稽澗 庚薦亜 害
		// 葵戚 拙生檎 雌淫戚 蒸走幻 戚訓杏 是背 double稽 床澗惟 限製.
		
//		float f = 3.14; //薄誤廃 識澱(眼聖 益県聖 滴惟); > double稽 郊嘩.
		
		
		byte q = (byte)129;
		System.out.println();
		
	}
}