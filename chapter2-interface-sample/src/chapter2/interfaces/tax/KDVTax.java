package chapter2.interfaces.tax;

public class KDVTax implements Tax {

	@Override
	public double calculate(double value) {
		
		return value + value * 0.3;
	}
}
