
public class GradeAnalyzer { // ���O�ŧi

	// �R�A�ܼƫŧi

	// �]�w���׬�10000��length, �Y�W�L����, ��ĳ�O�n�g�@���X�i���}�C��
	static double[] gradelist = new double[10000];// double�}�C �s��Ҧ���J�����Z
	static String[] level = { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D", "F" };// String�}�C
																							// �ΨӦs�񵥲�
	static int Count[] = new int[11];// Count�}�C �s�񵥲Ĺ������Ӽ�
	static int totalCount = 0, average = 0, std = 0;// �R�A�ܼ� : ���Ŀ�J�����Z�Ӽ�,������,�зǮt
	static double sum = 0, squaresum = 0;// �R�A�ܼ�: ���Z�M,���Z������Z������M

	static boolean isValidGrade(double aGrade) {// ���L��kisValidGrade�ŧi
		if (0 <= aGrade && aGrade <= 110)
			return true;
		else
			return false;

	}

	static void addGrade(double aGrade) {// �R�A��kaddGrade �ŧi
		if (isValidGrade(aGrade)) { // �I�sisValidGrade��k
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
				Count[10]++; // �H�W���P�_���Z����

			gradelist[totalCount] = aGrade; // �N���Z�s�Jgradelist[]�}�C
			sum += aGrade; // �p�⦨�Z�M
			totalCount++; // �p�⦨�Z�`��

		}

	}

	public static void analyzeGrades() { // ��kanalyzeGrades()�ŧi

		double tem_average = sum / totalCount; // ���ܼƥΨӼȦs����T��������
		average = (int) Math.round(tem_average); // �N�����ư��|�ˤ��J�ë��O�ഫ

		for (int i = 0; i < totalCount; i++) // for�j��Ψӭp��squaresum(���Z������Z������M)
		{

			squaresum += (gradelist[i] - tem_average) * (gradelist[i] - tem_average);

		}
		double var = squaresum / totalCount; // �Ȯɦs���ܲ���
		std = (int) Math.round(Math.sqrt(var)); // �p��зǮt

	}

	public static String tostring() { // tostring()��k�ŧi
		String output = "You entered " + totalCount
				+ " valid grades from 0 to 110. Invalid grades are ignored!\nThe average = " + average
				+ " with a deviation =" + std + "\n The grade distribution is:";
		for (int i = 0; i <= 10; i++)
			// �N���ĥ[�J��X�r��
			output += "\n" + level[i] + " = " + Count[i];
		return output;// �^�ǿ�X�r���

	}
}
