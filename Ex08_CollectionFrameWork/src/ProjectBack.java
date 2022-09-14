import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

class Bank {
	//Composition은 클래스 간에 포함(composite) 관계를 맺어주는 것,
	//즉, 한 클래스의 멤버변수로 다른 클래스 타입의 참조 변수를 선언하는 것을 의미한다.
	
	private int totalAccount = 0;
	List<Account> accounts = new ArrayList<Account>();
	

	void addAccount(String accountNo, String name) {
		Account account = new Account(accountNo, name);
		accounts.add(account);
		totalAccount++;
		return;
	}
	
	Account getAccount(String accountNo) {  //getter
		//accountNo를 파라미터로 받아서 해당 파라미터의 값을 가지는 계좌를 찾아 반환
//		Account value = new Account(accountNo, accountNo); //파라미터를 이렇게 해야되나????
		for(Account value1 : accounts) {
			if(value1.getAccountNo().equals(accountNo))
			{
				return value1;
			}
		}
		return null;
	}
	
	List<Account> findAccounts(String name){ //이름의 계좌를 찾는 메소드
		List<Account> nameList = new ArrayList();
		for(Account value : accounts) {
			if(value.getName().equals(name)) {
				//같은 이름
				nameList.add(value);
			}
		}
		return nameList;
		
	}
	
	List<Account> getAccounts(){ // 전체계좌목록 반환
		return accounts;
		
	}
	
	int getTotalAccount() {
		//총 계좌 개수 리턴
		return totalAccount;
	}	
}

class Account{
	
	private String accountNo;
	private String name;
	private long balance = 0;
	
	public Account(String accountNo, String name){
		this.accountNo = accountNo;
		this.name = name;
	}
	
	List<Transaction> t = new ArrayList<Transaction>();
	
	void deposit(long amount) {
		//입금
		balance += amount;
	};
	void withdraw(long amount) {
		//출금
		balance -= amount;
	}
	long getBalance() {
		return balance;
	}

	List<Transaction> getTransactions(){
		
		
		return t;
	}
	
	//getter setter?
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + "]\n";
	}

	
}



class Transaction{

	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
	
	Calendar cal = Calendar.getInstance();
	
	
	public String transactionDate = sdf1.format(cal.getTime());
	public String transactionTime = sdf2.format(cal.getTime());
	private String kind; //구분(입금 또는 출금)
	private long amount; //거래금액
	private long balance; //잔고
}

public class ProjectBack{
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.addAccount("1111", "kim");
	    bank.addAccount("2222", "lee");
	    bank.addAccount("3333", "park");
	    bank.addAccount("4444", "hong");
	    bank.addAccount("5555", "hong");
	    bank.addAccount("6666", "kim");
	    bank.addAccount("7777", "lee");
	    System.out.print("총 계좌 개수 ");
	    System.out.println(bank.getTotalAccount());
	    
	    System.out.print("\n3333이 계좌번호인 계좌 정보 ");
	    System.out.println(bank.getAccount("3333"));
	    System.out.println("\n***이름이 hong인 사람의 계좌 조회***");
        List<Account> findAccount = bank.findAccounts("hong");
        for(Account a : findAccount) {
            System.out.println(a);
        }
		System.out.println("\n***전체 계좌 조회***");
		System.out.println(bank.getAccounts().toString());
		
		
		
		 //계좌는 입금, 출금 기능과 잔고 확인 기능이 있다.
        System.out.println("\n***계좌번호가 1111인 계좌에 5만원 입금***");
        Account kim = bank.getAccount("1111");
        kim.deposit(50000);
        System.out.println(kim);
        
        System.out.println("\n***계좌번호가 1111인 계좌에 2만원 출금***");
        kim.withdraw(20000);
        System.out.println(kim);
		
        
        System.out.println("\n***계좌번호가 1111인 계좌에 5000원 출금***");
        kim.withdraw(5000);
        System.out.println(kim);
        
        System.out.println("\n***계좌번호가 1111인 계좌의 잔고 확인하기***");
        System.out.println("kim 님의 \'1111\' 계좌 잔액: " + kim.getBalance());
        
      //계좌에서 잔액의 변화가 있을 때 마다 입출금 명세에 기록된다.
        //입출금 명세는 거래일자, 거래시간, 입금/출금, 금액, 잔액으로 구성된다.
        System.out.println("\n***계좌번호가 1111인 계좌의 거래내역 확인하기***");
//        ArrayList<Transaction> kimTransaction = kim.getTransactions();
 
        
	}
}