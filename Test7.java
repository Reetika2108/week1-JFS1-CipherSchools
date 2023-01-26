
public class Test7 {

	public static void main(String[] args) {
		Amazon customer = new Amazon();
		float payableAmount = customer.transaction(1000);
		System.out.println("Total payable amount: " + payableAmount);
	}

}
class Amazon {
	float transaction(float amt) {
		GPay gpayObj = new GPay();
		gpayObj.setTxnCharge(0.07f);
		float totalAmount = amt + (amt*gpayObj.getTxnCharge());
		return totalAmount;
	}
}
class GPay {
	private float txnCharge = 0.05f;
	public void setTxnCharge(float newCharge) {
		if(newCharge<=0.05f) {
			System.out.println("Invalid TxnCharge");
			return;
		}
		txnCharge = newCharge;
	}
	public float getTxnCharge() {
		return txnCharge;
	}
}
