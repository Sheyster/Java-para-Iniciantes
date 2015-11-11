class Empresa {
	String nome;
	String cnpj;
	Funcionario[] funcionarios = new Funcionario[10];
	static int contador = 0;
	boolean cadastrado = false;
	
	void adiciona(Funcionario f){
		this.funcionarios[contador] =f;
		this.contador++;
	}
	
	void adiciona2(Funcionario f){
		for(int i = 0; i <= this.funcionarios.length -1; i++){
			if(this.funcionarios[i] == null && !this.cadastrado){
				this.funcionarios[i] = f;
				this.cadastrado = true;
			}
		}
	}
	
	void mostraFuncionarios(){
		for(int i = 0; i <= this.funcionarios.length -1; i++){
			if(this.funcionarios[i] != null){
				this.funcionarios[i].mostra();
			}
		}
	}
	
	boolean contem(Funcionario f){
		for(int i = 0; i <= this.funcionarios.length -1; i++){
			if(this.funcionarios[i] != null){
				if(f == this.funcionarios[i]){
					return true;
				}
			}
		}
		return false;
	}
}