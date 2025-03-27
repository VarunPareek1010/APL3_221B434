public class Main
{
	public static void main(String[] args) {
		Beverage obj = new Whiskey();
		obj.templateMethod(30);
		
		System.out.println();
		
		obj = new Bear();
		obj.templateMethod(300);

	}
}