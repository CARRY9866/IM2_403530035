//403530035 �i����
public class Easter {

	// �èS���I�s, �o�O�ťիغc���Ӥw��, �p�G�I�s���ܨϥΪ��Othis()�O�d�r.
	Easter()// �I�s�ۤv
	{
	}

	private static int day, month;// �R�A�ܼƫŧi
	private static int a, b, c, k, p, q, m, n, d, e;

	public static void Gauss_algorithm(int year) {// �R�A��kGauss_algorithm()�ŧi

		a = year % 19;
		b = year % 4;
		c = year % 7;// �H�U���_���`�t��k

		// �j���૬�n�`�N�|���|���ǳ\���t��, ���M�b�o�����רҬO���|���o���D.
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

	// �o�ؤJ�f�禡���g�k�O�ܤ�����, Good JOB!
	public static String caluateEaster(int ayear)// �R�A��kcalculateEaster()�ŧi
	{
		Gauss_algorithm(ayear);// �I�s�����t��k��k
		return "In " + ayear + ",Easter sunday is : month = " + month + " and day = " + day;// �^�ǭ�

	}

}
