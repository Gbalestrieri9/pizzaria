

public class testePizza {
	
	public static void main(String[] args) {
		Pizza pizza = new Pizza("Portuguesa","Grande", 30.0);
		
		try {
			Pedido pedido = new Pedido();
			pedido.adicionarPizza(pizza);
			
			System.out.println("Preço total do pedido: " + pedido.calcularPreco());
		}
		catch(RuntimeException e){
			throw new IllegalArgumentException(e.getMessage());
		}
	
		
	}

}
