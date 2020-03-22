package chapter2.interfaces;

import chapter2.interfaces.integrator.ClassifiedPaymentIntegrator;
import chapter2.interfaces.integrator.DopingPaymentIntegrator;
import chapter2.interfaces.integrator.PaymentIntegrator;
import chapter2.interfaces.payment.system.AssecoPaymentSystem;
import chapter2.interfaces.payment.system.IyzicoPaymentSystem;
import chapter2.interfaces.payment.system.PaymentProvider;
import chapter2.interfaces.tax.KDVTax;
import chapter2.interfaces.tax.OTVTax;
import chapter2.interfaces.tax.Tax;

public class Main {

	public static void main(String[] args) {
		
		
		PaymentProvider iyzicoPaymentProvider = new IyzicoPaymentSystem();
		PaymentProvider assecoPaymentProvider = new AssecoPaymentSystem();
		
		
		Tax[] taxesForClassified = { new OTVTax(), new KDVTax() };
		
		PaymentIntegrator classifiedPaymentIntegrator = new ClassifiedPaymentIntegrator(assecoPaymentProvider);
		
		classifiedPaymentIntegrator.makePayment(2000, taxesForClassified);
		
		
		
		Tax[] taxesForDoping = { new KDVTax() };
		
		PaymentIntegrator dopingPaymentIntegrator = new DopingPaymentIntegrator(iyzicoPaymentProvider);
		
		dopingPaymentIntegrator.makePayment(200, taxesForDoping);
		
	}

}
