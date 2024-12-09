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
      System.out.println(npc.getName() + " HP: " + player.getHP() + "; " + player.getSpecialName() + ": " + player.getSpecial());
      System.out.println(npc.getName() + " HP: " + npc.getHP() + "; " + npc.getSpecialName() + ": " + npc.getSpecial());
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String type = userInput.nextLine();
      if (type.equals("a") || type.equals("attack"))
    }


    //numberformatexception
  }

  public static void options() {
    String type = userInput.nextLine();
    if (type.equals("a") || type.equals("attack")) {
      player.attack(npc);
    } else if (type.equals("sp") || type.equals("special")) {
      player.specialAttack(npc);
    } else if (type.equals("su") || type.equals("support")) {
      player.support();
    } else if (type.equals("quit")) {
      return;
    } else {
      System.out.println("Choose a valid option: ");
    }
  }
}
