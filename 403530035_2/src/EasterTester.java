
/*
 * [A]100
 * [TA's Advise]
 * 1.�b�@�~�̼g���ѬO�Ӧn�ߺD, Good JOB!.
 * 2.while�̭��h��user input���ˬd�O�ӫܤ�������k, ���L��ĳ�i�H���X��������ܵ{���פ�, �γ\�ˮֱ���i�H�b��T�@��, �n���ˬd�O�_<=0.
 * 3.�U���i�H���զbjavadoc���g�@�ǵ���!
 * */

import java.util.Scanner;//�ϥ�java API

public class EasterTester {// ���OEasterTester �ŧi

	public static void main(String[] args) {// main�禡�ŧi

		System.out.println("Please enter the year : ");// �ϥΪ̿�J����
		Scanner input = new Scanner(System.in);

		while (input.hasNextInt())// while�j�� ��ϥΪ̿�J�ɰ���
		{
			int year = input.nextInt();
			System.out.println(Easter.caluateEaster(year)); // �I�sEaster�̪��R�A��kcaculaterEaster()��print�^�ǭ�

		}
	}
}
