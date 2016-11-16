package Shapes;

public class Squere {
	
  private int lenght;
 
  public Squere(){
	  
  }

  public int getArea(){ 
	 return this.getLenght() * this.getLenght();
 }
  
  public int getLenght(){
	  return lenght;
  }

  public void setLenght(int lenght){
	  if(lenght >= 0) {
		  this.lenght = lenght;
	  }
  }
}






