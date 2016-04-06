
/*
 * [A]100
 * [TA's Advise]
 * 1.在作業裡寫註解是個好習慣, Good JOB!.
 * 2.while裡面去做user input的檢查是個很不錯的方法, 不過建議可以跳出提視窗表示程式終止, 或許檢核條件可以在精確一些, 好比檢查是否<=0.
 * 3.下次可以嘗試在javadoc中寫一些註解!
 * */

import java.util.Scanner;//使用java API

public class EasterTester {// 類別EasterTester 宣告

	public static void main(String[] args) {// main函式宣告

		System.out.println("Please enter the year : ");// 使用者輸入介面
		Scanner input = new Scanner(System.in);

		while (input.hasNextInt())// while迴圈 當使用者輸入時執行
		{
			int year = input.nextInt();
			System.out.println(Easter.caluateEaster(year)); // 呼叫Easter裡的靜態方法caculaterEaster()並print回傳值

		}
	}
}
