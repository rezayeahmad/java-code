import java.util.Scanner;

public class GuessBirthdayUsingArray {
    public static void main(String[] args) {
        
        int[][][] cards = {
            {
                {1, 3, 5, 7},
                {9, 11, 13, 15},
                {17, 19, 21, 23},
                {25, 27, 29, 31}
            },
            {
                {2, 3, 6, 7},
                {10, 11, 14, 15},
                {18, 19, 22, 23},
                {26, 27, 30, 31}
            },
            {
                {4, 5, 6, 7},
                {12, 13, 14, 15},
                {20, 21, 22, 23},
                {28, 29, 30, 31}
            },
            {
                {8, 9, 10, 11},
                {12, 13, 14, 15},
                {24, 25, 26, 27},
                {28, 29, 30, 31}
            },
            {
                {16, 17, 18, 19},
                {20, 21, 22, 23},
                {24, 25, 26, 27},
                {28, 29, 30, 31}
            }
        };

        Scanner input = new Scanner(System.in);
        int birthday = 0;


        for (int i = 0; i < 5; i++) {
            System.out.println("Is your birthday in Set " + (i + 1) + "?");
            
          
            for (int row = 0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    System.out.print(cards[i][row][col] + "\t");
                }
                System.out.println();
            }

            System.out.print("\nEnter 0 for No and 1 for Yes: ");
            int answer = input.nextInt();

           
            if (answer == 1) {
                birthday += cards[i][0][0];
            }
            System.out.println();
       }        if (birthday > 0 && birthday <= 31) {
            System.out.println("Your birthday is " + birthday + "!");
        } else {
            System.out.println("Invalid answers! No birthday corresponds to these choices.");
        }
        
        input.close();
    }
}