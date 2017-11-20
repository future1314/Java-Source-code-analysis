package myIterator;

public class Arraylist<T> implements List<T> {
	// 声明一个数组
	private Object[] obj = null;
	private int index;// 数组的下标
	private int size;// 记录数组中元素的个数

	public Arraylist() {
		obj = new Object[10];
		index = 0;
		size = 0;
	}

	@Override
	public void add(T obj) {
		// TODO Auto-generated method stub
		this.obj[index++] = obj;// 把数据存放到数组中
		size++;// 元素个数加1
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
		return new MyIterator<T>(this);// this指的就是Arraylist接口
	}

}
