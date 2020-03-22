package chapter2.interfaces.tax;

public class OTVTax implements Tax {

	@Override
	public double calculate(double value) {
		
		return value + value * 0.2;
	}
}
