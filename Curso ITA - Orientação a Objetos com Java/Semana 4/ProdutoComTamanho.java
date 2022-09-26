
public class ProdutoComTamanho extends Produto {

	
	private String tamanho;
	
	
	public ProdutoComTamanho(String nome, String codigo, double preco, String tamanho) {
		super.setNome(nome);
		super.setCodigo(codigo);
		super.setPreco(preco);
		this.tamanho = tamanho;
	}

	@Override
	public boolean equals(Object obj) {		
		ProdutoComTamanho produtoComTamanho = (ProdutoComTamanho) obj;
		return (this.getCodigo().equals(produtoComTamanho.getCodigo())) 
				&& this.tamanho.equals(produtoComTamanho.tamanho);	
	}
	
	
	@Override
	public int hashCode() {
		return this.tamanho.hashCode() + this.getCodigo().hashCode();
	}
	
	@Override
	public String toString() {
		return "Nome do produto: " + super.getNome() + "\n Código do produto: " +
				super.getCodigo() +  "\n Preço do produto: " + super.getPreco()
				+ "\n Tamanho do produto: " + this.tamanho;
	}
	
}
