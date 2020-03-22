package chapter2.interfaces.integrator;

import chapter2.interfaces.payment.system.PaymentProvider;
import chapter2.interfaces.tax.Tax;
import chapter2.interfaces.tax.TaxCalculator;

public class DopingPaymentIntegrator implements PaymentIntegrator {

	private PaymentProvider paymentProvider;
	
	
	public DopingPaymentIntegrator(PaymentProvider paymentProvider) {
		this.paymentProvider = paymentProvider;
	}
	
	@Override
	public void makePayment(double totalPrice, Tax[] taxes) {
		
		totalPrice += TaxCalculator.totalTaxValue(totalPrice, taxes);
		
		this.paymentProvider.charge(totalPrice);
	}
}
