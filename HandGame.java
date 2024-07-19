import java.util.Random;
import java.util.Scanner;

public class HandGame {
    public static void main(String[] args) {
        String [] hand = {"stein", "papier", "shaere"};
        Random randi = new Random();

        Scanner scanni = new Scanner(System.in);
        
        int counter = 1;
        while (counter < 4){
            String pc = hand[randi.nextInt(hand.length)];
            //System.out.println("Der Computer hat sich schon entschieden, du bist dran.. ");
            System.out.println("Gib ein: shaere, papier oder stein: ");
            String spieler = scanni.nextLine();
            if(pc.equals(spieler)) {
                System.out.println("Du hast "+spieler+" und Computer hat "+pc+" also: Unentschieden!");

            } else if (pc.equals("stein") && spieler.equals("shaere")) {
                System.out.println("Du hast "+spieler+" und Computer hat "+pc+" also: Du hast verloren! ");

            } else if (pc.equals("stein") && spieler.equals("papier")){
                System.out.println("Du hast "+spieler+" und Computer hat "+pc+" also: Du hast gewonnen! ");

            } else if (pc.equals("shaere") && spieler.equals("stein")){
                System.out.println("Du hast "+spieler+" und Computer hat "+pc+" also: Du hast gewonnen! ");

            } else if (pc.equals("shaere") && spieler.equals("papier")){
                System.out.println("Du hast "+spieler+" und Computer hat "+pc+" also: Du hast verloren! ");

            } else if (pc.equals("papier") && spieler.equals("shaere")){
                System.out.println("Du hast "+spieler+" und Computer hat "+pc+" also: Du hast gewonnen! ");

            } else if (pc.equals("papier") && spieler.equals("stein")){
                System.out.println("Du hast "+spieler+" und Computer hat "+pc+" also: Du hast verloren! ");
            } 

            if (counter ==3){
                System.out.println("Du hast nur "+counter+" Versuche");
            }
                
            counter++;

        }//while Loop

    }//main
}//class