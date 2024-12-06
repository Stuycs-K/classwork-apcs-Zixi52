public class Mage extends Adventurer{
  private int mana, maxMana;
  public Mage(String name) {
    super(name);
    mana = 25;
    maxMana = 100;
  }

  public Mage(String name, int HP) {
    super(name, HP);
    mana = 25;
    maxMana = 100;
  }

  public String getSpecialName() {
    return "mana";
  }

  public int getSpecial() {
    return mana;
  }

  public void setSpecial(int n) {
    mana = n;
  }

  public int getSpecialMax() {
    return maxMana;
  }
}
