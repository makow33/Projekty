package pl.sda.day9.Podsumownie;

/**
 * Created by sp0rk on 07/07/17.
 */
public class Casting {
    public static class Animal {
        public int legs;

        public Animal(int legs) {
            this.legs = legs;
        }
    }

    public static class Dog extends Animal {  // object
        public String breed;

        public Dog(String breed) {
            super(4);
            this.breed = breed;
        }
    }

    public static void main(String[] args) { // string ->
        Dog spike = new Dog("Collie");
        System.out.println(spike.breed);
        System.out.println(spike.legs);

        Animal unknownDinosaur = new Animal(0);


        System.out.println("dino " + unknownDinosaur.legs);
//        System.out.println(unknownDinosaur.breed);  //Nie skompiluje się


        Animal anonymousSpike = (Animal) spike;

        System.out.println(anonymousSpike.legs);
//        System.out.println(anonymousSpike.breed);   //Nie skompiluje się
//        Dog dinoDog = (Dog) unknownDinosaur;
        System.out.println("----");
        System.out.println(spike instanceof Animal);
        System.out.println(spike instanceof Dog);
        System.out.println("----");
        System.out.println(unknownDinosaur instanceof Animal);
        System.out.println(unknownDinosaur instanceof Dog);
        System.out.println("----");
        System.out.println(anonymousSpike instanceof Animal);
        System.out.println(anonymousSpike instanceof Dog);
    }
}
