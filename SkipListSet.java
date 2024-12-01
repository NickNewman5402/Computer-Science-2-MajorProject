package CS2MajorProject;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import java.util.Set;

//Generic SkipListSet class
public class SkipListSet<T extends Comparable<T>> implements SortedSet<T>, Set<T>, Iterable<T>, Collection<T> {

	 	private int size;
	    private SkipListSetItem head;  // Declare 'head' as an instance variable
	    private int maxLevel;

	    // Constructor
	    public SkipListSet() {
	        this.size = 0;
	        this.maxLevel = 0; // Start with a single level.
	        
	        // Initialize the head node. It points to null in all levels initially.
	        this.head = new SkipListSetItem(null, maxLevel);  // Initialize head with maxLevel
	    }
	
/***********************Internal classes (skeletons)******************************/
	
	/****/
	private class SkipListSetIterator implements Iterator<T> {
		@Override
		public boolean hasNext() {
			// TODO: Implement logic
			return false;
		}

		@Override
		public T next() {
			// TODO: Implement logic
			throw new NoSuchElementException();
		}
	}

	
	/****/
	private class SkipListSetItem<T> {
	    T value;
	    SkipListSetItem[] next;

	    // Constructor for SkipListSetItem
	    public SkipListSetItem(T value, int level) {
	        this.value = value;
	        // Use Array.newInstance to create the array
	        this.next = (SkipListSetItem[]) Array.newInstance(SkipListSetItem.class, level + 1);
	    }
	}
/********************************End Internal Classes*****************************/
	
	
	@Override
	public boolean addAll(Collection<? extends T> c) {
		boolean modified = false;
		for (T element : c) {
			modified |= add(element);
		}
		return modified;
	}
	
	
	
	@Override
	public boolean removeAll(Collection<?> c) {
		boolean modified = false;
		for (Object element : c) {
			modified |= remove(element);
		}
		return modified;
	}
	
	
	public boolean reBalance() {
		// Complete logic for rebalance
		return true;
	}
	
	
	
	



	// SortedSet methods
	@Override
	public Comparator<? super T> comparator() {
		return null; // Natural ordering is used
	}

	@Override
	public SortedSet<T> subSet(T fromElement, T toElement) {
		// TODO: Implement logic
		return null;
	}

	@Override
	public SortedSet<T> headSet(T toElement) {
		// TODO: Implement logic
		return null;
	}

	@Override
	public SortedSet<T> tailSet(T fromElement) {
		// TODO: Implement logic
		return null;
	}

	@Override
	public T first() {
		// TODO: Implement logic
		throw new NoSuchElementException();
	}

	@Override
	public T last() {
		// TODO: Implement logic
		throw new NoSuchElementException();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	// Collection/Set methods
	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean contains(Object o) {
		// TODO: Implement logic
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		return new SkipListSetIterator();
	}

	@Override
	public Object[] toArray() {
		// TODO: Implement logic
		return new Object[0];
	}

	@Override
	public <U> U[] toArray(U[] a) {
		// TODO: Implement logic
		return a;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean add(T element) {
		// TODO: Implement logic
		SkipListSetItem<T> current = head;
		SkipListSetItem<T>[] update = (SkipListSetItem<T>[]) new SkipListSetItem[head.next.length]; // Generic array creation workaround
		
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO: Implement logic
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO: Implement logic
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO: Implement logic
		return false;
	}

	@Override
	public void clear() {
		// TODO: Implement logic
		this.size = 0;
	}
}
