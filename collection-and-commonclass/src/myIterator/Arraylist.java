package myIterator;

public class Arraylist<T> implements List<T> {
	// ����һ������
	private Object[] obj = null;
	private int index;// ������±�
	private int size;// ��¼������Ԫ�صĸ���

	public Arraylist() {
		obj = new Object[10];
		index = 0;
		size = 0;
	}

	@Override
	public void add(T obj) {
		// TODO Auto-generated method stub
		this.obj[index++] = obj;// �����ݴ�ŵ�������
		size++;// Ԫ�ظ�����1
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return (T) this.obj[index];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new MyIterator<T>(this);// thisָ�ľ���Arraylist�ӿ�
	}

}
