import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

class Bank {
	//Composition�� Ŭ���� ���� ����(composite) ���踦 �ξ��ִ� ��,
	//��, �� Ŭ������ ��������� �ٸ� Ŭ���� Ÿ���� ���� ������ �����ϴ� ���� �ǹ��Ѵ�.
	
	private int totalAccount = 0;
	List<Account> accounts = new ArrayList<Account>();
	

	void addAccount(String accountNo, String name) {
		Account account = new Account(accountNo, name);
		accounts.add(account);
		totalAccount++;
		return;
	}
	
	Account getAccount(String accountNo) {  //getter
		//accountNo�� �Ķ���ͷ� �޾Ƽ� �ش� �Ķ������ ���� ������ ���¸� ã�� ��ȯ
//		Account value = new Account(accountNo, accountNo); //�Ķ���͸� �̷��� �ؾߵǳ�????
		for(Account value1 : accounts) {
			if(value1.getAccountNo().equals(accountNo))
			{
				return value1;
			}
		}
		return null;
	}
	
	List<Account> findAccounts(String name){ //�̸��� ���¸� ã�� �޼ҵ�
		List<Account> nameList = new ArrayList();
		for(Account value : accounts) {
			if(value.getName().equals(name)) {
				//���� �̸�
				nameList.add(value);
			}
		}
		return nameList;
		
	}
	
	List<Account> getAccounts(){ // ��ü���¸�� ��ȯ
		return accounts;
		
	}
	
	int getTotalAccount() {
		//�� ���� ���� ����
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
		//�Ա�
		balance += amount;
	};
	void withdraw(long amount) {
		//���
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
	private String kind; //����(�Ա� �Ǵ� ���)
	private long amount; //�ŷ��ݾ�
	private long balance; //�ܰ�
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
	    System.out.print("�� ���� ���� ");
	    System.out.println(bank.getTotalAccount());
	    
	    System.out.print("\n3333�� ���¹�ȣ�� ���� ���� ");
	    System.out.println(bank.getAccount("3333"));
	    System.out.println("\n***�̸��� hong�� ����� ���� ��ȸ***");
        List<Account> findAccount = bank.findAccounts("hong");
        for(Account a : findAccount) {
            System.out.println(a);
        }
		System.out.println("\n***��ü ���� ��ȸ***");
		System.out.println(bank.getAccounts().toString());
		
		
		
		 //���´� �Ա�, ��� ��ɰ� �ܰ� Ȯ�� ����� �ִ�.
        System.out.println("\n***���¹�ȣ�� 1111�� ���¿� 5���� �Ա�***");
        Account kim = bank.getAccount("1111");
        kim.deposit(50000);
        System.out.println(kim);
        
        System.out.println("\n***���¹�ȣ�� 1111�� ���¿� 2���� ���***");
        kim.withdraw(20000);
        System.out.println(kim);
		
        
        System.out.println("\n***���¹�ȣ�� 1111�� ���¿� 5000�� ���***");
        kim.withdraw(5000);
        System.out.println(kim);
        
        System.out.println("\n***���¹�ȣ�� 1111�� ������ �ܰ� Ȯ���ϱ�***");
        System.out.println("kim ���� \'1111\' ���� �ܾ�: " + kim.getBalance());
        
      //���¿��� �ܾ��� ��ȭ�� ���� �� ���� ����� ���� ��ϵȴ�.
        //����� ���� �ŷ�����, �ŷ��ð�, �Ա�/���, �ݾ�, �ܾ����� �����ȴ�.
        System.out.println("\n***���¹�ȣ�� 1111�� ������ �ŷ����� Ȯ���ϱ�***");
//        ArrayList<Transaction> kimTransaction = kim.getTransactions();
 
        
	}
}