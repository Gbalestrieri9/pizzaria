

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	 private List<Pizza> pizzas;

	 public Pedido() {
	        this.pizzas = new ArrayList<>();
	    }

	    public void adicionarPizza(Pizza saborPizza) {
	    	int i = 0;
	        while(i<6){
	        	pizzas.add(saborPizza);
	        	i++;
	        }
	        for(Pizza pizza:pizzas) {
	        	System.out.println("Sabor: " + pizza.getSabor()+" "+ "Tamanho: " + pizza.getTamanho()+ " "+ "Preço: " + pizza.getPreco());
	        }
	       
	        
	    }
	    
	    public double calcularPreco() {
	    	double precoTotal = 0.0;
	    	for(Pizza pizza:pizzas) {
	    		precoTotal += pizza.getPreco();
	    	}
	    	return precoTotal;
	    }
}
