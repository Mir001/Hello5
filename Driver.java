package Shapes;
import Shapes.Rectangle;
import Shapes.Squere;
import utilis.Math;

public class Driver {

public static void main(String[]args){
   
	Squere S = new Squere();
	S.setLenght(100);
	int SArea = S.getArea();
	
	Rectangle Rec = new Rectangle();
		Rec.LenghtHight(50,80);
		int RecArea = Rec.getArea();
		
		System.out.println(SArea);
	    System.out.println(RecArea);
	    
	    
	double Answer = 15.6;
	System.out.println(Math.Factorial((int) Answer));
	System.out.println(Math.FactorialLoop((int)Answer));
}
}
