public class Main {
    public static void main(String[] args) {
        GoodDog dogOne = new GoodDog();
        dogOne.setSize(60);
        GoodDog dogTwo = new GoodDog();
        dogTwo.setSize(30);
        GoodDog dogTre = new GoodDog();
        dogTre.setSize(15);
        System.out.printf("DOG ONE: %s%n", dogOne.getSize());
        dogOne.bark();
        System.out.printf("DOG TOW: %s%n", dogTwo.getSize());
        dogTwo.bark();
        System.out.printf("DOG TRE %s%n", dogTre.getSize());
        dogTre.bark();

    }
}