package java8Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

		//老版本Java定制排序的方式
		/*
		 * Collections.sort(names, new Comparator<String>() {
		 * 
		 * @Override public int compare(String a, String b) { return
		 * b.compareTo(a); } });
		 */
		//新版本Java定制排序方式
		Collections.sort(names, (String a, String b) -> {
			return b.compareTo(a);
		});
		//还可以这样
		//Collections.sort(names, (String a, String b) -> b.compareTo(a));
		//甚至可以这样
		//Collections.sort(names, (a, b) -> b.compareTo(a));
		//老版输出方法
		for (String name : names) {
			System.out.println(name);
		}
		//新版输出方法
		names.forEach(n -> System.out.println(n));
		// 使用Java 8的方法引用更方便，方法引用由::双冒号操作符标示，
		// 看起来像C++的作用域解析运算符
		names.forEach(System.out::println);
	}

}
