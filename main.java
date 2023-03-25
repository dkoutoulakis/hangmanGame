import java.util.Scanner;
import java.util.Arrays;
public class HangmanFinalTest {    

     public static String[] gallows = {"+---+\n" +
     "|   |\n" +
     "    |\n" +
     "    |\n" +
     "    |\n" +
     "    |\n" +
     "=========\n",

     "+---+\n" +
     "|   |\n" +
     "O   |\n" +
     "    |\n" +
     "    |\n" +
     "    |\n" +
     "=========\n",

     "+---+\n" +
     "|   |\n" +
     "O   |\n" +
     "|   |\n" +
     "    |\n" +
     "    |\n" +
     "=========\n",

     " +---+\n" +
     " |   |\n" +
     " O   |\n" +
     "/|   |\n" +
     "     |\n" +
     "     |\n" +
     " =========\n",

     " +---+\n" +
     " |   |\n" +
     " O   |\n" +
     "/|\\  |\n" + 
     "     |\n" +
     "     |\n" +
     " =========\n",

     " +---+\n" +
     " |   |\n" +
     " O   |\n" +
     "/|\\  |\n" +
     "/    |\n" +
     "     |\n" +
     " =========\n",

     " +---+\n" +
     " |   |\n" +
     " O   |\n" +
     "/|\\  |\n" + 
     "/ \\  |\n" +
     "     |\n" +
     " =========\n"};

     public static Scanner scan=new Scanner(System.in);
  
     public static void main(String[] args) {
           //=================TEST1=================
           String word="dolphin";
           System.out.println("Word: "+ word);

        char[] charArray=word.toCharArray();
           System.out.println("\nWord to character Array original: " + Arrays.toString(charArray));
           System.out.println("===============");

           int count=0;
           char[] placeholders=new char[]{'_','_','_','_','_','_','_'};
        char[] wrongGuess=new char[6];
        System.out.println(gallows[count]);
        int wrongAttempt=0;

           while(count<word.length()){
              System.out.println("Count: "+(count));

              System.out.print("\n1.WORD--placeholders original array: "+ Arrays.toString(placeholders));
              
              //=====TEST 2============START
              System.out.print("\n2.MISSES--Wrong guess: ");
              System.out.print(Arrays.toString(wrongGuess)+"\n");
              System.out.print("3.GUESS--User Input: ");
              String userInput=scan.nextLine();


              //=======TEST 2==========END

              int indexOfCharacterInWord=word.indexOf(userInput);
              if(indexOfCharacterInWord>-1){
                       placeholders[indexOfCharacterInWord]=userInput.charAt(0);
                       System.out.println(gallows[wrongAttempt]);
                       }
                       else{
                 System.out.print("\n2.MISSES--Wrong guess: " );
                 wrongGuess[wrongAttempt]=userInput.charAt(0);
                 //  System.out.print(wrongGuess[count] +"\n");
                 wrongAttempt++;
                 System.out.print(Arrays.toString(wrongGuess)+"\n");
                 System.out.println(gallows[wrongAttempt]);
                 count++;
                 if(count==6){
                    System.out.println("You lost- end of game");
                    break;
                 }
                 continue;
              }
              System.out.println("\n2WORD--updated placeholders: " +Arrays.toString(placeholders)+"\n");
              if(count==6){
                 System.out.println("You won- end of game");
                 break;
              }
              count++;

              System.out.println("===============");

           }

           System.out.println("=================TEST!===END===================");
        //===============TEST1================

     }

     }
