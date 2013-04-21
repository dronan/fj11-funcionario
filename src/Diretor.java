
public class Diretor extends Funcionario implements Autenticavel{

	private int senha;

	public double getBonificacao(){
		return super.salario + 1000 * 2;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso permitido");
			return true;
		} else {
			System.out.println("Acesso negado");
			return false;
		}
	}
	
}
