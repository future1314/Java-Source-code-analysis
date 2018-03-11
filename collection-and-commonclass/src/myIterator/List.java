package myIterator;

public interface List<T> {//用泛型
	public void add(T obj) ;//给具体的容器添加元素
	public T get(int index);//获取指定位置上的元素
	public int size();//获取容器中的元素个数
	public Iterator iterator() ;//得到具体的迭代器对象
	
	}


