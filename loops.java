public class loops {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("While Loop: " + i);
            i++;
        }

        for (int j = 1; j <= 5; j++) {
            System.out.println("For Loop: " + j);
        }

        int k = 1;
        do {
            System.out.println("Do-While Loop: " + k);
            k++;
        } while (k <= 5);
    }
    
}
