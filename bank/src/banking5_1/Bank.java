package banking5_1;



public class Bank {
	private Customer[] customers;//����ʵ�ִ�ſͻ�
	private int numberOfCustomers;//��¼�ͻ��ĸ���
	
	public Bank() {
		customers = new Customer[5];
		
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
