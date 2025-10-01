package gymquest;

import java.util.Scanner;

public class Hero extends Character {
// LÄGG TILL MAXHP
// LÄGG TILL XP
    public Hero() {
       Scanner input = new Scanner(System.in); // Skapar SCanner som kommer att låta användaren sätta in ett namn för hjälten.
       System.out.println("Döp din hjälte:");
       String namn = input.nextLine();
       setName(namn);
       setHp(100);
       setDamage(10);
    }

}
