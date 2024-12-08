public class Driver{
  public static void main(String[] args) {
    Adventurer p1 = new Mage("Tenz", 10);
    Adventurer p2 = new Mage("Faker", 10);
    Adventurer p3 = new Mage("Villager 3", 5);
    System.out.println(p1.getSpecialName());
    System.out.println(p1.getSpecial());
    p1.setSpecial(15);
    System.out.println(p1.getSpecial());
    System.out.println(p1.getSpecialMax());
    System.out.println(p1.attack(p2));
    System.out.println(p3.support(p2));
    System.out.println(p2.support());
    System.out.println(p1.specialAttack(p2)); 
    System.out.println(p1.getSpecial());   
  }
}
