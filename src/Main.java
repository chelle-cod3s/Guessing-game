import java.util.Random;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Welcome to the Gezelle!!
                A random number will be generated and you would have 3 attempts to guess it.
               You will be prompted if you are getting closer or farther .
                Good luck!""" );
        
        Random random =new Random();
         int value= random.nextInt(6)+1;
////testing the value with user input
//        System.out.println(value);

        int k =3;
        Scanner scanner=new Scanner(System.in);
        boolean correct  = false;

        while(k>0){
            System.out.println("Enter your guess:");
            int guess= scanner.nextInt();
            if(guess == value){
                System.out.println("welldone! You win!!");
                correct =true;
                break;
            } else if (guess > value) {
                System.out.println("you are too high.\nYou have "+(k-1)+" attempts left");
                k--;

            } else  if(guess < value ){
                System.out.println("you are too low.\nYou have "+(k-1)+" attempts left");
                k--;
            }


        }
        if (correct == false){
            System.out.println("You have run out of attempts.You lost!");

        }


        }

    }
