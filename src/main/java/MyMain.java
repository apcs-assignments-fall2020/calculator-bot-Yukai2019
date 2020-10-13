public class MyMain {
    public static int median(final int a, final int b, final int c) {
        // Checking for b
        if ((a < b && b < c) || (c < b && b < a))
            return b;

        // Checking for a
        else if ((b < a && a < c) || (c < a && a < b))
            return a;

        else
            return c;

    }

    public static int magnitude(final int a, final int b) {
        if (a < b)
            return b;
        else
            return a;
    }

    public static double pythagoras(final int a, final int b) {
        int c = (a+b)^ (1/2);
        return c;

    }
public static void main(final String[] args) {
    // You may want to keep these lines of code to test that your methods work
    System.out.println(median(1, 2, 3)); // should be 2
    System.out.println(magnitude(-7, -1)); // should be -7
    System.out.println(pythagoras(3, 4)); // should be 5.0

    //final Scanner scan = new Scanner(System.in);
    //system.out.println("Enter the int");
    //final Object scanner;
    //number = scanner.nextInt();
        
    }
}

   
