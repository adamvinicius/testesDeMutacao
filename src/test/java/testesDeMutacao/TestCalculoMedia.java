package testesDeMutacao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculoMedia {
	@Test
	public void testReprovado() {
		CalculoMedia calculoMedia = new CalculoMedia(5.99, 6);
		assertEquals("Reprovado", calculoMedia.getStiuacao());
	}
	
	@Test
	public void testAprovado() {
		CalculoMedia calculoMedia = new CalculoMedia();
		calculoMedia.setNota1(6);
		calculoMedia.setNota2(6);
		assertEquals("Aprovado", calculoMedia.getStiuacao());
	}
}
