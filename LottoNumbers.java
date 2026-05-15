import java.util.Scanner;
import java.io.File;

public class LottoNumbers {
    public static void main(String[] args) {
        
        boolean[] isCovered = new boolean[100]; 
        
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the lotto numbers (end with 0): ");
        int number = input.nextInt();
        
       
        while (number != 0) {
            if (number >= 1 && number <= 99) {
                isCovered[number] = true;
            }
            number = input.nextInt();
        }
        
      
        boolean allCovered = true;
        for (int i = 1; i < 100; i++) {
            if (!isCovered[i]) {
                allCovered = false;
                break;
            }
        }
        
      
        if (allCovered) {
            System.out.println("The tickets cover all numbers from 1 to 99.");
        } else {
            System.out.println("The tickets do not cover all numbers from 1 to 99.");
        }
        
        input.close();
    }
}