import javax.swing.JOptionPane;
public class TestSandwich {

	public static void main(String[] args) {
		//Instantiate a Sandwich
		Sandwich cjsSandwich = new Sandwich();
		
		//Set values of the fields sandwich
		String mainIngred =
				JOptionPane.showInputDialog("What type of meat do you want?");
		cjsSandwich.setMainIngred(mainIngred);
		
		String breadType =
				JOptionPane.showInputDialog("What type of bread do you want?");
		cjsSandwich.setBreadType(breadType);
		
		double price =
				Double.parseDouble(JOptionPane.showInputDialog("The price is."));
	
		cjsSandwich.setPrice(price);
		
		//Output the details of CJ's Sandwich
		JOptionPane.showMessageDialog(null,  "your " + cjsSandwich.getMainIngred() + " sandwich on " +
				cjsSandwich.getBreadType() + " bread will cost" + cjsSandwich.getPrice());
		 

	}

}
