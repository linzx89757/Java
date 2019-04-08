package banking7;



public class Bank {
	private Customer[] customers;//����ʵ�ִ�ſͻ�
	private int numberOfCustomers;//��¼�ͻ��ĸ���
	
	private  Bank() {
		customers = new Customer[5];
		
	}
	
	private static Bank  bank = new Bank();
	public static Bank getBanking() {
		return  bank;
	}
	
	//��ӿͻ�
	public void addCustomer(String f,String l) {
		Customer cust = new Customer(f,l);
		customers[numberOfCustomers] = cust;
		numberOfCustomers++;
	}
	
	//��ȡ�ͻ�����
	public int getNumOfCustomers() {
		return numberOfCustomers;
	}
	
	//����ָ�������Ŀͻ�
	public Customer getCustomer(int index) {
		
		return customers[index];
			
	}
}
