package learning_from;

import java.util.Scanner;


public class project_hypothetical_angry_girlfriend {
    public static void main(String[] args){
        int anger = 1;
        int forgiveness = 1;
        System.out.println("SHE: I am fed up by the way you live.");

        Scanner sc = new Scanner(System.in);



        while (anger<5 && forgiveness<5){
            System.out.print("YOU: ");
            String reply = sc.nextLine();

            if(reply.length()>2000){
                System.out.println("SHE: bla bla bla...");
                anger++;
            }
            else{
                if(reply.toLowerCase().contains("sorry") && forgiveness<5){
                    if(forgiveness!=4){
                        System.out.println("SHE: Do you think that sorry is a solution to everything.");
                        forgiveness++;
                    }
                    else{
                        forgiveness++;
                    }
                }

                else if(reply.toLowerCase().contains("my fault") && forgiveness<5){
                    if(forgiveness!=4){
                        System.out.println("SHE: Of course, it is your fault.");
                        forgiveness++;
                    }
                    else{
                        forgiveness++;
                    }
                }
                else if(reply.toLowerCase().contains("your fault") && anger<5){
                    if(anger!=4){
                        System.out.println("SHE: Don't you dare to blame me for all this.");
                        anger++;
                    }
                    else{
                        anger++;
                    }
                }
                else{

                    System.out.println("SHE: What did you just say.");
                }
            }
        }
        if(anger == 5){
            System.out.println("SHE: You know what, I am breaking up with you.");
            System.out.println("YOU: Then, I guess this is the end.");
        }
        else{
            System.out.println("SHE: I am really sorry for saying all this to you and\nI want you to know that it did not mean something.");
            System.out.println("YOU: I know and I am also sorry for everything.");
            System.out.println("SHE: So, are we still together?");
            System.out.println("YOU: Absolutely");
        }


    }
}

