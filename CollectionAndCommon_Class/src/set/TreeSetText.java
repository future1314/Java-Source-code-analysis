package set;


import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * java核心技术卷1 13.2.5对象的比较
 * @author Administrator
 *  创建了两个Item对象的树集。第一个按照部件编号排序，这是Item对象的
 *  默认排序，第二个通过使用一个定制的比较器来按照描述信息排序
 */
public class TreeSetText{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	SortedSet<Item> parts=new TreeSet();
	parts.add(new Item("sss", 1111));
	parts.add(new Item("aaa", 2222));
	parts.add(new Item("ccc", 3333));
	parts.add(new Item("ddd", 4444));
	System.out.println(parts);
	
	SortedSet<Item> sortByDescription=new TreeSet<>(new Comparator<Item>() {

		@Override
		public int compare(Item o1, Item o2) {
			String descraA=o1.getDescription();
			String descraB=o2.getDescription();
			return descraA.compareTo(descraB);
		}
	});
	sortByDescription.addAll(parts);
	System.out.println(sortByDescription);
	}
}



