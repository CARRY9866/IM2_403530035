
/*
 * [A]100
 * [TA's Advise]
 * 1. �{���j�P�W�S��������D, �u�O��ı�o�ŧi���R�A�ܼƦ��I�Ϊ��ӥ��ݤF, �o�˹��A�bOO�������O�n�٬O�a�O?
 * 2. ��ĳ�g�b�A���{���X���F.
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String args[])// main��k�ŧi
	{
		int count = 0; // count �Ψӭp���J�X�k���Z�Ӽ�
		while (true) { // while �j�� �ϥΪ̿�J����GUI�]�w
			String s = JOptionPane.showInputDialog(null,
					"Please input the next score:(now correct input:" + count + ")");
			if (s.equalsIgnoreCase("q")) // �P�_�O�_��J���X����r
			{
				if (count >= 2)
					break;
				else
					// �P�_�O�_��J�ܤ�2�Ӧ��Ħ��Z
					JOptionPane.showMessageDialog(null,
							"You did not enter enough grades to analyze.  Please enter at least 2 valid grades ");
			}

			try {
				double d = Double.parseDouble(s);// �Ninput���O�ഫ��double
				GradeAnalyzer.addGrade(d); // �I�s�R�A��kGradeAnalyzer.addGrade()�öǤJ�Ѽ�d
				count++; // count �Ψӭp���J�X�k���Z�Ӽ�
			} catch (Exception e) // �ҥ~�B�z
			{
				JOptionPane.showMessageDialog(null, "Please input the correct number");

			}
		}

		GradeAnalyzer.analyzeGrades(); // �I�s�R�A��kGradeAnalyzer.analyzeGrades()
		JOptionPane.showMessageDialog(null, GradeAnalyzer.tostring()); // �I�s�R�A��kGradeAnalyzer.tostring()�åHJOptionPane��X

	}

}
