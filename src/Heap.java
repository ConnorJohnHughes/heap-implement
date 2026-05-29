import java.util.ArrayList;

/**
 * A min-heap. 
 * 
 * Must contain functionality for the following: (n = # of elements in heap)
 * 
 * Adding a new value to the heap  O(log(n))
 * Popping the front of the heap O(log(n))
 * Peeking at the front of the heap without removing the element O(1)
 * Getting the size of the heap O(1)
 * Checking whether the heap is empty O(1)
 * 
 * 
 * The Heap must hold ints
 * 
 * Use List/ArrayList as a backing array, but DO NOT use the 
 * PriorityQueue class. Do not make Node objects, use array
 * indexing instead.
 * 
 * It is up to you to make design decisions about how to:
 *  - name methods
 *  - determine return value and argument types
 *  - hold private instance variables
 */
public class Heap {

    private ArrayList<Integer> heap;

    public Heap(){
        heap = new ArrayList<>();
    }

    // adds one value now, need to implement heap behavior
	public void addHeap(int value){
        heap.add(value);
    }

    // used to print out heap for debug
    public void printHeap(){
        System.out.println(heap);
    }

    // look at 0 index
    public void peekHeap(){
        System.out.println(heap.get(0));
    }

    // remove num at top of heap/at 0 index
    public void popHeap(){
        heap.remove(0);
    }

    // get size of heap
    public void sizeHeap(){
        System.out.println(heap.size());
    }

    // check if heap is empty
    public void emptyHeap(){
        System.out.println(heap.isEmpty());
    }

    
  
}