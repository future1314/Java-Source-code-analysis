package common_class;

import java.util.Scanner;

public class CharacterMethodsDemo {
	public static void main(String[] args) {
		int englishCount = 0;// Ӣ����ĸ����
		int spaceCount = 0;// �ո����
		int numCount = 0;// ���ָ���
		int otherCount = 0;// �����ַ�����
		Scanner sc = new Scanner(System.in);
		System.out.println("��������һ���ַ���");
		String str = sc.nextLine();// ȡ�ÿ���̨�����һ���ַ�
		char[] ch = str.toCharArray();// ��ȡ�����ַ������һ��char����
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLetter(ch[i])) {
				// �ж��Ƿ�Ϊ��ĸ
				englishCount++;
			} else if (Character.isWhitespace(ch[i])) {
				// �ж��Ƿ�Ϊ�ո�
				spaceCount++;
			} else if (Character.isDigit(ch[i])) {
				// �ж��Ƿ�Ϊ����
				numCount++;
			} else {
				// ���϶���������Ϊ�������ַ�
				otherCount++;
			}
		}
		System.out.println("��ĸ�ĸ�����" + englishCount);
		System.out.println("���ֵĸ�����" + numCount);
		System.out.println("�ո�ĸ�����" + spaceCount);
		System.out.println("�����ַ��ĸ�����" + otherCount);
		//isUpperCase(),isLowerCase()�������� 
		System.out.println("a�Ǵ�д��ĸ��"+Character.isUpperCase('a'));
		System.out.println("a��Сд��ĸ��"+Character.isLowerCase('a'));
		//
		System.out.println("aת��Ϊ��д��ĸ��"+Character.toUpperCase('a'));
		System.out.println("Aת��ΪСд��ĸ��"+Character.toLowerCase('a'));
	}

}
