//403530035 資管二張楷睿
import java.util.Scanner;

/**
 * @author CARRY
 *
 */


public class Rectangle { 							//建立物件類別Rectangle	
	
		private double height;						//類別物件Rectangle的變數宣告
		private double width;
		private double x;
		private double y;
		private double area ;
		private double perimeter;
		
		public void setheight(double h){ 				//方法setheight 宣告
			
			height = h;
		}
		
		public void setwidth(double w){ 			 		//方法setwidth 宣告
			width = w;
		}
		
		public void setx(double x1)					 //方法setx 宣告
			x = x1;
			
		}
		
		public void sety(double y1){					 //方法sety 宣告
			y = y1;
		}
		
		public void calculateArea(){  					 //方法calculateArea() 宣告
			area = height*width;
			
		}
		
		public void calculatePerimeter()				 //方法calculatePerimeter() 宣告
			perimeter = (height+width)*2;
		}

		public void printall(){						//方法printall() 宣告
			System.out.println("java.Rectangle[x="+x+",y="+y+",width="+width+",height="+height+"]");
			System.out.println("Area = "+area+"\n"+"Perimeter = "+perimeter);
		}
		
		
		public static void main(String[] args){				//main方法宣告
			
			double x1, y1, w1, h1;					//變數宣告
			double x2, y2, w2, h2;
			
			Scanner input = new Scanner(System.in);  		//NEW 一個 Scanner 物件 input
			System.out.println("請輸入第一個長方形的X座標:");	//設定使用者輸入第一個長方形
			 x1=input.nextDouble();
			System.out.println("請輸入第一個長方形的Y座標:");
			 y1=input.nextDouble(); 
			 System.out.println("請輸入第一個長方形的寬:");
			 w1=input.nextDouble();
			System.out.println("請輸入第一個長方形的高:");
			 h1=input.nextDouble();
			 
			 
			 System.out.println("請輸入第二個長方形的X座標:");		//設定使用者輸入第二個長方形
			 x2=input.nextDouble();
			System.out.println("請輸入第二個長方形的Y座標:");
			 y2=input.nextDouble(); 
			 System.out.println("請輸入第二個長方形的寬:");
			 w2=input.nextDouble();
			System.out.println("請輸入第二個長方形的高:");
			 h2=input.nextDouble();
			 
			 Rectangle rectangle1 = new Rectangle();		 //new 一個Rectangle 物件 rectangle1	
			 Rectangle rectangle2 = new Rectangle(); 		 //new 一個Rectangle 物件 rectangle2
			 
			 rectangle1.setx(x1);				  	 //rectangle1 的方法呼叫
			 rectangle1.sety(y1);
			 rectangle1.setwidth(w1);
			 rectangle1.setheight(h1);
			 rectangle1.calculateArea();
			 rectangle1.calculatePerimeter();
			 rectangle1.printall();
			 
			 rectangle2.setx(x2);				  	 //rectangle2 的方法呼叫
			 rectangle2.sety(y2);
			 rectangle2.setwidth(w2);
			 rectangle2.setheight(h2);
			 rectangle2.calculateArea();
			 rectangle2.calculatePerimeter();
			 rectangle2.printall();
		}
		
		
}





