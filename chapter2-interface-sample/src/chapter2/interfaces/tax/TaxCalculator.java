package chapter2.interfaces.tax;

public class TaxCalculator {

	public static double totalTaxValue(double productPrice, Tax[] taxes) {
		
		double totalValue = 0;
		
		if(taxes == null) {
			// eğer vergi dizisi null ise direkt olarak vergi değeri sıfır olarak dönüyoruz.
			return totalValue;
		}
		
		// foreach döngüsüyle vergileri hesaplayıp toplam bir değer elde ediyoruz.
		for(Tax tax : taxes) {
			
			totalValue += tax.calculate(productPrice);
		}
		
		return totalValue;
	}
	
}
