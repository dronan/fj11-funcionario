public class TestaEmpresa {
	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		
		Funcionario f1 = new Gerente();
		//Data dataF1 = new Data();
		//f1.setDataEntrada(dataF1);
		
		//dataF1.setDia(1);
		//dataF1.setMes(2);
		//dataF1.setAno(2011);
		
		f1.setDataEntrada(1, 2, 2011);
		f1.setNome("fulano");
		f1.setEstaNaEmpresa(true);
		f1.setSalario(1000);
		
		
		Funcionario f2 = new Diretor();
		//Data dataF2 = new Data();
		//f2.setDataEntrada(dataF2);
		
//		dataF2.setDia(10);
//		dataF2.setMes(11);
//		dataF2.setAno(2012);
		
		f2.setDataEntrada(10, 11, 2012);
		f2.setEstaNaEmpresa(true);
		f2.setNome("Ciclano");
		f2.setSalario(2700);
		
		
		Funcionario f3 = new Gerente();
//		Data dataF3 = new Data();
//		f3.setDataEntrada(dataF3);
//		
		f3.setEstaNaEmpresa(false);
//		dataF3.setDia(10);
//		dataF3.setMes(11);
//		dataF3.setAno(2012);
		f3.setDataEntrada(10, 11, 2012);
		f3.setNome("Ciclano");
		f3.setSalario(180);
		
		Funcionario f4 = new Diretor();
//		Data dataF4 = new Data(); 		
//		f4.setDataEntrada(dataF4);
//		
//		dataF4.setDia(10);
//		dataF4.setMes(11);
//		dataF4.setAno(2012);
		
		f4.setDataEntrada(10, 11, 2012);
		f4.setEstaNaEmpresa(true);
		f4.setNome("Ciclano");
		f4.setSalario(100);
		
		Funcionario f5 = new Presidente();
//		Data dataF5 = new Data();
//		f5.setDataEntrada(dataF5);
//		
//		
		f5.setEstaNaEmpresa(false);
//		dataF5.setDia(10);
//		dataF5.setMes(11);
//		dataF5.setAno(2012);
		f5.setDataEntrada(10, 11, 2012);
		f5.setNome("Ciclano");
		f5.setSalario(700);		
		
		empresa.adiciona(f1);
		empresa.adiciona(f2);
		empresa.adiciona(f3);
		empresa.adiciona(f4);
		empresa.adiciona(f5);		
		
		empresa.mostraEmpregados();
		

		
		//System.out.println(empresa.contem(f1));
		
		
	}
}
