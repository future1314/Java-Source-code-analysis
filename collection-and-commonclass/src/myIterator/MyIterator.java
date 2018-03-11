package myIterator;

public class MyIterator<T> implements Iterator {
	private List list = null;
	private int index = 0;// 访问到容器中元素的当前下标
	// 创建一个迭代器对象的时候接收要被迭代的具体的容器对象

	public MyIterator(List<T> list) {
		this.list = list;
	}

	// 判断是否有下一个容器
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index < list.size();
	}

	// 取出下一个容器
	@Override
	public T next() {
		// TODO Auto-generated method stub
		return (T) list.get(index++);
	}

}
