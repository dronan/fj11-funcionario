public class Empresa {
	private String nome;
	private String cnpj;
	private int total = 0;
	private Funcionario[] empregados = new Funcionario[total];
	
	Empresa(){
		
	}
	
	Empresa(int total){
		this();
		this.total++;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getCnpj(){
		return this.cnpj;
	}

	public Funcionario getFuncionario(int posicao){
		return this.empregados[posicao];
	}
	
	void adiciona(Funcionario f) {

		/*
		int contador = 0;
		for (int z = 0; z < this.empregados.length; z++) {
			if (this.empregados[z] != null)
				contador++;
		}
		
		if (contador < this.empregados.length) {
		 */
			for (int i = 0; i < this.empregados.length; i++) {
				if (this.empregados[i] == null) {
					this.empregados[i] = f;
					return;

				}
			}

			Funcionario[] empregadosNew = new Funcionario[this.empregados.length + 1];
			for (int i = 0; i < this.empregados.length; i++){
					
				empregadosNew[i] = empregados[i];
		
			}
			
			this.empregados = empregadosNew;
			
			this.adiciona(f);
			
		/*} else {
			//System.out.println("vetor cheio");
						

		}*/
	}

	void mostraEmpregados() {

		for (int i = 0; i < this.empregados.length; i++) {
			if (this.empregados[i] != null) {
				this.empregados[i].mostra();
				System.out.println("***********************************");
				// System.out.println("Funcionario na posição: " + i + " - "
				// + this.empregados[i].salario);
			}

		}

	}

	boolean contem(Funcionario f) {
		boolean x = false;
		for (int i = 0; i < this.empregados.length; i++) {
			if (this.empregados[i] == f) {
				x = this.empregados[i].isEstaNaEmpresa();
				break;
			}
		}
		return x;
	}
}
