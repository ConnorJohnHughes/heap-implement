import static org.junit.Assert.*;
import org.junit.Test;

public class HeapTest {

@Test
public void testAddOneValue() {
  Heap heap = new Heap();

  heap.addHeap(10);

  assertEquals("[10]", heap.getHeap().toString());
}
}
