package myIterator;

public class Txt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> namelist = new Arraylist<String>();
		namelist.add("ƤƤϺ1");
		namelist.add("ƤƤϺ2");
		namelist.add("ƤƤϺ3");
		namelist.add("ƤƤϺ4");
		namelist.add("ƤƤϺ5");
		// ͨ�����������
		Iterator it = namelist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("******************");
		// ͨ����ͳ��forѭ�����
		for (int i = 0; i < namelist.size(); i++) {
			System.out.println(namelist.get(i));
		}
	}

}
