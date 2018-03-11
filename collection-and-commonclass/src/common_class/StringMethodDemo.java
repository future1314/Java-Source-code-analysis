package common_class;

public class StringMethodDemo {

	public static void main(String[] args) {
		String str1 = "abcde";
		String str2 = "Bbcde";
		/*
		 * compareTo() 方法用于两种方式的比较： 字符串与对象进行比较。 按字典顺序比较两个字符串。
		 */
		System.out.println(str1.compareTo(str2));// 31
		// 返回值为-1，这是a和b的ASCII码值相减的结果
		System.out.println(str1.compareToIgnoreCase(str2));// -1
		// 返回指定索引处的字符。
		System.out.println(str1.charAt(2));// c
		// 字符串连接
		System.out.println(str1.concat(str2));// abcdeBbcde
		// 是不是以某一字符串结尾
		System.out.println(str1.endsWith("e"));// true
		System.out.println(str1.length());// 5
		System.out.println(str1.replace("a", "b"));// bbcde
		System.out.println(str2.toUpperCase());// BBCDE

		String Str = new String("www.1nami.com");
		String SubStr1 = new String("1nami");
		String SubStr2 = new String("com");
		// 查找字符 o 第一次出现的位置
		System.out.println(Str.indexOf('o'));// 11
		// 从第14个位置查找字符 o 第一次出现的位置
		System.out.println(Str.indexOf('o', 5));// 11
		// 子字符串 SubStr1 第一次出现的位置
		System.out.println(Str.indexOf(SubStr1));// 4
		// 从第十五个位置开始搜索子字符串 SubStr1 第一次出现的位置
		System.out.println(Str.indexOf(SubStr1, 15));// -1(15超出St2范围)
		// 子字符串 SubStr2 第一次出现的位置
		System.out.println(Str.indexOf(SubStr2));// 10

		String string1 = "a";
		String string2 = "b";
		String string3 = "ab";
		String string4 = string1 + string2;
		String string5 = new String("ab");
		System.out.println(string5.equals(string3));// true
		System.out.println(string5 == string3);// false
		// intern() 方法返回字符串对象的规范化表示形式。
		System.out.println(string5.intern() == string3);// true
		System.out.println(string5.intern() == string4);// false

		// matches() 方法用于检测字符串是否匹配给定的正则表达式。
		// 调用此方法的 str.matches(regex) 形式与以下表达式产生的结果完全相同：
		String string6 = new String("www.runoob.com");
		System.out.println(string6.matches("(.*)runoob(.*)"));// true
		System.out.println(string6.matches("(.*)google(.*)"));// false
		System.out.println(string6.matches("www(.*)"));// true
     
		  
	    }
	}

