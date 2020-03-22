package chapter2.interfaces.integrator;

import chapter2.interfaces.payment.system.PaymentProvider;

public class ClassifiedPaymentIntegrator implements PaymentIntegrator {

	private PaymentProvider paymentProvider;
	
	public ClassifiedPaymentIntegrator(PaymentProvider paymentProvider) {
		
		this.paymentProvider = paymentProvider;
	}
	
	@Override
	public void makePayment(double totalPrice) {
		
		this.paymentProvider.charge(totalPrice);
	}
	
}
