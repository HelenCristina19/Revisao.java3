package revisao;

public class Forma {
    private String cor;
    
    //public Forma() {
    	//cor = "Vermelho";
    //}
    
    
    public Forma(String cor) {
    	this.cor = cor;
    }
    
    public String obterCor() {
    	return cor;
    	
    }
    public void definirCor(String cor) {
    	this.cor = cor;
    	
    }
    
}