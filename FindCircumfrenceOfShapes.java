package payilagam;
import java.util.Scanner;

public class FindAreaOfShapes {

	public static void main(String[] args) {
	FindAreaOfShapes shapes=new FindAreaOfShapes();
	System.out.println("What Shape you want to find Circumfrence ?");
	System.out.println("If its Square press 1");
	System.out.println("If its Rectangle press 2");
	System.out.println("If its Triangle press 3");
	Scanner sc=new Scanner(System.in);
	byte userNeed=sc.nextByte();
	if (userNeed==1){
		System.out.println("You Chose to find the circumfrence and area of the Square. ");
		System.out.println("Please Enter the Side Length Of The Squere");
	float lenth=sc.nextFloat();
	  shapes.square(lenth);
		
	}else if(userNeed==2){
		System.out.println("You Chose to find the circumfrence and area of a Rectangle. ");
		System.out.println("Please Enter the  Length Of The Rectangle");
		float rectangleLength=sc.nextFloat();
		System.out.println("Please Enter the Width of the Rectangle");
		float rectangleWidth=sc.nextFloat();
		shapes.rectangle(rectangleLength, rectangleWidth);
		
	}else if(userNeed==3){
		System.out.println("You Chose to find the circumfrence and area of a Triangle. ");
		System.out.println("Please Enter the  First Length Of The Triangle in cm");
		float firstLenth=sc.nextFloat();
		System.out.println("Please Enter the  Second Length Of The Triangle in cm");
		float secondLenth=sc.nextFloat();
		System.out.println("Please Enter the Theird Lenth Of the Triangle cm");
		float theirdLenth=sc.nextFloat();
		shapes.triangle(firstLenth, secondLenth, theirdLenth);
		
	}
	
	
	
	}
	public void square(float sideLength){
		float areaOfSquare=sideLength*sideLength;
		System.out.println("The Area Of a Square :"+areaOfSquare);
		
	}
	public void rectangle(float lenth,float width){
		float areaOfRectangle=lenth*width;
		System.out.println("The area of the Rectangle :"+areaOfRectangle);
	
	}
    public void triangle(float lenth1,float lenth2, float lenth3){
   
    	float perimeter=lenth1+lenth2+lenth3;
    	System.out.println("The perimeter of the Triangle :"+perimeter);
    }
}
