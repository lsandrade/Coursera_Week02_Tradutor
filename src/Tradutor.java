import java.util.HashMap;
import java.util.Map;


public class Tradutor {
	
	private Map<String,String> traducoes = new HashMap<>();

	public boolean estaVazio() {
		return this.traducoes.isEmpty();
	}

	public void adicionaTraducao(String palavra, String traducao) {
		this.traducoes.put(palavra, traducao);
	}

	public String traduzir(String palavra) {
		return this.traducoes.get(palavra);
	}

}
