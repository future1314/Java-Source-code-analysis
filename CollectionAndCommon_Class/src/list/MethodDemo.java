package list;

import java.util.ArrayList;
import java.util.List;

/**
 *TODO ��������֮���󽻼� ���� � ȥ�ظ�����
 * @author ��ˬ
 * @date 2017��11��21��
 * @version 1.8
 */
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		// ����
		// list1.addAll(list2);
		// ����
		//list1.retainAll(list2);
		// �
		// list1.removeAll(list2);
		// ���ظ�����
		list2.removeAll(list1);
		list1.addAll(list2);
		for (Integer i : list1) {
			System.out.println(i);
		}
	}

}
