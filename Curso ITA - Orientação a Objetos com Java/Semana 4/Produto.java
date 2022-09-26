
public class Produto {
	
	private String nome;
	private String codigo;
	private double preco;

	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
	
	
//	@Override
//	public boolean equals(Object obj) {		
//		Produto produto = (Produto) obj;
//		return this.codigo.equals(produto.codigo);
//	
//	}
		
//	@Override
//	public int hashCode() {
//		return this.codigo.hashCode();
//	}
	

}
