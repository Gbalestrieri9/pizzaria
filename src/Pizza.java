
public class Pizza implements assar{

	private String sabor;
	private String tamanho;
	private double preco;
	
	public String getSabor() {
		return sabor;
	}
	 public void setSabor(String sabor) {
	        if (sabor == null || sabor.trim().isEmpty()) {
	            throw new IllegalArgumentException("Sabor da pizza não pode ser nulo ou vazio.");
	        }
	        this.sabor = sabor;
	    }
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
        if (tamanho == null || tamanho.trim().isEmpty()) {
            throw new IllegalArgumentException("Tamanho da pizza não pode ser nulo ou vazio.");
        }
        this.tamanho = tamanho;
    }
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço da pizza não pode ser negativo.");
        }
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
