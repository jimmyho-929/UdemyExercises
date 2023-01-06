public class InterfaceRunner {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Bird(), new Airplane()};
        Animal[] animals = {new Dog(), new Cat()};

         for(Flyable object:flyingObjects) {
             object.fly();
         }

        for(Animal animal:animals) {
            animal.speak();
        }
    }
}
