interface olaCustomer {
	void bookcab();

	void ride();

	void vrooom();

	void cancelcab();

	void signin();

	void signup();
}

interface olaDriver {
	void acceptbooking();

	void rejectbooking();

	void setstatus();

	void getmycommission();

	void callcustomer();
}

interface olaOwner {
	void getrevenue();

	void addDriver();

	void changedriver();
}

public class Abstraction implements olaCustomer, olaDriver, olaOwner {

	public static void main(String[] args) {
		olaOwner owner = new Abstraction(); // creating object of interface
        owner.getrevenue();
	}

	@Override
	public void getrevenue() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDriver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changedriver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptbooking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rejectbooking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setstatus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getmycommission() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void callcustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bookcab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ride() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vrooom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelcab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void signin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void signup() {
		// TODO Auto-generated method stub
		
	}

}
