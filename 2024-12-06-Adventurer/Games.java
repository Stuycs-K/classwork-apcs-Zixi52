import java.util.Scanner;
public class Games {
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);

    System.out.println("Enter username: ");
    String userName = userInput.nextLine();
    Adventurer player = new Mage(userName, 15);
    Adventurer npc = new CodeWarrior("Mightiest NPC", 15);
    //You can do the rest many times:

    while(player.getHP() > 0 && npc.getHP() > 0){
      System.out.println(player.getName() + " HP: " + player.getHP() + "; " + player.getSpecialName() + ": " + player.getSpecial());
      System.out.println(npc.getName() + " HP: " + npc.getHP() + "; " + npc.getSpecialName() + ": " + npc.getSpecial());
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String type = userInput.nextLine();
      if (type.equals("a") || type.equals("attack")) {
        System.out.println(player.attack(npc));
      } else if (type.equals("sp") || type.equals("special")) {
        System.out.println(player.specialAttack(npc));
      } else if (type.equals("su") || type.equals("support")) {
        System.out.println(player.support());
      } else if (type.equals("quit")) {
        System.out.println("You have quit the game");
        break;
      } else {
        System.out.println("Choose a valid option: ");
        continue;
      }
      if (npc.getHP() <= 0) {
        break;
      }
      double botRoll = Math.random();
      if (botRoll < 0.5) {
        System.out.println(npc.attack(player));
      } else if (botRoll < 0.75) {
        System.out.println(npc.specialAttack(player));
      } else if (botRoll <= 1) {
        System.out.println(npc.support());
      }
    }
    if (npc.getHP() <= 0) {
      System.out.println(userName + " has won");
    } else {
      System.out.println("npc has won");
    }
  }
}
