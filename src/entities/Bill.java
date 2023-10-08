package entities;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double cover() {
		
		if (feeding() > 30) {
			return 0.0;
		} else {
			return 4.0;
		}
		
	}
	
	public double feeding() {
		return beer * 5.0 + softDrink * 3.0 + barbecue * 7.0;
	}
	
	public double ticket() {
		
		if (gender == 'M' || gender == 'm') {
			return 10.0;
		} else {
			return 8.0;
		}
	}
	
	public double total() {
		return cover() + feeding() + ticket();
	}
	
	public String toString() {
		
		String covert;
		
		if (cover() == 0.0) {
			covert = "Isento de Couvert\n";
		} else {
			covert = String.format("Couvert = R$ %.2f\n", cover());
		}
		
		return "\nRELATÓRIO:\n" 
		+ String.format("Consumo = R$ %.2f\n", feeding())
		+ covert
		+ String.format("Ingresso = R$ %.2f\n\n", ticket())
		+ String.format("Valor a pagar = R$ %.2f\n", total());
		
	}
}