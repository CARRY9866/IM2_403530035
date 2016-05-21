
public class GradeAnalyzer { // 類別宣告

	// 靜態變數宣告

	// 設定長度為10000的length, 若超過的話, 建議是要寫一個擴張的陣列喔
	static double[] gradelist = new double[10000];// double陣列 存放所有輸入的成績
	static String[] level = { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D", "F" };// String陣列
																							// 用來存放等第
	static int Count[] = new int[11];// Count陣列 存放等第對應的個數
	static int totalCount = 0, average = 0, std = 0;// 靜態變數 : 有效輸入的成績個數,平均數,標準差
	static double sum = 0, squaresum = 0;// 靜態變數: 成績和,成績減平均成績之平方和

	static boolean isValidGrade(double aGrade) {// 布林方法isValidGrade宣告
		if (0 <= aGrade && aGrade <= 110)
			return true;
		else
			return false;

	}

	static void addGrade(double aGrade) {// 靜態方法addGrade 宣告
		if (isValidGrade(aGrade)) { // 呼叫isValidGrade方法
			if (aGrade >= 98)
				Count[0]++;
			else if (aGrade >= 92)
				Count[1]++;
			else if (aGrade >= 90)
				Count[2]++;
			else if (aGrade >= 88)
				Count[3]++;
			else if (aGrade >= 82)
				Count[4]++;
			else if (aGrade >= 80)
				Count[5]++;
			else if (aGrade >= 78)
				Count[6]++;
			else if (aGrade >= 72)
				Count[7]++;
			else if (aGrade >= 70)
				Count[8]++;
			else if (aGrade >= 60)
				Count[9]++;
			else
				Count[10]++; // 以上為判斷成績等第

			gradelist[totalCount] = aGrade; // 將成績存入gradelist[]陣列
			sum += aGrade; // 計算成績和
			totalCount++; // 計算成績總數

		}

	}

	public static void analyzeGrades() { // 方法analyzeGrades()宣告

		double tem_average = sum / totalCount; // 此變數用來暫存較精確的平均數
		average = (int) Math.round(tem_average); // 將平均數做四捨五入並型別轉換

		for (int i = 0; i < totalCount; i++) // for迴圈用來計算squaresum(成績減平均成績之平方和)
		{

			squaresum += (gradelist[i] - tem_average) * (gradelist[i] - tem_average);

		}
		double var = squaresum / totalCount; // 暫時存放變異數
		std = (int) Math.round(Math.sqrt(var)); // 計算標準差

	}

	public static String tostring() { // tostring()方法宣告
		String output = "You entered " + totalCount
				+ " valid grades from 0 to 110. Invalid grades are ignored!\nThe average = " + average
				+ " with a deviation =" + std + "\n The grade distribution is:";
		for (int i = 0; i <= 10; i++)
			// 將等第加入輸出字串
			output += "\n" + level[i] + " = " + Count[i];
		return output;// 回傳輸出字串值

	}
}
