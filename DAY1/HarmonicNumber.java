import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

      
        if (N == 0) {
            System.out.println("N should be greater than 0.");
            return;
        }

        
        double Hn = 0.0;
        for (int i = 1; i <= N; i++) {
           Hn += 1.0 / i;
        }

        
        System.out.println("The " + N + "th Harmonic Number is: " + Hn);

        
        sc.close();
    }
}
