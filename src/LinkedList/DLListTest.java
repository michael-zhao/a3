package LinkedList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DLListTest {

	@Test
	public void testgnirtSot() {
		DLList<Integer> i = new DLList<>();
		i.prepend(4);
		assertEquals("[4]", i.gnirtSot());
		i.prepend(7);
		assertEquals("[4, 7]", i.gnirtSot());
		i.prepend(8);
		assertEquals("[4, 7, 8]", i.gnirtSot());
		
		DLList<String> l = new DLList<>();
		l.prepend("");
		l.prepend("");
		
		assertEquals("[, ]", l.gnirtSot());
	}
}
