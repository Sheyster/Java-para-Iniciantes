class Empresa {
	String nome;
	String cnpj;
	Funcionario[] funcionarios = new Funcionario[10];
	static int contador = 0;
	boolean cadastrado = false;
	
	void adiciona(Funcionario f){
		funcionarios[contador] =f;
		contador++;
	}
	
	void adiciona2(Funcionario f){
		for(int i = 0; i <= funcionarios.length -1; i++){
			if(funcionarios[i] == null && !cadastrado){
				funcionarios[i] = f;
				cadastrado = true;
			}
		}
	}
	
	void mostraFuncionarios(){
		for(int i = 0; i <= funcionarios.length -1; i++){
			if(funcionarios[i] != null){
				funcionarios[i].mostra();
			}
		}
	}
}