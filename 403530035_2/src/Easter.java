//403530035 張楷睿
public class Easter {

	// 並沒有呼叫, 這是空白建構式而已喔, 如果呼叫的話使用的是this()保留字.
	Easter()// 呼叫自己
	{
	}

	private static int day, month;// 靜態變數宣告
	private static int a, b, c, k, p, q, m, n, d, e;

	public static void Gauss_algorithm(int year) {// 靜態方法Gauss_algorithm()宣告

		a = year % 19;
		b = year % 4;
		c = year % 7;// 以下為復活節演算法

		// 強制轉型要注意會不會有些許落差喔, 雖然在這次的案例是不會有這問題.
		k = (int) Math.floor(year / 100);
		p = (int) Math.floor((13 + 8 * k) / 25);
		q = (int) Math.floor(k / 4);

		m = (15 - p + k - q) % 30;
		n = (4 + k - q) % 7;
		d = (19 * a + m) % 30;
		e = (2 * b + 4 * c + 6 * d + n) % 7;

		if (d == 29 && e == 6) {
			day = 19;
			month = 4;
		} else if (d == 28 && e == 6 && (11 * m + 11) % 30 < 19) {
			day = 18;
			month = 4;
		} else if (22 + d + e <= 31) {
			day = 22 + d + e;
			month = 3;
		} else {
			day = d + e - 9;
			month = 4;
		}
	}

	// 這種入口函式的寫法是很不錯的, Good JOB!
	public static String caluateEaster(int ayear)// 靜態方法calculateEaster()宣告
	{
		Gauss_algorithm(ayear);// 呼叫高斯演算法方法
		return "In " + ayear + ",Easter sunday is : month = " + month + " and day = " + day;// 回傳值

	}

}
