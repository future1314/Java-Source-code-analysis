package java7;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Java7之前如果要处理二进制值，就比喻借助棘手而且容易出错的基础转换，或者调用 parseX方法。
		 * 比如说，如果想让intx用位模式表示十进制102，你可以这样写： 这样的方法看起来还行但是有很大的问题：
		 * 十分繁琐；方法调用对性能有影响；需要记住双参的parseInt()的处理细节； JIT编译器更难实现；
		 * 用运行时的表达式表示应该在编译时确定的常量，导致x不能再switch语句中；
		 * 如果在位模式有拼写错误能通过编译，但是会在运行时抛出RuntimeException
		 */
		// 十进制102的二进制为1100110
		int x = Integer.parseInt("1100110", 2);
		// Java7的写法：
		int y = 0b1100110;
		System.out.println("x:" + x + "   " + "y" + y);
		// 数字中的下划线
		long m = 2_147_343_567L;//输出结果：2147343567
		int n = 0b0001_1100_0111_0010_1011_0011;//输出结果：n1864371
		System.out.println("m:" + m + "   " + "n" + n);
	}

}
