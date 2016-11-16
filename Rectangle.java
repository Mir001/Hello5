package Shapes;

public class Rectangle {

	private int hight;
	
	private int lenght;

	public Rectangle(){
		
	}
	
	public int getArea(){
		return this.lenght * this.hight;
	}
	
	public int getLenght(){
		return lenght;
		
	}
	
	
	public int Height(){
		return hight;
	}
	
	public void LenghtHight(int hight, int lenght){
		if(lenght >= 0 && hight>=0) {
			this.hight = hight;
			this.lenght = lenght;
		}
		
	}

	
	
}
