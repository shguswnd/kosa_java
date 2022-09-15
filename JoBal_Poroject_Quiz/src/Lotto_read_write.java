import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

class Lotto2{
	Set<Integer> lotto;
	String path;
	String targetfile;
	FileReader fr;
	FileWriter fw;
	BufferedWriter bow;
	BufferedReader bor;
	SimpleDateFormat dateformat;
	Date currdaet;
	
	
	
	public Lotto2() {
		lotto = new TreeSet<Integer>();
		path = "C:\\KOSA_IT\\Temp\\lotto.txt";
		targetfile = "lotto.txt";
		dateformat = new SimpleDateFormat("[yyyy≥‚MMø˘dd¿œ HH:MM]");
		currdaet = new Date();	
	}

	void start() {
		for(int i = 0 ; lotto.size() < 6 ; i++) {
			lotto.add((int)(Math.random()*45 + 1));
		}
	}
	void Write() {
		String line = lotto.toString() + dateformat.format(currdaet);
	
//		System.out.println(line);
		try {
			fw = new FileWriter(path,true);
			bow = new BufferedWriter(fw);
			
	
			bow.write(line);
			bow.newLine();
			bow.flush();
			
		} catch (Exception e) {
		}finally {
			try {
				fw.close();
				bow.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	void Read() {
		
		try {
			fr = new FileReader(path);
			bor = new BufferedReader(fr);
			
			String line = "";
			

			while((line = bor.readLine())!= null) {
				System.out.println(line);		
			}
			
		} catch (Exception e) {

		}finally {
			try {
				fr.close();
				bor.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}

public class Lotto_read_write {

	public static void main(String[] args) {
		Lotto2 lotto = new Lotto2();
		lotto.start();
		lotto.Write();
		lotto.Read();
	}
}