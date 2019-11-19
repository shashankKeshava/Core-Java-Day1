package Lab01;

import java.util.Scanner;

//Guess a random number betwwen 1 and 100
public class Lab01 {
    public static void main(String [] args){
        int target =(int)(Math.random()*100);
        System.out.println("Enter a number between 1 and 100");
        Scanner Input=new Scanner(System.in);
        int guess=-1;
        boolean IsWrong=true;
        int attempts = 0;
        while(IsWrong){
            attempts++;
            guess=Input.nextInt();
            if(guess<target){
                System.out.println("Your guess is lower");
            }else if(guess>target){
                System.out.println("Your guess is higher");
            }else{
                System.out.println("You Got it Right !!!"+"Attempts:"+attempts);
                IsWrong=false;
            }

        }
    }
}
