package default_package;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
	
	@Test
	public void testImpedido() {
		
		int[] a = {100,200};
		int[] b = {200};
		int[] c = new int[2];
		
		boolean inpedido = Main.verificaInpedimento(2, 1, a, b);
		assertTrue(inpedido);
		
		a[0] = 100; a[1] = 200;
		c[0] = 50; c[1] = 150;
		inpedido = Main.verificaInpedimento(2, 2, a, c);
		assertTrue(inpedido);
		
		a[0] = 100; a[1] = 200;
		c[0] = 150; c[1] = 150;
		inpedido = Main.verificaInpedimento(2, 2, a, c);
		assertTrue(inpedido);
	}

	@Test
	public void testNaoImpedido() {
		
		int[] a = {500,700};
		int[] b = {700,500,500};
		int[] c = new int[2];
		
		boolean inpedido = Main.verificaInpedimento(2, 3, a, b);
		assertFalse(inpedido);
		
		a[0] = 700; a[1] = 500;
		c[0] = 500; c[1] = 500;
		inpedido = Main.verificaInpedimento(2, 2, a, c);
		assertFalse(inpedido);
	}
}
