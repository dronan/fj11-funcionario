
public class TestaGerente {
	public static void main (String[] args){
		/*
		Gerente gerente = new Gerente();
		gerente.setNome("Joao");
		gerente.setSenha(1234);
		gerente.setSalario(5000.0);
		System.out.println(gerente.getBonificacao());
		*/
		Gerente g = new Gerente();
		Funcionario f = g;
		f.setSalario(1000);
		
		System.out.println(f.getBonificacao());
	}
	
}
