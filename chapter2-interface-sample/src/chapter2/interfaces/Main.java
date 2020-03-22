package chapter2.interfaces;

import chapter2.interfaces.integrator.ClassifiedPaymentIntegrator;
import chapter2.interfaces.integrator.DopingPaymentIntegrator;
import chapter2.interfaces.integrator.PaymentIntegrator;
import chapter2.interfaces.payment.system.AssecoPaymentSystem;
import chapter2.interfaces.payment.system.IyzicoPaymentSystem;
import chapter2.interfaces.payment.system.PaymentProvider;

public class Main {

	public static void main(String[] args) {
		
		
		PaymentProvider iyzicoPaymentProvider = new IyzicoPaymentSystem();
		PaymentProvider assecoPaymentProvider = new AssecoPaymentSystem();
		
		
		PaymentIntegrator classifiedPaymentIntegrator = new ClassifiedPaymentIntegrator(assecoPaymentProvider);
		
		classifiedPaymentIntegrator.makePayment(2000);
		
		
		PaymentIntegrator dopingPaymentIntegrator = new DopingPaymentIntegrator(iyzicoPaymentProvider);
		
		dopingPaymentIntegrator.makePayment(200);
		
	}

}
