package bmi;

public class BmiServiceImpl implements BmiService{

	@Override
	public double calcBmi(BmiDto bmi) {
		
		return bmi.getweight()/bmi.getheight()/bmi.getheight() * 10000;
	}

	

}
