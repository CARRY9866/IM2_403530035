
/*
 * [A]100
 * [TA's Advise]
 * 1. 程式大致上沒有什麼問題, 只是我覺得宣告為靜態變數有點用的太氾濫了, 這樣對於你在OO的概念是好還是壞呢?
 * 2. 建議寫在你的程式碼內了.
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String args[])// main方法宣告
	{
		int count = 0; // count 用來計算輸入合法成績個數
		while (true) { // while 迴圈 使用者輸入介面GUI設定
			String s = JOptionPane.showInputDialog(null,
					"Please input the next score:(now correct input:" + count + ")");
			if (s.equalsIgnoreCase("q")) // 判斷是否輸入跳出關鍵字
			{
				if (count >= 2)
					break;
				else
					// 判斷是否輸入至少2個有效成績
					JOptionPane.showMessageDialog(null,
							"You did not enter enough grades to analyze.  Please enter at least 2 valid grades ");
			}

			try {
				double d = Double.parseDouble(s);// 將input型別轉換成double
				GradeAnalyzer.addGrade(d); // 呼叫靜態方法GradeAnalyzer.addGrade()並傳入參數d
				count++; // count 用來計算輸入合法成績個數
			} catch (Exception e) // 例外處理
			{
				JOptionPane.showMessageDialog(null, "Please input the correct number");

			}
		}

		GradeAnalyzer.analyzeGrades(); // 呼叫靜態方法GradeAnalyzer.analyzeGrades()
		JOptionPane.showMessageDialog(null, GradeAnalyzer.tostring()); // 呼叫靜態方法GradeAnalyzer.tostring()並以JOptionPane輸出

	}

}
