package creational.factory;

public class AnimalFactory {
    
    public Animal soundFactory(final AnimalType animalType) throws AnimalException {
        final Animal animal;
        switch (animalType) {
            case DOG:
                animal = new Dog();
                break;
            case CAT:
                animal = new Cat();
                break;
            default:
                throw new AnimalException("Animal not found!");
        }
        return animal;
    }

}
