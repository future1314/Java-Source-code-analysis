package myIterator;

public class MyIterator<T> implements Iterator {
	private List list = null;
	private int index = 0;// ���ʵ�������Ԫ�صĵ�ǰ�±�
	// ����һ�������������ʱ�����Ҫ�������ľ������������

	public MyIterator(List<T> list) {
		this.list = list;
	}

	// �ж��Ƿ�����һ������
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index < list.size();
	}

	// ȡ����һ������
	@Override
	public T next() {
		// TODO Auto-generated method stub
		return (T) list.get(index++);
	}

}
