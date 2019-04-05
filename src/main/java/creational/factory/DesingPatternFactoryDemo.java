package creational.factory;

public class DesingPatternFactoryDemo {

    public static void main(String[] args) {
        final Animal animal;
        final AnimalType animalType = AnimalType.DOG;
        
        try {
            animal = new AnimalFactory().soundFactory(animalType);
        } catch (final AnimalException e) {
            System.out.println(e.getMessage());
            return;
        }
        animal.sound();   
    }
}
