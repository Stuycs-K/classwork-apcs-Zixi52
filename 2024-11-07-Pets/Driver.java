// When we made the change in step 7, we made a new version of getname() for the Bird subclass that firstly called the getName() from the parent class (super.getName())
// and then appended it to a string "The Mighty ". this means that when we call speak for a bird, it uses the new getName() method and prefixes the name with "the Mighty "

// Bird b2 cannot be instantiated as an Animal object because Bird is a subclass of Animal, so Bird contains fields and methods not contained in Animal. An Animal is-a Bird,
// so you can store an Animal in a Bird object, but not the other way around.

public class Driver {
  public static void main(String[] args) {
    Animal polly = new Animal("polly wanna cracker", 16, "polly");
    polly.speak();
    Bird jay = new Bird("chirp", 25, "Jay", 5.0, "blue");
    jay.speak();

    Animal a1 = new Animal("e", 1, "hi");
    Bird b1 = new Bird("e", 1, "hi", 2, "hola");
    //Bird b2 = new Animal("e", 1, "hallo");
    Animal a2 = new Bird("e", 1, "hi", 3, "hohoho");
  }
}
