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

    /**
     * Provides access to the heap's internal structure for JUnit testing.
     */
    public ArrayList<Integer> getHeap() {
        return heap;
    }

    /**
     * Adds a value to a min heap and bubbles the value up till min heap contract is satisfied
     * @param value
     */
	public void addHeap(int value){
        // add value to the heap (next open spot at the left side of the tree)
        heap.add(value);
        // get the index of the value just added
        int currentIndex = heap.size() - 1;
        // get the parent index of the value just added
        int parentIndex = (currentIndex - 1) / 2;

        // if current index is equal to 0, currentIndex is the root index
        if (currentIndex == 0) return;
        
        // loop while parent value is greater than current value
        while (heap.get(parentIndex) > heap.get(currentIndex)) {
            int currentVal = heap.get(currentIndex);
            // use set method to move parent value into current index
            heap.set(currentIndex, heap.get(parentIndex));
            // use set method to move current value into parent index
            heap.set(parentIndex, currentVal);
            // change current index to parent index (the value that just bubbled up is now in the parents position)
            currentIndex = parentIndex;
            // recalculate parent index
            parentIndex = (currentIndex - 1) / 2;
        }
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