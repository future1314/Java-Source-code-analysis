package common_class;

import java.util.Calendar;

public class CalenderDemo {

	public static void main(String args[]) {
		Calendar c2 = Calendar.getInstance();
		// ���
		int year = c2.get(Calendar.YEAR);
		// �·�
		int month = c2.get(Calendar.MONTH) + 1;
		// ����
		int date = c2.get(Calendar.DATE);
		// Сʱ
		int hour = c2.get(Calendar.HOUR_OF_DAY);
		// ����
		int minute = c2.get(Calendar.MINUTE);
		// ��
		int second = c2.get(Calendar.SECOND);
		// ���ڼ�
		int day = c2.get(Calendar.DAY_OF_WEEK);
		System.out.println("��ݣ�" + year);
		System.out.println("�·ݣ�" + month);
		System.out.println("���ڣ�" + date);
		System.out.println("Сʱ��" + hour);
		System.out.println("���ӣ�" + minute);
		System.out.println("�룺" + second);
		System.out.println("���ڣ�" + day);
	}
}