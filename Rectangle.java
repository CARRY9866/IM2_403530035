//403530035 ��ޤG�i����
import java.util.Scanner;

/**
 * @author CARRY
 *
 */


public class Rectangle {
	
		private double height;
		private double width;
		private double x;
		private double y;
		private double area ;
		private double perimeter;
		
		public void setheight(double h){
			height = h;
		}
		
		public void setwidth(double w){
			width = w;
		}
		
		public void setx(double x1){
			x = x1;
			
		}
		
		public void sety(double y1){
			y = y1;
		}
		
		public void calculateArea(){
			area = height*width;
			
		}
		
		public void calculatePerimeter(){
			perimeter = (height+width)*2;
		}

		public void printall(){
			System.out.println("java.Rectangle[x="+x+",y="+y+",width="+width+",height="+height+"]");
			System.out.println("Area = "+area+"\n"+"Perimeter = "+perimeter);
		}
		
		
		public static void main(String[] args){
			
			double x1, y1, w1, h1;
			double x2, y2, w2, h2;
			
			Scanner input = new Scanner(System.in);
			System.out.println("�п�J�Ĥ@�Ӫ���Ϊ�X�y��:");
			 x1=input.nextDouble();
			System.out.println("�п�J�Ĥ@�Ӫ���Ϊ�Y�y��:");
			 y1=input.nextDouble(); 
			 System.out.println("�п�J�Ĥ@�Ӫ���Ϊ��e:");
			 w1=input.nextDouble();
			System.out.println("�п�J�Ĥ@�Ӫ���Ϊ���:");
			 h1=input.nextDouble();
			 
			 
			 System.out.println("�п�J�ĤG�Ӫ���Ϊ�X�y��:");
			 x2=input.nextDouble();
			System.out.println("�п�J�ĤG�Ӫ���Ϊ�Y�y��:");
			 y2=input.nextDouble(); 
			 System.out.println("�п�J�ĤG�Ӫ���Ϊ��e:");
			 w2=input.nextDouble();
			System.out.println("�п�J�ĤG�Ӫ���Ϊ���:");
			 h2=input.nextDouble();
			 
			 Rectangle rectangle1 = new Rectangle();
			 Rectangle rectangle2 = new Rectangle();
			 
			 rectangle1.setx(x1);
			 rectangle1.sety(y1);
			 rectangle1.setwidth(w1);
			 rectangle1.setheight(h1);
			 rectangle1.calculateArea();
			 rectangle1.calculatePerimeter();
			 rectangle1.printall();
			 
			 rectangle2.setx(x2);
			 rectangle2.sety(y2);
			 rectangle2.setwidth(w2);
			 rectangle2.setheight(h2);
			 rectangle2.calculateArea();
			 rectangle2.calculatePerimeter();
			 rectangle2.printall();
		}
		
		
}





