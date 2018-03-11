package myIterator;

public class Txt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> namelist = new Arraylist<String>();
		namelist.add("皮皮虾1");
		namelist.add("皮皮虾2");
		namelist.add("皮皮虾3");
		namelist.add("皮皮虾4");
		namelist.add("皮皮虾5");
		// 通过迭代器输出
		Iterator it = namelist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("******************");
		// 通过传统的for循环输出
		for (int i = 0; i < namelist.size(); i++) {
			System.out.println(namelist.get(i));
		}
	}

}
