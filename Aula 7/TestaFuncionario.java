class TestaFuncionario{
	public static void main(String[] args){
				
		Funcionario funcionario5 = new Funcionario("Elton Ferreira");
		
		//funcionario5.setNome("Elton Ferreira");
		funcionario5.setRG("123456");
		funcionario5.setSalario(1500.00);
		
		Data data = new Data(15, 01, 2010);
		funcionario5.setDataEntrada(data);
		
		System.out.println(Funcionario.identificador);
		
		Funcionario funcionario4 = new Funcionario("Elton Ferreira");
		
		//funcionario4.setNome("Elton Ferreira");
		funcionario4.setRG("123456");
		funcionario4.setSalario(1500.00);
		
		Data data2 = new Data(01, 11, 2015);
		funcionario4.setDataEntrada(data2);
		
		System.out.println(Funcionario.identificador);
		
		Funcionario funcionario3 = new Funcionario("Maria Ferreira");
		
		//funcionario3.setNome("Maria Ferreira");
		funcionario3.setRG("123456");
		funcionario3.setSalario(3000.00);
		
		Data data3 = new Data(29, 02, 2007);
		funcionario3.setDataEntrada(data3);
		
		System.out.println(Funcionario.identificador);
		
		Empresa empresa = new Empresa(10);
		//empresa.funcionarios = new Funcionario[10];

		empresa.adiciona(funcionario5);
		empresa.adiciona(funcionario4);
		empresa.adiciona2(funcionario3);
		empresa.setNome("Teste");
		empresa.setCnpj("12345891");
		
		empresa.mostraFuncionarios();
		
		System.out.println(Funcionario.getIdentificador());
	}
}