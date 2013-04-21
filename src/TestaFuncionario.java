public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Gerente();
		Funcionario f2 = new Diretor();
		
		f1.setSalario(1000);
		f1.setNome("Nome do Gerente");
		f1.setEstaNaEmpresa(true);
		f1.setDataEntrada(31, 02, 1999);

		f2.setDataEntrada(12, 12, 2012);
		f2.setSalario(1000);

		f1.mostra();
		f2.mostra();
		
		/*
		Data dataF1 = new Data();
		f1.setDataEntrada(dataF1);
		dataF1.setDia(31);
		dataF1.setMes(02);
		dataF1.setAno(2012);
		
		f2.setNome("Fiodor");
		
		f1.mostra();
		f2.mostra();
		
		Data dataF2 = new Data();
		f2.setDataEntrada(dataF2);
		dataF2.setDia(10);
		dataF2.setMes(05);
		dataF2.setAno(2010);
		
		Funcionario total = new Funcionario();
		System.out.println(total.getIdentificador());
		
		if (f1 == f2) {
			System.out.println("Iguais");

		} else {

			System.out.println("dif");

		}
		
		f1.bonifica(500);
		
		
		System.out.println(f1.getIdentificador());
		System.out.println(f2.getIdentificador());
		
		System.out.println("o salario é de:" +func.salario);
		System.out.println("o ganho anual é de:" +func.calculaGanhoAnual());
		*/
	}

}
