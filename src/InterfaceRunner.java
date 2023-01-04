public class InterfaceRunner {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Bird(), new Airplane()};
        Animal[] animals = {new Dog(), new Cat()};

        for(int i = 0; i<= flyingObjects.length-1;i++) {
            flyingObjects[i].fly();
        }

        for(int i = 0; i<= animals.length-1;i++) {
            animals[i].speak();
        }
    }
}
