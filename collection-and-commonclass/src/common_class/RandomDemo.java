package common_class;

import java.util.Random;

/**
 * TODO Random:������������ࡣ
 * 
 * @author ��ˬ
 * @date 2017��11��20��
 * @version 1.8
 */
public class RandomDemo {
	public static void main(String[] args) {
		// ��������
		Random r = new Random();
		for (long x = 0; x < 10; x++) {
			// ����1��100�������
			int num = r.nextInt(100);
			System.out.println(num);
		}
	}
}
