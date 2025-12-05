public class Variable {
    public static void main(String[] args) {
         
        int number = 10;

        
        String greeting = "Hello";

        
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};

       
        System.out.println("Number: " + number);

        
        System.out.println("Greeting: " + greeting);

        
        System.out.println("Fruits array:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("- " + fruits[i]);
        }
    }
}