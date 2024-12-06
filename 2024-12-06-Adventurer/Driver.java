public class Driver{
  public static void main(String[] args) {
    Adventurer p1 = new Mage("Tenz", 10);
    Adventurer p2 = new Mage("Faker", 10);
    p1.getSpecialName();
    p1.getSpecial();
    p1.setSpecial(15);
    p1.getSpecial();
    p1.getSpecialMax();
  }
}
