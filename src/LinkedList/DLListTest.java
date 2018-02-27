package LinkedList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DLListTest {

	@Test
	public void testConstructor() {
		DLList<Integer> i = new DLList<>();
		assertEquals("[]", i.toString());
		assertEquals("[]",i.gnirtSot());
		assertEquals(0, i.size());
		
		DLList<String> s = new DLList<>();
		assertEquals("[]", s.toString());
		assertEquals("[]", s.gnirtSot());
		assertEquals(0, s.size());
	}
	
	@Test
	public void testPrepend() {
		DLList<Integer> i = new DLList<>();
		i.prepend(6);
		assertEquals("[6]", i.toString());
		assertEquals("[6]", i.gnirtSot());
		assertEquals(1, i.size());
		i.prepend(7);
		assertEquals("[7, 6]", i.toString());
		assertEquals("[6, 7]", i.gnirtSot());
		assertEquals(2, i.size());
		i.prepend(9);
		assertEquals("[9, 7, 6]", i.toString());
		assertEquals("[6, 7, 9]", i.gnirtSot());
		assertEquals(3, i.size());
		i.prepend(28);
		assertEquals("[28, 9, 7, 6]", i.toString());
		assertEquals("[6, 7, 9, 28]", i.gnirtSot());
		assertEquals(4, i.size());
		i.prepend(0);
		assertEquals("[0, 28, 9, 7, 6]", i.toString());
		assertEquals("[6, 7, 9, 28, 0]", i.gnirtSot());
		assertEquals(5, i.size());
		
		DLList<String> l = new DLList<>();
		l.prepend("");		
		assertEquals("[]", l.toString());
		assertEquals("[]", l.gnirtSot());
		assertEquals(1, l.size());
		l.prepend("");
		assertEquals("[, ]", l.toString());
		assertEquals("[, ]", l.gnirtSot());
		assertEquals(2, l.size());
		l.prepend("A");
		assertEquals("[A, , ]", l.toString());
		assertEquals("[, , A]", l.gnirtSot());
		assertEquals(3, l.size());
		l.prepend("Z");
		assertEquals("[Z, A, , ]", l.toString());
		assertEquals("[, , A, Z]", l.gnirtSot());
		assertEquals(4, l.size());
		l.prepend("Zoop");
		assertEquals("[Zoop, Z, A, , ]", l.toString());
		assertEquals("[, , A, Z, Zoop]", l.gnirtSot());
		assertEquals(5, l.size());
	}
	
	@Test
	public void testAppend() {
		DLList<Integer> d = new DLList<>();
		d.append(12);
		assertEquals("[12]", d.toString());
		assertEquals("[12]", d.gnirtSot());
		assertEquals(1, d.size());
		d.append(77);
		assertEquals("[12, 77]", d.toString());
		assertEquals("[77, 12]", d.gnirtSot());
		assertEquals(2, d.size());
		d.append(445);
		assertEquals("[12, 77, 445]", d.toString());
		assertEquals("[445, 77, 12]", d.gnirtSot());
		assertEquals(3, d.size());
		d.append(-5);
		assertEquals("[12, 77, 445, -5]", d.toString());
		assertEquals("[-5, 445, 77, 12]", d.gnirtSot());
		assertEquals(4, d.size());
		d.append(0);
		assertEquals("[12, 77, 445, -5, 0]", d.toString());
		assertEquals("[0, -5, 445, 77, 12]", d.gnirtSot());
		assertEquals(5, d.size());
		
		DLList<String> h = new DLList<>();
		h.append("hecc");
		assertEquals("[hecc]", h.toString());
		assertEquals("[hecc]", h.gnirtSot());
		assertEquals(1, h.size());
		h.append("henlo");
		assertEquals("[hecc, henlo]", h.toString());
		assertEquals("[henlo, hecc]", h.gnirtSot());
		assertEquals(2, h.size());
		h.append("");
		assertEquals("[hecc, henlo, ]", h.toString());
		assertEquals("[, henlo, hecc]", h.gnirtSot());
		assertEquals(3, h.size());
		h.append("go");
		assertEquals("[hecc, henlo, , go]", h.toString());
		assertEquals("[go, , henlo, hecc]", h.gnirtSot());
		assertEquals(4, h.size());
		h.append("hawks");
		assertEquals("[hecc, henlo, , go, hawks]", h.toString());
		assertEquals("[hawks, go, , henlo, hecc]", h.gnirtSot());
		assertEquals(5, h.size());
	}
	
	@Test
	public void testgetNode() {
		DLList<Integer> x = new DLList<>();
		x.append(3);
		x.append(5);
		x.append(12);
		x.append(2);
		x.append(35);
		assertEquals(x.first(), x.getNode(0));
		assertEquals(x.first().next(), x.getNode(1));
		assertEquals(x.first().next().next(), x.getNode(2));
		assertEquals(x.last().prev(), x.getNode(3));
		assertEquals(x.last(), x.getNode(4));
		
		DLList<String> s = new DLList<>();
		s.append("a");
		s.append("b");
		s.append("c");
		s.append("d");
		s.append("e");
		assertEquals(s.first(), s.getNode(0));
		assertEquals(s.first().next(), s.getNode(1));
		assertEquals(s.first().next().next(), s.getNode(2));
		assertEquals(s.last().prev(), s.getNode(3));
		assertEquals(s.last(), s.getNode(4));
	}
}
