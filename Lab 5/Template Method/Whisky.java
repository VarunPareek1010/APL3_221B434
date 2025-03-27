class Whiskey extends Beverage{
    protected void addCondiment(){
        System.out.println("Add 6 ice cubes.");
    }
    
    
    // Overridden in child class.
    protected void stir(){
        System.out.println("Stir for 30 sec only.");
    }
}