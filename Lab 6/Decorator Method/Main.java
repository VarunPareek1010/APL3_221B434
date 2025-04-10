public class Main
{
	public static void main(String[] args) {
		Offering offering = new Coffee();
		offering = new Gin(offering); //Coffe with Gin...
		offering = new Gin(offering); // Coffee with Gin with Gin...
		
		System.out.println("Your drink: "+offering.getName()); 
		System.out.println("Price: "+offering.getPrice());
	}
}
