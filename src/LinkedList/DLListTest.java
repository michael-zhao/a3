package LinkedList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DLListTest {

	@Test
	public void testPrepend() {
		DLList<Integer> i = new DLList<>();
		assertNull(i.first());
		assertNull(i.last());
		assertEquals(0, i.size());
		i.prepend(4);
		assertEquals("[4]", i.toString());
		assertEquals(4, (int) i.value(i.first()));
		assertEquals(4, (int) i.value(i.last()));
		assertEquals(1, i.size());
		i.prepend(7);
		assertEquals("[7, 4]", i.toString());
		assertEquals(7, (int) i.value(i.first()));
		assertEquals(4, (int) i.value(i.last()));
		assertEquals(2, i.size());
		i.prepend(8);
		assertEquals("[8, 7, 4]", i.toString());
		assertEquals(8, (int) i.value(i.first()));
		assertEquals(4, (int) i.value(i.last()));
		assertEquals(3, i.size());
		
		DLList<String> l = new DLList<>();
		assertNull(l.first());
		assertNull(l.last());
		assertEquals(0, l.size());
		l.prepend("");		
		assertEquals("[]", l.toString());
		assertEquals("", l.value(l.first()));
		assertEquals(1, l.size());
		l.prepend("");
		assertEquals("[, ]", l.toString());
		l.prepend("A");
		assertEquals("[A, , ]", l.toString());
	}
	
	@Test
	public void testgnirtSot() {
		DLList<String> h = new DLList<>();
		assertNull(h.first());
		assertNull(h.last());
		assertEquals(0, h.size());
		
		
	}
}
