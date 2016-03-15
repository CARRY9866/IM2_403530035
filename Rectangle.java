//403530035 資管二張楷睿
import java.util.Scanner;

/**
 * @author CARRY
 *
 */

public class Rectangle { // 建立物件類別Rectangle

	double height; // 類別物件Rectangle的變數宣告
	double width;
	double x;
	double y;
	double area;
	double perimeter;

	public Rectangle(double h, double w, double y1, double x1) {// 建立Rectangle的建構式
																// 同時設定參數四個double

		height = h;
		width = w;
		y = y1;
		x = x1;

	}

	public void setWidth() { // 方法calculateArea() 宣告
		area = height * width;

	}

	public void setHeight() { // 方法calculatePerimeter() 宣告
		perimeter = (height + width) * 2;
	}

	public String toString() { // 方法toString() 宣告
		return "java.Rectangle[x=" + x + ",y=" + y + ",width=" + width
				+ ",height=" + height + "]" + "\nArea = " + area + "\n"
				+ "Perimeter = " + perimeter;

	}

	public static void main(String[] args) { // main方法宣告

		double h1, w1, y1, x1; // 變數宣告

		Scanner input = new Scanner(System.in); // NEW 一個 Scanner 物件 input
		System.out.println("請輸入第一個長方形的高:");
		h1 = input.nextDouble();
		System.out.println("請輸入第一個長方形的寬:");
		w1 = input.nextDouble();
		System.out.println("請輸入第一個長方形的Y座標:");
		y1 = input.nextDouble();
		System.out.println("請輸入第一個長方形的X座標:"); // 設定使用者輸入第一個長方形
		x1 = input.nextDouble();

		Rectangle rectangle1 = new Rectangle(h1, w1, y1, x1); // new 一個Rectangle
																// 物件 rectangle1

		rectangle1.setWidth();
		rectangle1.setHeight();// rectangle1方法呼叫

		System.out.println("請輸入第二個長方形的高:");
		h1 = input.nextDouble();
		System.out.println("請輸入第二個長方形的寬:");
		w1 = input.nextDouble();
		System.out.println("請輸入第二個長方形的Y座標:");
		y1 = input.nextDouble();
		System.out.println("請輸入第二個長方形的X座標:"); // 設定使用者輸入第二個長方形
		x1 = input.nextDouble();

		Rectangle rectangle2 = new Rectangle(h1, w1, y1, x1);// new 一個Rectangle
																// 物件 rectangle2

		rectangle2.setWidth();
		rectangle2.setHeight();// rectangle2方法呼叫

		System.out.println(rectangle1.toString());
		System.out.println(rectangle2.toString());// 輸出字串

	}

}
