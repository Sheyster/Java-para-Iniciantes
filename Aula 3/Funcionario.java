class Funcionario {
	String nome;
	double salario;
	Data dataEntrada;
	String RG;
	String departamento;
	
	void recebeAumento(double valor){
		this.salario += valor;
	}
	
	double calculoGanhoAnual(){
		return this.salario * 12;
	}
	
	void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Salário: " + this.salario);
		System.out.println("Data de entrada: " + this.dataEntrada.mostra());
		System.out.println("RG: " + this.RG);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Ganho anual: " + this.calculoGanhoAnual());
	}
}