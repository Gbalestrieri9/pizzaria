package pizzaria;

public class Pizza implements assar{

	private String sabor;
	private String tamanho;
	private double preco;
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Pizza(String sabor, String tamanho, double preco) {
		this.sabor = sabor;
		this.tamanho = tamanho;
		this.preco = preco;
	}
	
	public void imprimirDetalhes(Pizza[] pizzas) {
	    for (Pizza pizza : pizzas) {
	        System.out.println("Pizza: " + pizza.getSabor() + ", Tamanho: " + pizza.getTamanho() + ", Preço: " + pizza.getPreco());
	    }
	}
	@Override
	public void assarPizza() {
		
	}
	
	

	
	
}
