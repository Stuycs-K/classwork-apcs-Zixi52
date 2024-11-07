// When we made the change in step 7, we made a new version of getname() for the Bird subclass that firstly called the getName() from the parent class (super.getName())
// and then appended it to a string "The Mighty ". this means that when we call speak for a bird, it uses the new getName() method and prefixes the name with "the Mighty "


public class Driver {
  public static void main(String[] args) {
    Animal polly = new Animal("polly wanna cracker", 16, "polly");
    polly.speak();
    Bird jay = new Bird("chirp", 25, "Jay", 5.0, "blue");
    jay.speak();
  }
}
