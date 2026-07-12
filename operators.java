public class operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Increment: " + (++a));
        System.out.println("Decrement: " + (--b));  
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));  
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("Logical AND: " + ((a > 5) && (b < 30)));
        System.out.println("Logical OR: " + ((a > 5) || (b  < 30)));
    }
}
