class TestaFuncionario{
	public static void main(String[] args){
		/*Funcionario funcionario = new Funcionario();
		
		funcionario.nome = "Elton Ferreira";
		funcionario.RG = "123456";
		funcionario.dataEntrada = "05/05/2005";
		funcionario.salario = 1500.00;
		
		funcionario.mostra();
		
		funcionario.recebeAumento(500.00);
		
		funcionario.mostra();
		
		Funcionario funcionario2 = new Funcionario();
		
		funcionario2.nome = "Maria da Silva";
		funcionario2.RG = "987654";
		funcionario2.dataEntrada = "11/11/2011";
		funcionario2.salario = 500.00;
		
		funcionario2.mostra();
		
		Funcionario funcionario3 = new Funcionario();
		
		funcionario3.nome = "Maria da Silva";
		funcionario3.RG = "987654";
		funcionario3.dataEntrada = "11/11/2011";
		funcionario3.salario = 500.00;
		
		funcionario3.mostra();
		
		if(funcionario2 == funcionario3){
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		
		Funcionario funcionario4 = funcionario3;
		
		if(funcionario3 == funcionario4){
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}*/
		
		Funcionario funcionario5 = new Funcionario();
		
		funcionario5.nome = "Elton Ferreira";
		funcionario5.RG = "123456";
		funcionario5.salario = 1500.00;
		
		//funcionario5.mostra();
		
		Data data = new Data(15, 01, 2010);
		funcionario5.dataEntrada = data;
		
		Funcionario funcionario4 = new Funcionario();
		
		funcionario4.nome = "Elton Ferreira";
		funcionario4.RG = "123456";
		funcionario4.salario = 1500.00;
		
		Data data2 = new Data(01, 11, 2015);
		funcionario4.dataEntrada = data2;
		
		Funcionario funcionario3 = new Funcionario();
		
		funcionario3.nome = "Maria Ferreira";
		funcionario3.RG = "128949516";
		funcionario3.salario = 3000.00;
		
		Data data3 = new Data(03, 03, 2003);
		funcionario3.dataEntrada = data3;
		
		Funcionario funcionario2 = new Funcionario();
		
		funcionario2.nome = "Maria Ferreira";
		funcionario2.RG = "128949516";
		funcionario2.salario = 3000.00;
		
		Data data5 = new Data(03, 03, 2003);
		funcionario2.dataEntrada = data5;
		
		//funcionario5.mostra();
		
		//Funcionario.salario = 1234;
		
		//Funcionario.calculoGanhoAnual();
		
		Empresa empresa = new Empresa();
		empresa.funcionarios = new Funcionario[10];
		
		//empresa.funcionarios = new Funcionario();
		//empresa.funcionarios[0] = funcionario5;
		empresa.adiciona(funcionario5);
		empresa.adiciona(funcionario4);
		empresa.adiciona2(funcionario3);
		empresa.nome = "Teste";
		empresa.cnpj = "12345891";
		
		empresa.mostraFuncionarios();
		
		System.out.println(empresa.contem(funcionario3));
		System.out.println(empresa.contem(funcionario2));
		
	}
}