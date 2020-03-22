package chapter2.interfaces.payment.system;

public class IyzicoPaymentSystem implements PaymentProvider {

	@Override
	public boolean cancelCharge(int chargeId) {
		
		System.out.println("Iyzico system cancelled your " + chargeId + " charge!");
		
		return true;
	}

	@Override
	public int charge(double totalPrice) {
		
		System.out.println("Iyzico system charged ==> " + totalPrice);
		
		return (int)Math.random() * 1000;
	}

	@Override
	public String loadInvoice(int chargeId) {
		
		System.out.println("Your invoice ==> ");
		
		return null;
	}

}
