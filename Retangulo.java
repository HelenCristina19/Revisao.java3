package revisao;

public class Retangulo extends Forma{
	
	private int comprimento;
	private int largura;
	
	public Retangulo(String cor, int comprimento, int largura) {
		super(cor);
		this.comprimento = comprimento;
		this.comprimento = largura;
	}
	
	public int obterComprimento() {
		return this.comprimento;
	}
	public int obterLargura() {
		return this.largura;
	}
}
