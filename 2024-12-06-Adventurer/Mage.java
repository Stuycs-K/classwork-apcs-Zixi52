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

  @Override
  public String getSpecialName() {
    return "mana";
  }

  @Override
  public int getSpecial() {
    return mana;
  }

  @Override
  public void setSpecial(int n) {
    mana = n;
  }

  @Override
  public int getSpecialMax() {
    return maxMana;
  }

  @Override
  public String attack(Adventurer other) {
    int dmg;
    if ((int) Math.random()*5 == 0) {
      dmg = 1;
    } else {
      dmg = (int) Math.random()*5;
    }
    other.applyDamage(dmg);
    return "Dealt " + dmg + " damage";
  }

  private int heal() {
    int heal;
    if ((int) Math.random()*3 == 0) {
      heal = 1;
    } else {
      heal = (int) Math.random()*3;
    }
    return heal;
  }

  @Override
  public String support(Adventurer other) {
    int heal = heal();
    if (other.getHP() + heal < other.getmaxHP()) {
      other.setHP(other.getHP() + heal);
    } else {
      other.setHP(other.getmaxHP());
    }
    return "Healed " + other.getName() + " " + heal + " HP";
  }

  @Override
  public String support() {
    int heal = heal();
    if (getHP() + heal < getmaxHP()) {
      setHP(getHP() + heal);
    } else {
      setHP(getmaxHP());
    }
    return "Healed " + heal + " HP";
  }

  @Override
  public String specialAttack(Adventurer other) {
    if (mana < 10) {
      return "Too little mana";
    } else {
      mana -= 10;
    }
    int dmg;
    int roll = Math.random();
    if (roll >= 0.75) {
      dmg = 5;
    } else if (roll <= 0.25){
      dmg = 2;
    } else {
      dmg = 3;
    }
    other.applyDamage(dmg);
    return "Dealt " + dmg + " damage";
  }
}
