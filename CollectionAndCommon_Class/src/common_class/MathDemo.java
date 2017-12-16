package common_class;

/**
 * TODO Math类
 * 
 * @author 寇爽
 * @date 2017年11月20日
 * @version 1.8
 */
public class MathDemo {
	public static void main(String args[]) {
		/**
		 * abs求绝对值
		 */
		System.out.println(Math.abs(-10.4)); // 10.4
		System.out.println(Math.abs(10.1)); // 10.1

		/**
		 * ceil天花板的意思，就是返回大的值，注意一些特殊值
		 */
		System.out.println(Math.ceil(-10.1)); // -10.0
		System.out.println(Math.ceil(10.7)); // 11.0
		System.out.println(Math.ceil(-0.7)); // -0.0
		System.out.println(Math.ceil(0.0)); // 0.0
		System.out.println(Math.ceil(-0.0)); // -0.0

		/**
		 * floor地板的意思，就是返回小的值
		 */
		System.out.println(Math.floor(-10.1)); // -11.0
		System.out.println(Math.floor(10.7)); // 10.0
		System.out.println(Math.floor(-0.7)); // -1.0
		System.out.println(Math.floor(0.0)); // 0.0
		System.out.println(Math.floor(-0.0)); // -0.0

		/**
		 * max 两个中返回大的值,min和它相反，就不举例了
		 */
		System.out.println(Math.max(-10.1, -10)); // -10.0
		System.out.println(Math.max(10.7, 10)); // 10.7
		System.out.println(Math.max(0.0, -0.0)); // 0.0

		/**
		 * rint 四舍五入，返回double值 注意.5的时候会取偶数
		 */
		System.out.println(Math.rint(10.1)); // 10.0
		System.out.println(Math.rint(10.7)); // 11.0
		System.out.println(Math.rint(11.5)); // 12.0
		System.out.println(Math.rint(10.5)); // 10.0
		System.out.println(Math.rint(10.51)); // 11.0
		System.out.println(Math.rint(-10.5)); // -10.0
		System.out.println(Math.rint(-11.5)); // -12.0
		System.out.println(Math.rint(-10.51)); // -11.0
		System.out.println(Math.rint(-10.6)); // -11.0
		System.out.println(Math.rint(-10.2)); // -10.0

		/**
		 * round 四舍五入，float时返回int值，double时返回long值
		 */
		System.out.println(Math.round(10.1)); // 10
		System.out.println(Math.round(10.7)); // 11
		System.out.println(Math.round(10.5)); // 11
		System.out.println(Math.round(10.51)); // 11
		System.out.println(Math.round(-10.5)); // -10
		System.out.println(Math.round(-10.51)); // -11
		System.out.println(Math.round(-10.6)); // -11
		System.out.println(Math.round(-10.2)); // -10
		
		/**
		 * random 取得一个大于或者等于0.0小于不等于1.0的随机数
		 */
		double x=Math.random();
		int y=(int) (Math.random()*100);
		System.out.println("随机数x:"+x);
		System.out.println("随机数y:"+y);
	}
}