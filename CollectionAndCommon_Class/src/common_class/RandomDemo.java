package common_class;

import java.util.Random;

/**
 * TODO Random:产生随机数的类。
 * 
 * @author 寇爽
 * @date 2017年11月20日
 * @version 1.8
 */
public class RandomDemo {
	public static void main(String[] args) {
		// 创建对象
		Random r = new Random();
		for (long x = 0; x < 10; x++) {
			// 产生1到100的随机数
			int num = r.nextInt(100);
			System.out.println(num);
		}
	}
}
