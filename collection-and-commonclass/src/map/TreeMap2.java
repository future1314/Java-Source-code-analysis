package map;

import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Person, String> pdata = new TreeMap<Person, String>();
		pdata.put(new Person("����", 30), "zhangsan");
		pdata.put(new Person("����", 20), "lisi");
		pdata.put(new Person("����", 10), "wangwu");
		pdata.put(new Person("С��", 5), "xiaohong");
		// �õ�key��ֵ��ͬʱ�õ�key����Ӧ��ֵ
		Set<Person> keys = pdata.keySet();
		for (Person key : keys) {
			System.out.println(key.getAge() + "-" + key.getName());

		}
	}
}

// person����û��ʵ��Comparable�ӿڣ����Ա���ʵ�֣������Ų�������ſ���ʹtreemap�е����ݰ�˳������
// ǰ��һ�����ӵ�String���Ѿ�Ĭ��ʵ����Comparable�ӿڣ���ϸ���Բ鿴String���API�ĵ�����������
// ��Integer��ȶ��Ѿ�ʵ����Comparable�ӿڣ����Բ���Ҫ����ʵ����

class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * TODO��дcompareTo����ʵ�ְ�����������
	 */
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		if (this.age > o.getAge()) {
			return 1;
		} else if (this.age < o.getAge()) {
			return -1;
		}
		return age;
	}
}