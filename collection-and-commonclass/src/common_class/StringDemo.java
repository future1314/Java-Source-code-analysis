package common_class;

public class StringDemo {
	private String str = "helloWorld";
	static  int x;
	/**
	 * 将字符串变成一个字符数组
	 */
	public void tocharyArry() {
		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println("转为数组输出:" + c[i]);
		}
	}

	/**
	 * 从字符串中取出指定位置的字符
	 */
	public void tocharAt() {
		char c = str.charAt(3);
		System.out.println("指定字符为：" + c);
	}

	/**
	 * 将字符串变成一个byte数组
	 */
	public void tobyte() {
		byte b[] = str.getBytes();
		System.out.println("转换成byte数组输出为：" + new String(b));
	}


	/**
	 * 去掉字符串左右空格
	 */
	public void totrim() {
		String str1 = "       hello         ";
		System.out.println("去掉左右空格后输出:" + str1.trim());
	}

	/**
	 * 字符串的截取
	 */
	public void tosubstring() {
		System.out.println("截取后的字符为：" + str.substring(0, 3));// 截取0-3个位置的内容
		System.out.println("从第3个位置开始截取：" + str.substring(2));// 从第3个位置开始截取
	}

	/**
	 * 按照指定的字符串拆分字符，拆分的数据将以字符串数组的形式返回
	 */
	public void tosplit() {
		String s[] = str.split("e");// 按hello中的e进行字符串拆分
		for (int i = 0; i < s.length; i++) {
			System.out.println("拆分后结果为：" + s[i]);
		}
	}


	/**
	 * 删除首部和尾部空格
	 */
	public void deleteWhitespace() {

		String string = "  hello world  ";
		System.out.println("将 " + "  hello world  " + "的前后空格去掉" + string.trim());
	}

	/**
	 * 判断是否以指定的字符串开头或者结尾
	 */
	public void tostartsWithOrendWith() {
		if (str.startsWith("he"))// 判断字符串是否以he开头
		{
			System.out.println("字符串是以he开头");
		}
		if (str.endsWith("lo")) {
			System.out.println("字符串是以lo结尾");
		}
	}

	/**
	 * 两个String类型内容比较
	 */
	public void toequals() {
		String str3 = "world";
		if (str.equals(str3)) {
			System.out.println("这俩个String类型的值相等");
		} else
			System.out.println("这俩个String类型的不值相等");
	}

	/**
	 * 两个字符串不区分大小写进行比较
	 */
	public void toequalslgnoreCase() {
		String str4 = "HELLO";
		if (str.equalsIgnoreCase(str4)) {
			System.out.println("hello和HELLO忽略大小写比较值相等");
		}
	}

	/**
	 * 将一个指定得到字符串替换成其他字符串
	 */
	public void toreplaceAll() {
		String str5 = str.replaceAll("l", "a");
		System.out.println("替换后的结果为：" + str5);
	}

	public static void main(String[] args) {
		StringDemo obj = new StringDemo();
		obj.tocharyArry();
		obj.tocharAt();
		obj.tobyte();
		obj.totrim();
		obj.tosubstring();
		obj.tosplit();
		obj.deleteWhitespace();
		obj.tostartsWithOrendWith();
		obj.toequals();
		obj.toequalslgnoreCase();
		obj.toreplaceAll();
		System.out.println(obj.x);
	}
}