package chapter2.interfaces.integrator;

import chapter2.interfaces.tax.Tax;

public interface PaymentIntegrator {

	public void makePayment(double totalPrice, Tax[] taxes);
	
}
