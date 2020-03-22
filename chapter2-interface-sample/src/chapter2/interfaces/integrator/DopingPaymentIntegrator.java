package chapter2.interfaces.integrator;

import chapter2.interfaces.payment.system.PaymentProvider;

public class DopingPaymentIntegrator implements PaymentIntegrator {

	private PaymentProvider paymentProvider;
	
	
	public DopingPaymentIntegrator(PaymentProvider paymentProvider) {
		this.paymentProvider = paymentProvider;
	}
	
	@Override
	public void makePayment(double totalPrice) {
		
		this.paymentProvider.charge(totalPrice);
	}
}
