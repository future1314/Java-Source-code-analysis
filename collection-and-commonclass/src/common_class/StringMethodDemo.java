package common_class;

public class StringMethodDemo {

	public static void main(String[] args) {
		String str1 = "abcde";
		String str2 = "Bbcde";
		/*
		 * compareTo() �����������ַ�ʽ�ıȽϣ� �ַ����������бȽϡ� ���ֵ�˳��Ƚ������ַ�����
		 */
		System.out.println(str1.compareTo(str2));// 31
		// ����ֵΪ-1������a��b��ASCII��ֵ����Ľ��
		System.out.println(str1.compareToIgnoreCase(str2));// -1
		// ����ָ�����������ַ���
		System.out.println(str1.charAt(2));// c
		// �ַ�������
		System.out.println(str1.concat(str2));// abcdeBbcde
		// �ǲ�����ĳһ�ַ�����β
		System.out.println(str1.endsWith("e"));// true
		System.out.println(str1.length());// 5
		System.out.println(str1.replace("a", "b"));// bbcde
		System.out.println(str2.toUpperCase());// BBCDE

		String Str = new String("www.1nami.com");
		String SubStr1 = new String("1nami");
		String SubStr2 = new String("com");
		// �����ַ� o ��һ�γ��ֵ�λ��
		System.out.println(Str.indexOf('o'));// 11
		// �ӵ�14��λ�ò����ַ� o ��һ�γ��ֵ�λ��
		System.out.println(Str.indexOf('o', 5));// 11
		// ���ַ��� SubStr1 ��һ�γ��ֵ�λ��
		System.out.println(Str.indexOf(SubStr1));// 4
		// �ӵ�ʮ���λ�ÿ�ʼ�������ַ��� SubStr1 ��һ�γ��ֵ�λ��
		System.out.println(Str.indexOf(SubStr1, 15));// -1(15����St2��Χ)
		// ���ַ��� SubStr2 ��һ�γ��ֵ�λ��
		System.out.println(Str.indexOf(SubStr2));// 10

		String string1 = "a";
		String string2 = "b";
		String string3 = "ab";
		String string4 = string1 + string2;
		String string5 = new String("ab");
		System.out.println(string5.equals(string3));// true
		System.out.println(string5 == string3);// false
		// intern() ���������ַ�������Ĺ淶����ʾ��ʽ��
		System.out.println(string5.intern() == string3);// true
		System.out.println(string5.intern() == string4);// false

		// matches() �������ڼ���ַ����Ƿ�ƥ�������������ʽ��
		// ���ô˷����� str.matches(regex) ��ʽ�����±��ʽ�����Ľ����ȫ��ͬ��
		String string6 = new String("www.runoob.com");
		System.out.println(string6.matches("(.*)runoob(.*)"));// true
		System.out.println(string6.matches("(.*)google(.*)"));// false
		System.out.println(string6.matches("www(.*)"));// true
     
		  
	    }
	}

