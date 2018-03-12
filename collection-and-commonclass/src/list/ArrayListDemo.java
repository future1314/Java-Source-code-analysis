package list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * TODO
 * 
 * @author ��ˬ
 * @date 2018��3��11��
 * @version 1.8
 */
public class ArrayListDemo {

	public static void main(String[] srgs) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		System.out.printf("Before add:arrayList.size() = %d\n", arrayList.size());

		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(5);
		arrayList.add(7);
		arrayList.add(9);
		System.out.printf("After add:arrayList.size() = %d\n", arrayList.size());

		System.out.println("Printing elements of arrayList");
		/**
		 * ���ֱ�����ʽ��ӡԪ��
		 */
		// ��һ�֣�ͨ������������
		System.out.print("ͨ������������:");
		Iterator<Integer> it = arrayList.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		// �ڶ��֣�ͨ������ֵ����
		System.out.print("ͨ������ֵ����:");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}
		System.out.println();

		// �����֣�forѭ������
		System.out.print("forѭ������:");
		for (Integer number : arrayList) {
			System.out.print(number + " ");
		}

		// toArray�÷�
		// ��һ�ַ�ʽ(���)
		Integer[] integer = arrayList.toArray(new Integer[0]);

		// �ڶ��ַ�ʽ(�������)
		Integer[] integer1 = new Integer[arrayList.size()];
		arrayList.toArray(integer1);

		// �׳��쳣��java��֧������ת��
		// Integer[] integer2 = new Integer[arrayList.size()];
		// integer2 = arrayList.toArray();
		System.out.println();

		arrayList.add(2, 2); // ��ָ��λ�����Ԫ��
		arrayList.remove(2); // ɾ��ָ��λ���ϵ�Ԫ��		
		arrayList.remove((Object) 3);// ɾ��ָ��Ԫ��	
		System.out.println("ArrayList contains 5 is: " + arrayList.contains(5));// �ж�arrayList�Ƿ����5
		// ���ArrayList
		arrayList.clear();
		// �ж�ArrayList�Ƿ�Ϊ��
		System.out.println("ArrayList is empty: " + arrayList.isEmpty());
	}
}