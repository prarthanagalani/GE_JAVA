import java.util.Scanner;

public class CheckForVowel{
   
       public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            //String str = sc.nextLine();

            System.out.println("Enter a character: ");

            char c = sc.next().charAt(0);
           
            char ch = Character.toLowerCase(c);
            
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
              System.out.println(c + " is vowel.");
            }
            else{
             System.out.println(c + " is consonant.");
           }
       
   sc.close();
}
}

            

            
            