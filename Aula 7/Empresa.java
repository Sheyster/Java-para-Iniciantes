class Empresa {
	private String nome;
	private String cnpj;
	private Funcionario[] funcionarios;
	private static int contador = 0;
	private boolean cadastrado = false;
	
	public Empresa(int tamanho){
		funcionarios = new Funcionario[tamanho];
	}
	
	void adiciona(Funcionario f){
		this.setFuncionario(f, contador);
		this.contador++;
	}
	
	void adiciona2(Funcionario f){
		for(int i = 0; i <= funcionarios.length -1; i++){
			if(funcionarios[i] == null && !cadastrado){
				this.setFuncionario(f, i);
				this.cadastrado = true;
			}
		}
	}
	
	void mostraFuncionarios(){
		for(int i = 0; i <= funcionarios.length -1; i++){
			if(funcionarios[i] != null){
				this.funcionarios[i].mostra();
			}
		}
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}
	
	public void setFuncionario(Funcionario f, int posicao){
		funcionarios[posicao] = f;
	}
	
	public Funcionario getFuncionario(int posicao){
		return this.funcionarios[posicao];
	}
}