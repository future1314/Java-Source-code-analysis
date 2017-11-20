package common_class;

import java.util.Arrays;
import java.util.List;

/**
 * TODO Arrays�෽������
 * 
 * @author ��ˬ
 * @date 2017��11��20��
 * @version 1.8
 */
public class ArraysMethodsDemo {
	public static void main(String[] args) {
		// *************���� sort****************
		int a[] = { 1, 3, 2, 7, 6, 5, 4, 9 };
		// sort(int[] a)������������˳������ָ�������顣
		Arrays.sort(a);
		System.out.println("Arrays.sort(a):");
		for (int i : a) {
			System.out.print(i);
		}
		// ����
		System.out.println();

		// sort(int[] a,int fromIndex,int toIndex)���������������ָ����Χ
		int b[] = { 1, 3, 2, 7, 6, 5, 4, 9 };
		Arrays.sort(b, 2, 6);
		System.out.println("Arrays.sort(b, 2, 6):");
		for (int i : b) {
			System.out.print(i);
		}
		// ����
		System.out.println();

		int c[] = { 1, 3, 2, 7, 6, 5, 4, 9 };
		// parallelSort(int[] a) ��������˳������ָ�������顣ͬsort����һ��Ҳ�а���Χ������
		Arrays.parallelSort(c);
		System.out.println("Arrays.parallelSort(c)��");
		for (int i : c) {
			System.out.print(i);
		}
		// ����
		System.out.println();

		// parallelSort���ַ���������sortҲ����
		char d[] = { 'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B' };
		Arrays.parallelSort(d);
		System.out.println("Arrays.parallelSort(d)��");
		for (char d2 : d) {
			System.out.print(d2);
		}
		// ����
		System.out.println();

		// *************���� binarySearch()****************
		char[] e = { 'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B' };
		System.out.println("Arrays.binarySearch(e, 'c')��");
		int s = Arrays.binarySearch(e, 'c');
		System.out.println("�ַ�c�������λ�ã�" + s);

		// *************�Ƚ� equals****************
		char[] f = { 'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B' };
		/*
		 * Ԫ��������ͬ��������ͬλ�õ�Ԫ����ͬ�� ���⣬��������������ö���null�������Ǳ���Ϊ����ȵ� ��
		 */
		// ���true
		System.out.println("Arrays.equals(e, f):" + Arrays.equals(e, f));
		// ���false����Ϊ����d�Ѿ����Ź�����������d��e��Ȼ����ͬԪ�ع��ɣ�������ͬλ�õ�Ԫ�ز�ͬ
		System.out.println("Arrays.equals(d, e):" + Arrays.equals(d, e));

		// *************���fill(������ʼ��)****************
		int[] g = { 1, 2, 3, 3, 3, 3, 6, 6, 6 };
		// ����������Ԫ�����·���ֵ
		Arrays.fill(g, 3);
		System.out.println("Arrays.fill(g, 3)��");
		// ��������333333333
		for (int i : g) {
			System.out.print(i);
		}
		// ����
		System.out.println();

		int[] h = { 1, 2, 3, 3, 3, 3, 6, 6, 6, };
		// ������ָ����ΧԪ�����·���ֵ
		Arrays.fill(h, 0, 2, 9);
		System.out.println("Arrays.fill(h, 0, 2, 9);��");
		// ��������993333666
		for (int i : h) {
			System.out.print(i);
		}
		// ����
		System.out.println();

		// *************����copy****************
		// copyOf����ʵ�����鸴��,hΪ���飬6Ϊ���Ƶĳ���
		int i[] = Arrays.copyOf(h, 6);
		System.out.println("Arrays.copyOf(h, 6);��");
		// ��������993333
		for (int j : i) {
			System.out.print(j);
		}
		// ����
		System.out.println();

		// copyOfRange��ָ�������ָ����Χ���Ƶ���������
		int j[] = Arrays.copyOfRange(h, 6, 11);
		System.out.println("Arrays.copyOfRange(h, 6, 11)��");
		// ������66600(h����ֻ��9��Ԫ�������Ǵ�����6������11�������Բ���ľ�Ϊ0)
		for (int j2 : j) {
			System.out.print(j2);
		}
		// ����
		System.out.println();

		// *************ת�б� asList()****************
		/*
		 * ������ָ������֧�ֵĹ̶���С���б�
		 * �������ص��б����Ϊ��д�����顱�����÷�����Ϊ��������ͻ��ڼ��ϵ�API֮�����������Collection.toArray()���� ��
		 * ���ص��б��ǿ����л��ģ���ʵ��RandomAccess ��
		 * �˷������ṩ��һ�ַ���ķ�ʽ������һ����ʼ��Ϊ��������Ԫ�صĹ̶���С���б����£�
		 */
		List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
		System.out.println(stooges);

		// *************��ϣ Hash()****************
		char[] k = { 'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B' };
		// �������k��hashֵ
		System.out.println(Arrays.hashCode(k));

		// *************ת�ַ��� toString()****************
		/*
		 * ����ָ����������ݵ��ַ�����ʾ��ʽ�� �ַ�����ʾ������Ԫ�ص��б���ɣ����ڷ����ţ� "[]" ���С�
		 * ���ڵ�Ԫ�����ַ�", "�ָ������ź��һ���ո񣩡� Ԫ�ر�ת��Ϊ�ַ�����String.valueOf(int)��
		 * ����"null"���a��null��
		 */
		// ��������[a, f, b, c, e, A, C, B]
		System.out.println(Arrays.toString(k));

	}
}
