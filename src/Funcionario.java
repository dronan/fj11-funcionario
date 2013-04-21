abstract class Funcionario {
	protected String nome;
	private String departamento;
	protected double salario;
	private Data dataEntrada;
	private String rg;
	protected String cpf;
	private boolean estaNaEmpresa;




	private static int identificadorCont = 1;
	private int identificadorFunc;

	Funcionario() {
		this.identificadorFunc = Funcionario.identificadorCont++;
	}
	
	abstract double getBonificacao();
//	
//	public double getBonificacao(){
//		return this.salario * 0.10;
//	}
//	
	public String getCpf(){
		return this.cpf;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}

	public int getIdentificador() {
		return this.identificadorFunc;
	}

	Funcionario(String nome) {
		this(); // reforÁo a chamada no construtor default
		this.nome = nome;
	}

	void bonifica(double aumento) {
		salario += aumento;
	}

	private double getCalculaGanhoAnual() {
		return salario *= 12;
	}

	void demite() {
	}

	void mostra() {
		System.out.println("Bonificação: "+this.getBonificacao());
		System.out.println("ID: " + identificadorFunc);
		System.out.println("Nome: " + nome);
		System.out.println("Departamento: " + departamento);
		System.out.println("Salario: R$" + salario);
		System.out.println("Data de Entrada: " + dataEntrada.dia + "/"
				+ dataEntrada.mes + "/" + dataEntrada.ano);
		System.out.println("RG: " + rg);
		System.out.println("Esta na Empresa: " + estaNaEmpresa);
		System.out.println("O ganho anual È de: R$" + getCalculaGanhoAnual());
		System.out.println("************************************");

	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Data getDataEntrada() {
		return this.dataEntrada;
	}

	/*
	 * public void setDataEntrada(Data dataEntrada) { this.dataEntrada =
	 * dataEntrada; }
	 */

	public void setDataEntrada(int dia, int mes, int ano) {
		this.dataEntrada = new Data(dia, mes, ano);
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public boolean isEstaNaEmpresa() {
		return this.estaNaEmpresa;
	}

	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}

	

}
