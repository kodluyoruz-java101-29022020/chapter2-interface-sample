package chapter2.interfaces.integrator;

import chapter2.interfaces.payment.system.IyzicoPaymentSystem;
import chapter2.interfaces.tax.Tax;
import chapter2.interfaces.tax.TaxCalculator;

public class DopingPaymentIntegratorOldVersion implements PaymentIntegrator {

	// Ödeme sistemini değiştirmeye çalıştığınız anda tüm sınıfı değiştirmeniz gerekiyor.
	// Bu istenilen bir durum değildir.
	// Burada sağlam bir soyutlama gerekiyor. Nasıl dönüşüme uğradığını görmek için "DopingPaymentIntegrator" sınıfına bakınız.

	private IyzicoPaymentSystem iyzicoPaymentSystem;
	
	
	public DopingPaymentIntegratorOldVersion() {
		this.iyzicoPaymentSystem = new IyzicoPaymentSystem();
	}
	
	public DopingPaymentIntegratorOldVersion(IyzicoPaymentSystem iyzicoPaymentSystem) {
		this.iyzicoPaymentSystem = iyzicoPaymentSystem;
	}
	
	@Override
	public void makePayment(double totalPrice, Tax[] taxes) {
		
		totalPrice += TaxCalculator.totalTaxValue(totalPrice, taxes);
		
		this.iyzicoPaymentSystem.charge(totalPrice);
	}
}
