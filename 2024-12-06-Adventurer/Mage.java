public class Mage extends Adventurer{
  private int mana, maxMana;
  public Mage(String name) {
    super(name);
    mana = 10;
    maxMana = 20;
  }

  public Mage(String name, int HP) {
    super(name, HP);
    mana = 10;
    maxMana = 20;
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

  public String attack(Adventurer other) {
    int dmg = (int) Math.random()*5;
    other.applyDamage(dmg);
    return "Dealt " + dmg.toString + " damage"();
  }

  public String support(Adventurer other) {
    int heal;
    if ((int) Math.random()*3 == 0) {
      heal = 1;
    } else {
      heal = (int) Math.random()*3;
    }
    if (other.getHP() + heal < other.getmaxHP()) {
      other.setHP(other.getHP() + heal);
    } else {
      other.setHP(other.getmaxHP());
    }
  }
}
