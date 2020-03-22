package chapter2.interfaces.integrator;

import chapter2.interfaces.payment.system.AssecoPaymentSystem;
import chapter2.interfaces.tax.Tax;
import chapter2.interfaces.tax.TaxCalculator;

public class ClassifiedPaymentIntegratorOldVersion implements PaymentIntegrator {

	// Ödeme sistemini değiştirmeye çalıştığınız anda tüm sınıfı değiştirmeniz gerekiyor.
	// Bu istenilen bir durum değildir.
	// Burada sağlam bir soyutlama gerekiyor. Nasıl dönüşüme uğradığını görmek için "ClassifiedPaymentIntegrator" sınıfına bakınız.
	private AssecoPaymentSystem assecoPaymentSystem;
	
	
	public ClassifiedPaymentIntegratorOldVersion() {
		
		this.assecoPaymentSystem = new AssecoPaymentSystem();
	}
	
	public ClassifiedPaymentIntegratorOldVersion(AssecoPaymentSystem assecoPaymentSystem) {
		
		this.assecoPaymentSystem = assecoPaymentSystem;
	}
	
	@Override
	public void makePayment(double totalPrice, Tax[] taxes) {
		
		totalPrice += TaxCalculator.totalTaxValue(totalPrice, taxes);
		
		this.assecoPaymentSystem.charge(totalPrice);
	}
	
}
