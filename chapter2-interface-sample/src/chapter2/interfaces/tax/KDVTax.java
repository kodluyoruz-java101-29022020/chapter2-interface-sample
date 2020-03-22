package chapter2.interfaces.tax;

public class KDVTax implements Tax {

	@Override
	public double calculate(double value) {
		
		return value * 0.3;
	}
}
