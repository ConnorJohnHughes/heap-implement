import static org.junit.Assert.*;
import org.junit.Test;

public class HeapTest {

  @Test
  public void testAddOneValue() {
    Heap heap = new Heap();

    heap.addHeap(10);

    assertEquals("[10]", heap.getHeap().toString());
  }

  @Test
  public void testBubbleUpToRoot() {
    Heap heap = new Heap();
    
    heap.addHeap(10);
    heap.addHeap(5);

    assertEquals("[5, 10]", heap.getHeap().toString());
  }
}
