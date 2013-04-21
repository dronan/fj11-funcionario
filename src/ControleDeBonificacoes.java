public class ControleDeBonificacoes {
	private double totalDeBonificacoes = 0;

	public void registra(Funcionario funcionario) {
		System.out.println("Adicionando bonoficação do funcionario: " +funcionario);
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}

	public static void main(String[] args) {

		ControleDeBonificacoes controle = new ControleDeBonificacoes();

		Funcionario funcionario1 = new Gerente();
		funcionario1.setSalario(1000);
		controle.registra(funcionario1);

		Funcionario funcionario2 = new Diretor();
		funcionario2.setSalario(2000);
		controle.registra(funcionario2);
		
		System.out.println(controle.getTotalDeBonificacoes());
	}
}
