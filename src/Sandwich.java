
public class Sandwich {
// Insert ingredients, bread and price
	static String mainIngred;
	static String breadType;
	static double price;
// Insert Main Ingredient
	public String getMainIngred(){
			return mainIngred;
	}
// Insert Bread Type	
	public String getBreadType(){
		   return breadType;
	}
//Insert Price
	public double getPrice(){
			return price;
}
//Set Main ingredient, Bread and Price			
	public void setMainIngred(String newMainIngred) {
		mainIngred = newMainIngred;
		
	}

	public void setBreadType(String newBreadType) {
		breadType = newBreadType;
	}

	public void setPrice(double newPrice) {
		price = newPrice;
}
	 
}
