package utilis;

public class Math {

	public static int Factorial(int a){
		if (a == 0){
			return 1;
		}
		return a * Factorial(a - 1);
	}
	
	
	public static int FactorialLoop(int a) {
		int number = 1;
		for (int i = 1; i <= a; i++ ){
			number *= 1;
		}
	     return number;
	}
}
