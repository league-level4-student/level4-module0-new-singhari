package _03_Intro_to_Enums;

public enum StatesOfMatter {
	SOLID(0), LIQUID(25.55), GAS(100);
	private double celesiusTemp;
	private StatesOfMatter(double d)
	{
		celesiusTemp = d;
	}
	public double convertToFahrenheit(double c) {
		double f = 32;
		f+=(c*9/5);
		return f;
	}
	public double cel() {
		return celesiusTemp;
	}
}
