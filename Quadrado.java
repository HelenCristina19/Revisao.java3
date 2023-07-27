package revisao;

public class Quadrado extends Retangulo {
	
	public Quadrado (String cor, int lado) {
		super(cor, lado, lado);
		
	}
	public int obterLado() {
		return obterComprimento();
	}
	
	}

