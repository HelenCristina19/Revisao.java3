package revisao;

public class TestaFormas {

	public static void main(String[] args) {
		
		Retangulo r = new Retangulo("Pink", 10,5);
		System.out.println(r.obterCor());
		r.definirCor("Purple");
				
			System.out.println(r.obterCor());
	}

}
