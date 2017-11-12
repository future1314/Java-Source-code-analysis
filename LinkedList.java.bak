
package java.util;

import java.util.function.Consumer;
/**
List和Deque接口的双链表实现。实现所有可选的列表操作，并允许所有元素（包括null）。

所有的操作都可以预期为双向链表。索引到列表中的操作将从开始或结束遍历列表，以哪个更接近指定的索引为准。

请注意，此实现不同步。如果多个线程同时访问一个链接列表，并且至少有一个线程在结构上修改列表，则它必须在外部同步。 （结构修改是添加或删除一个或多个元素的任何操作;仅仅设置元素的值不是结构修改）。这通常是通过在自然封装列表的某个对象上进行同步来完成的。如果不存在这样的对象，那么列表应该使用Collections.synchronizedList方法“包装”。这最好在创建时完成，以防止意外的不同步访问列表：
   List list = Collections.synchronizedList（new LinkedList（...））;

这个类的迭代器和listIterator方法返回的迭代器是快速失败的：如果在迭代器创建后的任何时候，结构性地修改列表，除了通过迭代器自己的remove或add方法之外，迭代器将抛出一个ConcurrentModificationException异常。因此，在并发修改的情况下，迭代器快速而干净地失败，而不是在未来的未定的时间冒着任意的，不确定的行为冒险。

请注意，迭代器的故障快速行为无法得到保证，因为一般来说，不可能在存在非同步并发修改的情况下做出任何硬性保证。失败快速迭代器尽最大努力抛出ConcurrentModificationException。因此，编写一个依赖于这个异常的程序是正确的：迭代器的快速失败行为只能用来检测错误。

该类是Java集合框架的成员。
*/

public class LinkedList<E>
    extends AbstractSequentialList<E>
    implements List<E>, Deque<E>, Cloneable, java.io.Serializable
{  
	//LinkedList的大小
    transient int size = 0;

    /**
     * 指向第一个节点的指针（头结点）
     */
    transient Node<E> first;

    /**
     * 指向最后一个节点的指针（尾节点）
     */
    transient Node<E> last;

    /**
	 *构造一个空的LinkedList（不带参数的构造方法）。
     */
    public LinkedList() {
    }

    /**
     * 构造一个包含指定集合的元素的列表，按照它们由集合的迭代器返回的顺序。。
     * @param  c 元素将被放置到这个LinkedList中的集合。
     * @throws NullPointerException 如果指定的集合是空的
     */
    public LinkedList(Collection<? extends E> c) {
        this();
		//将指定集合中的所有元素追加到此列表的末尾。
        addAll(c);
    }

    /**
     * 链接使e作为第一个元素。
     */
    private void linkFirst(E e) {
        final Node<E> f = first;
		//内部类Node<E>的构造方法Node(Node<E> prev, E element, Node<E> next)
        final Node<E> newNode = new Node<>(null, e, f);
        first = newNode;
        if (f == null)
            last = newNode;
        else
            f.prev = newNode;
        size++;
        modCount++;
    }

   /**
     * 链接使e作为最后一个元素。
     */
    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }

    /**
     * 在非null节点succ之前插入元素e。
     */
    void linkBefore(E e, Node<E> succ) {
        // assert succ != null;
        final Node<E> pred = succ.prev;
        final Node<E> newNode = new Node<>(pred, e, succ);
        succ.prev = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.next = newNode;
        size++;
        modCount++;
    }

    /**
     * 取消链接非空的第一个节点f，返回这个列表的第一个元素
     */
    private E unlinkFirst(Node<E> f) {
        // assert f == first && f != null;
        final E element = f.item;
        final Node<E> next = f.next;
        f.item = null;
        f.next = null; // help GC
        first = next;
        if (next == null)
            last = null;
        else
            next.prev = null;
        size--;
        modCount++;
        return element;
    }

    /**
     * 取消链接非空的最后一个节点l。
     */
    private E unlinkLast(Node<E> l) {
        // assert l == last && l != null;
        final E element = l.item;
        final Node<E> prev = l.prev;
        l.item = null;
        l.prev = null; // help GC
        last = prev;
        if (prev == null)
            first = null;
        else
            prev.next = null;
        size--;
        modCount++;
        return element;
    }

    /**
     *取消链接非空节点x。
     */
    E unlink(Node<E> x) {
        // assert x != null;
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        modCount++;
        return element;
    }

    /**
     * 返回此列表中的第一个元素。 
     */
    public E getFirst() {
        final Node<E> f = first;
		//如果f为空抛出异常
        if (f == null)
            throw new NoSuchElementException();
		//返回f节点的值
        return f.item;
    }

    /**
     * 返回此列表中的最后一个元素。 
     */
    public E getLast() {
        final Node<E> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return l.item;
    }

    /**
     * 从此列表中删除并返回第一个元素。
     */
    public E removeFirst() {
        final Node<E> f = first;
        if (f == null)
            throw new NoSuchElementException();
		//调用unlinkFirst()方法删除并返回一个元素（unlinkFirst()返回（return）的第一个元素）
        return unlinkFirst(f);
    }

    /**
     * 从此列表中删除并返回最后一个元素。
     */
    public E removeLast() {
        final Node<E> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return unlinkLast(l);
    }

    /**
     * 在该列表开头插入指定的元素。 
     * @param e 要添加的元素
     */
    public void addFirst(E e) {
		//调用linkFirst()在链表头添加元素
        linkFirst(e);
    }

    /**
     * 将指定的元素追加到此列表的末尾。
     * @param e 将指定的元素追加到此列表的末尾。
     */
    public void addLast(E e) {
        linkLast(e);
    }

    /**
     * 如果此列表包含指定的元素，则返回true 。
     */
    public boolean contains(Object o) {
		//indexOf()方法：此列表中指定元素的首次出现的索引，如果此列表不包含此元素，则为-1 
        return indexOf(o) != -1;
    }

    /**
     * 返回此列表中的元素数。
     */
    public int size() {
        return size;
    }

    /**
     * 将指定的元素追加到此列表的末尾。 
     */
    public boolean add(E e) {
        //调用linkLast()方法将指定元素追加到末尾
        linkLast(e);
        return true;
    }

    /**
     *从列表中删除指定元素的第一个出现（如果存在）。
	 *如果此列表不包含该元素，则它将保持不变。
     */
    public boolean remove(Object o) {
        if (o == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.item == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (o.equals(x.item)) {
                    unlink(x);
                    return true;
                }
            }
        }
		//不存在这个元素就会返回false
        return false;
    }

    /**
     *按照指定集合的迭代器返回的顺序将指定集合中的所有元素追加到此列表的末尾。 
	 *如果在操作进行中修改了指定的集合，则此操作的行为是未定义的。 
	 *（注意，如果指定的集合是此列表，并且它是非空的，则会发生这种情况。） 
     *参数 c 包含要添加到此列表的元素的集合 
	 *如果指定的集合为空抛出NullPointerException（空指针异常）
     */
    public boolean addAll(Collection<? extends E> c) {
		//返回true，如果这个列表由于调用而改变
        return addAll(size, c);
    }

    /**
     *将指定集合中的所有元素插入到此列表中，
	 *从指定的位置开始。 将当前位于该位置（如果有的话）的元素和随后的任何元素移动到右边（增加其索引）。 
	 *新元素将按照指定集合的迭代器返回的顺序显示在列表中。
     * 参数index： 从中指定集合插入第一个元素的索引 
     * 参数c 包含要添加到此列表的元素的集合 
     *如果索引超出范围（ index < 0 || index > size() ） 抛出IndexOutOfBoundsException
     * 如果指定的集合为空抛出NullPointerException（空指针异常 ）
     */
    public boolean addAll(int index, Collection<? extends E> c) {
       //迭代器或添加操作时判断索引是否存在,不存在的话会抛出异常
        checkPositionIndex(index);
       //将该集合通过toArray（）方法转换为数组
        Object[] a = c.toArray();
        int numNew = a.length;
		//数组长度为0返回false
        if (numNew == 0)
            return false;

        Node<E> pred, succ;
		//指定位置刚好等于数组长度的时候
        if (index == size) {
            succ = null;
            pred = last;
        } else {
            succ = node(index);
            pred = succ.prev;
        }

        for (Object o : a) {
            @SuppressWarnings("unchecked")
			//强制类型转换
			E e = (E) o;
			//调用构造方法初始化
            Node<E> newNode = new Node<>(pred, e, null);
            if (pred == null)
                first = newNode;
            else
                pred.next = newNode;
            pred = newNode;
        }

        if (succ == null) {
            last = pred;
        } else {
            pred.next = succ;
            succ.prev = pred;
        }

        size += numNew;
        modCount++;
        return true;
    }

    /**
     * 移除列表中的所有元素
     */
    public void clear() {
        for (Node<E> x = first; x != null; ) {
            Node<E> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
        modCount++;
    }


    // Positional Access Operations

    /**
     *返回此列表中指定位置的元素。 
     * @param index 要返回的元素的索引 
     * @return 该列表中指定位置的元素 
     * @throws IndexOutOfBoundsException 如果指数超出范围（ index < 0 || index >= size() ） 
     */
    public E get(int index) {
		//判断索引是否存在,不存在会抛出异常
        checkElementIndex(index);
        return node(index).item;
    }

    /**
     * 用指定的元素替换此列表中指定位置的元素。
     * @param index 要替换的元素的索引 
     * @param element 要存储在指定位置的元素 
     * @return 之前在指定位置的元素
     * @throws IndexOutOfBoundsException 如果指数超出范围（ index < 0 || index >= size() ） 
     */
    public E set(int index, E element) {
        checkElementIndex(index);
        Node<E> x = node(index);
        E oldVal = x.item;
        x.item = element;
		//返回之前在这个位置的元素
        return oldVal;
    }

    /**
     *在此列表中的指定位置插入指定的元素。 
	 *将当前位于该位置的元素（如果有）和任何后续元素（向其索引添加一个）移动。 
     * @param index 要在其中插入指定元素的索引 
     * @param element  要插入的元素 
     * @throws IndexOutOfBoundsException 如果索引超出范围（ index < 0 || index > size() ） 
     */
    public void add(int index, E element) {
        checkPositionIndex(index);
        //如果index等于列表大小，直接添加元素到末尾
        if (index == size)
            linkLast(element);
        else
	    //否则添加到索引的前面
            linkBefore(element, node(index));
    }

    /**
     *删除该列表中指定位置的元素。 
	 *将任何后续元素移动到左侧（从其索引中减去一个元素）。 返回从列表中删除的元素。 
     */
    public E remove(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }

    /**
     * 判断索引是否存在（index >= 0 && index < size时才存在）
     */
    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    /**
     * 迭代器或添加操作时判断索引是否存在
     */
    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    /**
     * 返回可能的错误代码导致的异常IndexOutOfBoundsException的异常信息 .
     */
    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }

    private void checkElementIndex(int index) {
        //isElementIndex(int index)方法：判断索引是否存在（index >= 0 && index < size时才存在）
		if (!isElementIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    private void checkPositionIndex(int index) {
		//isPositionIndex(index)方法：迭代器或添加操作时判断索引是否存在
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    /**
     * 返回指定元素索引处的（非null）节点。
     */
    Node<E> node(int index) {
        // assert isElementIndex(index);

        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    // Search Operations

    /**
     *返回此列表中指定元素的第一次出现的索引，
	 *此列表中指定元素的首次出现的索引，如果此列表不包含此元素，则为-1 
     */
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.item == null)
                    return index;
                index++;
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (o.equals(x.item))
                    return index;
                index++;
            }
        }
        return -1;
    }

   /**
     *返回此列表中指定元素的最后一次出现的索引，
	 *此列表中指定元素的首次出现的索引，如果此列表不包含此元素，则为-1 
     */
    public int lastIndexOf(Object o) {
        int index = size;
        if (o == null) {
            for (Node<E> x = last; x != null; x = x.prev) {
                index--;
                if (x.item == null)
                    return index;
            }
        } else {
            for (Node<E> x = last; x != null; x = x.prev) {
                index--;
                if (o.equals(x.item))
                    return index;
            }
        }
        return -1;
    }

    /**
     *检索（获取）但不删除此列表的头（第一个元素）。 
     * @return 该列表的头，或 null如果此列表为空 
     * @since 1.5
     */
    public E peek() {
        final Node<E> f = first;
        return (f == null) ? null : f.item;
    }

    /**
     * 检索但不删除此列表的头（第一个元素）。 
     * @return 这个列表的第一个元素
     * @throws NoSuchElementException 如果此列表为空 
     * @since 1.5
     */
    public E element() {
        return getFirst();
    }

    /**
     * 检索并删除此列表的头（第一个元素）。 
     * @return 该列表的头，或 null如果此列表为空 
     * @since 1.5
     */
    public E poll() {
        final Node<E> f = first;
        return (f == null) ? null : unlinkFirst(f);
    }

    /**
     * 检索并删除此列表的头（第一个元素）。
     * @return 这个名单的头 
     * @throws NoSuchElementException 如果此列表为空 
     * @since 1.5
     */
    public E remove() {
        return removeFirst();
    }

    /**
     * 将指定的元素添加为此列表的尾部（最后一个元素）。 
     * @return true如果元素被添加到这个队列，否则 false 
     * @since 1.5
     */
    public boolean offer(E e) {
        return add(e);
    }

    /**
     * 在此列表的开头插入指定的元素
     */
    public boolean offerFirst(E e) {
        addFirst(e);
        return true;
    }

    /**
     * 在此列表末尾插入指定的元素
     */
    public boolean offerLast(E e) {
        addLast(e);
        return true;
    }

    /**
     * 获取但不移除此列表的第一个元素
     */
    public E peekFirst() {
        final Node<E> f = first;
        return (f == null) ? null : f.item;
     }

    /**
     * 检索但不删除此列表的最后一个元素
     */
    public E peekLast() {
        final Node<E> l = last;
        return (l == null) ? null : l.item;
    }

    /**
     *  获取并移除此列表的第一个元素
     */
    public E pollFirst() {
        final Node<E> f = first;
        return (f == null) ? null : unlinkFirst(f);
    }

    /**
     *获取并移除此列表的最后一个元素
     */
    public E pollLast() {
        final Node<E> l = last;
        return (l == null) ? null : unlinkLast(l);
    }

    /**
     *将元素推入此列表所表示的堆栈（插入到列表的头）6
     */
    public void push(E e) {
        addFirst(e);
    }

    /**
     * 从此列表所表示的堆栈处弹出一个元素（获取并移除列表第一个元素）
     */
    public E pop() {
        return removeFirst();
    }

    /**
     * 从此列表中移除第一次出现的指定元素（从头部到尾部遍历列表）
     */
    public boolean removeFirstOccurrence(Object o) {
        return remove(o);
    }

    /**
     *从此列表中移除最后一次出现的指定元素（从头部到尾部遍历列表）
     */
    public boolean removeLastOccurrence(Object o) {
        if (o == null) {
			//x指向最后一个元素,x.prev表示x的上一个元素（也就是从末尾开始循环）
            for (Node<E> x = last; x != null; x = x.prev) {
                if (x.item == null) {
					//调用unlink（）移除x
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = last; x != null; x = x.prev) {
                if (o.equals(x.item)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 从列表中的指定位置开始，返回此列表中元素的列表迭代器（按适当的顺序）。
	 *list-iterator是fail-fast ：如果列表在创建迭代器之后的任何时间被结构化地修改，
	 *除了通过list-iterator自己的remove或add方法之外，
	 *list-iterator将以任何方式抛出ConcurrentModificationException 。 
	 *因此，面对并发修改，迭代器将快速而干净地失败，而不是在未来未确定的时间冒着任意的非确定性行为。 
     */
    public ListIterator<E> listIterator(int index) {
        checkPositionIndex(index);
        return new ListItr(index);
    }
   // List迭代器（内部类实现）
    private class ListItr implements ListIterator<E> {
		//上一次返回的节点
        private Node<E> lastReturned;
		//下一个节点
        private Node<E> next;
		//下一个节点对应的索引值
        private int nextIndex;
		// 期望的改变计数。用来实现fail-fast机制。
        private int expectedModCount = modCount;
        // 构造函数。    
        // 从index位置开始进行迭代 
        ListItr(int index) {
            next = (index == size) ? null : node(index);
            nextIndex = index;
        }
        //是否存在下一元素
        public boolean hasNext() {
            return nextIndex < size;
        }
        //获取下一个元素
        public E next() {
            checkForComodification();
            if (!hasNext())
                throw new NoSuchElementException();

            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.item;
        }
        //是否存在上一个元素
        public boolean hasPrevious() {
            return nextIndex > 0;
        }
        //获取上一个元素
        public E previous() {
            checkForComodification();
            if (!hasPrevious())
                throw new NoSuchElementException();

            lastReturned = next = (next == null) ? last : next.prev;
            nextIndex--;
            return lastReturned.item;
        }
        //获取下一个元素的索引
        public int nextIndex() {
            return nextIndex;
        }
        //获取上一个元素索引
        public int previousIndex() {
            return nextIndex - 1;
        }
        //删除双向链表中的当前节点
        public void remove() {
            checkForComodification();
            if (lastReturned == null)
                throw new IllegalStateException();

            Node<E> lastNext = lastReturned.next;
            unlink(lastReturned);
            if (next == lastReturned)
                next = lastNext;
            else
                nextIndex--;
            lastReturned = null;
            expectedModCount++;
        }
        
        public void set(E e) {
            if (lastReturned == null)
                throw new IllegalStateException();
            checkForComodification();
            lastReturned.item = e;
        }

        public void add(E e) {
            checkForComodification();
            lastReturned = null;
            if (next == null)
                linkLast(e);
            else
                linkBefore(e, next);
            nextIndex++;
            expectedModCount++;
        }

        public void forEachRemaining(Consumer<? super E> action) {
            Objects.requireNonNull(action);
            while (modCount == expectedModCount && nextIndex < size) {
                action.accept(next.item);
                lastReturned = next;
                next = next.next;
                nextIndex++;
            }
            checkForComodification();
        }

        final void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }
    }
    /**
     * 内部类
     */
    private static class Node<E> {
        //当前元素
		E item;
		//下一个元素
        Node<E> next;
		//上一个元素
        Node<E> prev;
        //构造方法
        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    /**
     * @since 1.6
     */
    public Iterator<E> descendingIterator() {
        return new DescendingIterator();
    }

    /**
     * 以相反的顺序返回此deque中的元素的迭代器。 元素将从最后（尾）到第一（头）的顺序返回。 

     */
    private class DescendingIterator implements Iterator<E> {
        private final ListItr itr = new ListItr(size());
        public boolean hasNext() {
            return itr.hasPrevious();
        }
        public E next() {
            return itr.previous();
        }
        public void remove() {
            itr.remove();
        }
    }

    @SuppressWarnings("unchecked")
    private LinkedList<E> superClone() {
        try {
            return (LinkedList<E>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    /**
     * 返回此LinkedList的浅拷贝。 （元素本身不被克隆。）
     */
    public Object clone() {
        LinkedList<E> clone = superClone();

        // Put clone into "virgin" state
        clone.first = clone.last = null;
        clone.size = 0;
        clone.modCount = 0;

        // Initialize clone with our elements
        for (Node<E> x = first; x != null; x = x.next)
            clone.add(x.item);

        return clone;
    }

    /**
     * 以正确的顺序（从第一个到最后一个元素）返回一个包含此列表中所有元素的数组
     *返回的数组将是“安全的”，因为该列表不保留对它的引用。 
	 *（换句话说，这个方法必须分配一个新的数组）。 因此，调用者可以自由地修改返回的数组。 
     *此方法充当基于阵列和基于集合的API之间的桥梁。
	 */
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node<E> x = first; x != null; x = x.next)
            result[i++] = x.item;
        return result;
    }

    /**
     *返回以适当顺序（从第一个元素到最后一个元素）包含此列表中所有元素的数组；
     *返回数组的运行时类型为指定数组的类型。
     */
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        if (a.length < size)
            a = (T[])java.lang.reflect.Array.newInstance(
                                a.getClass().getComponentType(), size);
        int i = 0;
        Object[] result = a;
        for (Node<E> x = first; x != null; x = x.next)
            result[i++] = x.item;

        if (a.length > size)
            a[size] = null;

        return a;
    }

    private static final long serialVersionUID = 876323262645176354L;

    /**
     * Saves the state of this {@code LinkedList} instance to a stream
     * (that is, serializes it).
     *
     * @serialData The size of the list (the number of elements it
     *             contains) is emitted (int), followed by all of its
     *             elements (each an Object) in the proper order.
     */
    private void writeObject(java.io.ObjectOutputStream s)
        throws java.io.IOException {
        // Write out any hidden serialization magic
        s.defaultWriteObject();

        // Write out size
        s.writeInt(size);

        // Write out all elements in the proper order.
        for (Node<E> x = first; x != null; x = x.next)
            s.writeObject(x.item);
    }

    /**
     * Reconstitutes this {@code LinkedList} instance from a stream
     * (that is, deserializes it).
     */
    @SuppressWarnings("unchecked")
    private void readObject(java.io.ObjectInputStream s)
        throws java.io.IOException, ClassNotFoundException {
        // Read in any hidden serialization magic
        s.defaultReadObject();

        // Read in size
        int size = s.readInt();

        // Read in all elements in the proper order.
        for (int i = 0; i < size; i++)
            linkLast((E)s.readObject());
    }

    /**
     * Creates a <em><a href="Spliterator.html#binding">late-binding</a></em>
     * and <em>fail-fast</em> {@link Spliterator} over the elements in this
     * list.
     *
     * <p>The {@code Spliterator} reports {@link Spliterator#SIZED} and
     * {@link Spliterator#ORDERED}.  Overriding implementations should document
     * the reporting of additional characteristic values.
     *
     * @implNote
     * The {@code Spliterator} additionally reports {@link Spliterator#SUBSIZED}
     * and implements {@code trySplit} to permit limited parallelism..
     *
     * @return a {@code Spliterator} over the elements in this list
     * @since 1.8
     */
    @Override
    public Spliterator<E> spliterator() {
        return new LLSpliterator<E>(this, -1, 0);
    }

    /** A customized variant of Spliterators.IteratorSpliterator */
    static final class LLSpliterator<E> implements Spliterator<E> {
        static final int BATCH_UNIT = 1 << 10;  // batch array size increment
        static final int MAX_BATCH = 1 << 25;  // max batch array size;
        final LinkedList<E> list; // null OK unless traversed
        Node<E> current;      // current node; null until initialized
        int est;              // size estimate; -1 until first needed
        int expectedModCount; // initialized when est set
        int batch;            // batch size for splits

        LLSpliterator(LinkedList<E> list, int est, int expectedModCount) {
            this.list = list;
            this.est = est;
            this.expectedModCount = expectedModCount;
        }

        final int getEst() {
            int s; // force initialization
            final LinkedList<E> lst;
            if ((s = est) < 0) {
                if ((lst = list) == null)
                    s = est = 0;
                else {
                    expectedModCount = lst.modCount;
                    current = lst.first;
                    s = est = lst.size;
                }
            }
            return s;
        }

        public long estimateSize() { return (long) getEst(); }

        public Spliterator<E> trySplit() {
            Node<E> p;
            int s = getEst();
            if (s > 1 && (p = current) != null) {
                int n = batch + BATCH_UNIT;
                if (n > s)
                    n = s;
                if (n > MAX_BATCH)
                    n = MAX_BATCH;
                Object[] a = new Object[n];
                int j = 0;
                do { a[j++] = p.item; } while ((p = p.next) != null && j < n);
                current = p;
                batch = j;
                est = s - j;
                return Spliterators.spliterator(a, 0, j, Spliterator.ORDERED);
            }
            return null;
        }

        public void forEachRemaining(Consumer<? super E> action) {
            Node<E> p; int n;
            if (action == null) throw new NullPointerException();
            if ((n = getEst()) > 0 && (p = current) != null) {
                current = null;
                est = 0;
                do {
                    E e = p.item;
                    p = p.next;
                    action.accept(e);
                } while (p != null && --n > 0);
            }
            if (list.modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }

        public boolean tryAdvance(Consumer<? super E> action) {
            Node<E> p;
            if (action == null) throw new NullPointerException();
            if (getEst() > 0 && (p = current) != null) {
                --est;
                E e = p.item;
                current = p.next;
                action.accept(e);
                if (list.modCount != expectedModCount)
                    throw new ConcurrentModificationException();
                return true;
            }
            return false;
        }

        public int characteristics() {
            return Spliterator.ORDERED | Spliterator.SIZED | Spliterator.SUBSIZED;
        }
    }

}
