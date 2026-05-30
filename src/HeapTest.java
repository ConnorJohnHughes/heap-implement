import static org.junit.Assert.*;
import org.junit.Test;

public class HeapTest {

  @Test
  public void testAddOneValue() {
    Heap heap = new Heap();

    heap.addHeap(15);

    assertEquals("[15]", heap.getHeap().toString());
  }

  @Test
  public void testBubbleUpToRoot() {
    Heap heap = new Heap();
    
    heap.addHeap(14);
    heap.addHeap(5);

    assertEquals("[5, 14]", heap.getHeap().toString());
  }

  @Test
  public void testMultipleBubbleUps() {
    Heap heap = new Heap();

    heap.addHeap(15);
    heap.addHeap(9);
    heap.addHeap(5);

    assertEquals("[5, 15, 9]", heap.getHeap().toString());
  }

  @Test
  public void testNoBubbleUpsNeeded() {
    Heap heap = new Heap();

    heap.addHeap(2);
    heap.addHeap(12);

    assertEquals("[2, 12]", heap.getHeap().toString());
  }

  @Test
  public void testAlotOfBubbleUps() {
    Heap heap = new Heap();

    heap.addHeap(15);
    heap.addHeap(10);
    heap.addHeap(5);
    heap.addHeap(9);
    heap.addHeap(3);
    heap.addHeap(11);
    heap.addHeap(2);

    assertEquals("[2, 5, 3, 15, 9, 11, 10]", heap.getHeap().toString());
  }
}
