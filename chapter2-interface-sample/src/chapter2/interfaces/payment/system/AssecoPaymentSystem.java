package chapter2.interfaces.payment.system;

public class AssecoPaymentSystem implements PaymentProvider {

	@Override
	public boolean cancelCharge(int chargeId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int charge(double totalPrice) {
		
		System.out.println("Asseco system charged ==> " + totalPrice);
		
		return 0;
	}

	@Override
	public String loadInvoice(int chargeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
