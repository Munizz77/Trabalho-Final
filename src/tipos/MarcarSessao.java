package tipos;


public class MarcarSessao implements Comparable<MarcarSessao>{
	
	private String codigoCliente;
	private String nome;
	private String cpf;
	private String telefone;
	private String localMassagem;
	private Double preco;
	private String data;
	
	
	
	public MarcarSessao(String codigoCliente, String nome, String cpf, String telefone, String localMassagem, double preco, String data) {
		this.codigoCliente = codigoCliente;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.localMassagem = localMassagem;
		this.preco = preco;
		this.data = data;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}

    public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getLocalMassagem() {
		return localMassagem;
	}
	public void setLocalMassagem(String localMassagem) {
		this.localMassagem = localMassagem;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		MarcarSessao marcar = (MarcarSessao) o;
		
		return codigoCliente != null ? codigoCliente.equals(marcar.codigoCliente) : marcar.codigoCliente == null;
		
	}
	
	@Override
	public int hashCode() { return codigoCliente != null? codigoCliente.hashCode() : 0;}
	
	@Override
	public String toString() {
		return "MarcarSessao{codigoCliente = " + codigoCliente + ", Nome = "+ nome + " , Cpf = " + cpf + " , Telefone = " + telefone +
				" , Local da Massagem = " + localMassagem + " , Preço = " + preco + " ,Data = " + data;
	          
	}
	
	@Override
    public int compareTo(MarcarSessao outroObjeto) {
		
		return this.preco.compareTo(outroObjeto.getPreco());
	}
	
	
	
	

}
