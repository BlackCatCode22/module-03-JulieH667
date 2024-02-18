package myanimals;

public class Animal {
    public static void main(String[] args) {
        System.out.println(Cat.getCatCount());

        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Emma";
        myCat.age = 6;
        myCat.livesRemaining = 2;
        System.out.println(Cat.MAX_LIVES);
        System.out.println(Cat.getCatCount());

        Dog myDog = new Dog();
        myDog.woof();
        myDog.name = "Ben";
        myDog.age = 2;
        myDog.livesRemaining = 9;
        System.out.println(Dog.MAX_LIVES);
        System.out.println(Dog.getDogCount());


    }
}
