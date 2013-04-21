
public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	public int getSenha() {
		return this.senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	public int getNumeroDeFuncionariosGerenciados() {
		return this.numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(
			int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public double getBonificacao(){
		//return super.getBonificacao() + 1000;
		return super.salario * 0.10 + 1000;
		
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
