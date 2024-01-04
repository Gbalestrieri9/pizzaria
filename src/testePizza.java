package pizzaria;

public class testePizza {
	
	public static void main(String[] args) {
		Pizza pizza = new Pizza("Portuguesa","Grande", 30.0);
		
		Pedido pedido = new Pedido();
		pedido.adicionarPizza(pizza);
		
		System.out.println("Preço total do pedido: " + pedido.calcularPreco());
	
		
	}

}
