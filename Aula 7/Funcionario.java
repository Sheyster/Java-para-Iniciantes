class Funcionario {
	private String nome;
	private double salario;
	private Data dataEntrada;
	private String RG;
	private String departamento;
	public static int identificador = 0;
	
	public Funcionario(String nome){
		this.nome = nome;
		identificador++;
	}
	
	public static int getIdentificador(){
		return identificador;
	}
	
	public static int setIdentificador(int valor){
		identificador + valor;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public void setDataEntrada(Data dataEntrada){
		this.dataEntrada = dataEntrada;
	}
	
	public void setRG(String RG){
		this.RG = RG;
	}
	
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	
	public void recebeAumento(double valor){
		this.salario += valor;
	}
	
	private double calculoGanhoAnual(){
		return this.salario * 12;
	}
	
	public void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Salário: " + this.salario);
		System.out.println("Dia: " + this.dataEntrada.dia);
		System.out.println("Mês: " + this.dataEntrada.mes);
		System.out.println("Ano: " + this.dataEntrada.ano);
		System.out.println("Data de entrada: " + this.dataEntrada.getFormatada());
		System.out.println("RG: " + this.RG);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Ganho anual: " + this.calculoGanhoAnual());
	}
}