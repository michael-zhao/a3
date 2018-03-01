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
	
	@Test
	public void testDelete() {
		DLList<Integer> i = new DLList<>();
		i.append(3);
		i.append(5);
		i.append(7);
		i.append(9);
		i.append(15);
		
		i.delete(i.first());
		assertEquals("[5, 7, 9, 15]", i.toString());
		assertEquals("[15, 9, 7, 5]", i.gnirtSot());
		assertEquals(4, i.size());
		i.delete(i.last());
		assertEquals("[5, 7, 9]", i.toString());
		assertEquals("[9, 7, 5]", i.gnirtSot());
		assertEquals(3, i.size());
		i.delete(i.getNode(1));
		assertEquals("[5, 9]", i.toString());
		assertEquals("[9, 5]", i.gnirtSot());
		assertEquals(2, i.size());
		i.delete(i.getNode(0));
		assertEquals("[9]", i.toString());
		assertEquals("[9]", i.gnirtSot());
		assertEquals(1, i.size());
		i.delete(i.getNode(0));
		assertEquals("[]", i.toString());
		assertEquals("[]", i.gnirtSot());
		assertEquals(0, i.size());
		
		DLList<String> h = new DLList<>();
		h.append("hello");
		h.append("bye");
		h.append("nani");
		
		h.delete(h.getNode(0));
		assertEquals("[bye, nani]", h.toString());
		assertEquals("[nani, bye]", h.gnirtSot());
		assertEquals(2, h.size());
		h.delete(h.getNode(1));
		assertEquals("[bye]", h.toString());
		assertEquals("[bye]", h.gnirtSot());
		assertEquals(1, h.size());
		h.delete(h.getNode(0));
		assertEquals("[]", h.toString());
		assertEquals("[]", h.gnirtSot());
		assertEquals(0, h.size());
		
		DLList<Integer> j = new DLList<>();
		j.prepend(4);
		j.prepend(8);
		j.prepend(16);
		j.prepend(32);
		j.prepend(64);
		
		j.delete(j.first());
		assertEquals("[32, 16, 8, 4]", j.toString());
		assertEquals("[4, 8, 16, 32]", j.gnirtSot());
		assertEquals(4, j.size());
		j.delete(j.getNode(2));
		assertEquals("[32, 16, 4]", j.toString());
		assertEquals("[4, 16, 32]", j.gnirtSot());
		assertEquals(3, j.size());
		j.delete(j.getNode(1));
		assertEquals("[32, 4]", j.toString());
		assertEquals("[4, 32]", j.gnirtSot());
		assertEquals(2, j.size());
		j.delete(j.getNode(0));
		assertEquals("[4]", j.toString());
		assertEquals("[4]", j.gnirtSot());
		assertEquals(1, j.size());
		j.delete(j.getNode(0));
		assertEquals("[]", j.toString());
		assertEquals("[]", j.gnirtSot());
		assertEquals(0, j.size());
	}
	
	@Test
	public void testinsertAfter() {
		DLList<Integer> i = new DLList<>();
		i.prepend(3);
		i.prepend(12);
		i.prepend(4);
		i.prepend(8);
		i.prepend(32);
		
		i.insertAfter(9, i.first());
		assertEquals("[32, 9, 8, 4, 12, 3]", i.toString());
		assertEquals("[3, 12, 4, 8, 9, 32]", i.gnirtSot());
		assertEquals(6, i.size());
		
		i.insertAfter(15, i.last());
		assertEquals("[32, 9, 8, 4, 12, 3, 15]", i.toString());
		assertEquals("[15, 3, 12, 4, 8, 9, 32]", i.gnirtSot());
		assertEquals(7, i.size());
		
		i.insertAfter(0, i.getNode(3));
		assertEquals("[32, 9, 8, 4, 0, 12, 3, 15]", i.toString());
		assertEquals("[15, 3, 12, 0, 4, 8, 9, 32]", i.gnirtSot());
		assertEquals(8, i.size());
		
		i.insertAfter(434, i.getNode(5));
		assertEquals("[32, 9, 8, 4, 0, 12, 434, 3, 15]", i.toString());
		assertEquals("[15, 3, 434, 12, 0, 4, 8, 9, 32]", i.gnirtSot());
		assertEquals(9, i.size());
		
		DLList<String> s = new DLList<>();
		s.append("hi");
		
		s.insertAfter("bye", s.last());
		assertEquals("[hi, bye]", s.toString());
		assertEquals("[bye, hi]", s.gnirtSot());
		assertEquals(2, s.size());
		
		s.insertAfter("sigh", s.first());
		assertEquals("[hi, sigh, bye]", s.toString());
		assertEquals("[bye, sigh, hi]", s.gnirtSot());
		assertEquals(3, s.size());
		
		s.insertAfter("rye", s.getNode(1));
		assertEquals("[hi, sigh, rye, bye]", s.toString());
		assertEquals("[bye, rye, sigh, hi]", s.gnirtSot());
		assertEquals(4, s.size());
		
		s.insertAfter("lie", s.getNode(2));
		assertEquals("[hi, sigh, rye, lie, bye]", s.toString());
		assertEquals("[bye, lie, rye, sigh, hi]", s.gnirtSot());
		assertEquals(5, s.size());
	}
}
