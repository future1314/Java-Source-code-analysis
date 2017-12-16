package java8Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

		//�ϰ汾Java��������ķ�ʽ
		/*
		 * Collections.sort(names, new Comparator<String>() {
		 * 
		 * @Override public int compare(String a, String b) { return
		 * b.compareTo(a); } });
		 */
		//�°汾Java��������ʽ
		Collections.sort(names, (String a, String b) -> {
			return b.compareTo(a);
		});
		//����������
		//Collections.sort(names, (String a, String b) -> b.compareTo(a));
		//������������
		//Collections.sort(names, (a, b) -> b.compareTo(a));
		//�ϰ��������
		for (String name : names) {
			System.out.println(name);
		}
		//�°��������
		names.forEach(n -> System.out.println(n));
		// ʹ��Java 8�ķ������ø����㣬����������::˫ð�Ų�������ʾ��
		// ��������C++����������������
		names.forEach(System.out::println);
	}

}
