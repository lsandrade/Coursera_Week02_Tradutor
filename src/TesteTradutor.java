import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/*
 * Cenários:
 * (x) Tradutor sem palavras
 * (x) Uma tradução
 * (x) Duas traduções
 * (x) Duas traduções mesma palavra
 * (x) Traduzir frases
 */

public class TesteTradutor {
	
	private Tradutor t;
	
	@Before
	public void criarTradutor(){
		t = new Tradutor();
	}
	@Test
	public void testTradutorSemPalavras() {
		assertTrue(t.estaVazio());
	}
	
	@Test
	public void testUmaTraducao(){
		t.adicionaTraducao("bom","good");
		assertFalse(t.estaVazio());
		assertEquals("good",t.traduzir("bom"));
		
	}
	
	@Test
	public void testDuasTraducoes(){
		t.adicionaTraducao("bom","good");
		t.adicionaTraducao("mau","bad");
		
		assertEquals("good",t.traduzir("bom"));
		assertEquals("bad",t.traduzir("mau"));
	}
	
	@Test
	public void testDuasTraducoesMesmaPalavra(){
		t.adicionaTraducao("bom","good");
		t.adicionaTraducao("bom","nice");
		
		assertEquals("good, nice",t.traduzir("bom"));	
	}
	
	@Test
	public void testTraduzirFrase(){
		t.adicionaTraducao("guerra","war");
		t.adicionaTraducao("é","is");
		t.adicionaTraducao("ruim", "bad");
		
		assertEquals("war is bad",t.traduzirFrase("guerra é ruim"));
		
	}
		
}
