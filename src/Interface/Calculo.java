package Interface;

public class Calculo {
	public double pit(double a, double b){
		double hipotenusa = 0;
		 hipotenusa = Math.pow(a, 2) + Math.pow(b, 2);
		 hipotenusa = Math.sqrt(hipotenusa);
		return hipotenusa;
	}
}
