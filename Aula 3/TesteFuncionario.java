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
		
		Data data = new Data(15, 01, 2010);
		funcionario5.dataEntrada = data;
		
		funcionario5.mostra();
	}
}