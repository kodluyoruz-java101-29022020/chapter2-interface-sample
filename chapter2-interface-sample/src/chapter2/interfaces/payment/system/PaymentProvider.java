package chapter2.interfaces.payment.system;

public interface PaymentProvider {

	
	public boolean cancelCharge(int chargeId);
	
	public int charge(double totalPrice);
	
	public String loadInvoice(int chargeId);
	
}
