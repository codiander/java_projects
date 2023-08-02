import java.util.Scanner;
import java.util.Random;

class Game{
    public int number;
    public int input;
    public int numberofguesses;

    public int getNumberofguesses(){
        return numberofguesses;
    }

    public void setNumberofguesses(){
        this.numberofguesses = numberofguesses;
    }


    Game(){
        Random ran = new Random();
         this.number = ran.nextInt(100);
    }
    void takeuserinput(){
        numberofguesses++;
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
    }

    boolean iscorrectnumber(){
        if(input == number){
            System.out.println("you are right.");
            System.out.printf("You got it in %d attempts.",numberofguesses);
            return true;
        } else if (input > number) {
            System.out.println("too large...");
        return false;
        }
        else{
            System.out.println("too small...");
            return false;
        }

    }


}


public class randomnumbergame {
    public static void main(String[] args) {
        Game g = new Game();
        boolean choice =false;


        while(!choice){
            g.takeuserinput();
        choice = g.iscorrectnumber();

    }
}
}
