package animals;

import java.util.HashSet;
import java.util.Set;

public class AnimalsMain {
    public static void mainAnimals(){
        // create animals
        Set<Animal> animals = new HashSet<>();
        animals.add(new AustralianSheppard("Ika", 60.5, 31));
        animals.add(new Chihuahua("Medor"));
        Animal tzatziki = new Cat("Tzatziki", "Un petit chat noir", 20.5, 4.8);
        animals.add(new Rabbit());
        animals.add(new AustralianSheppard("Jun", 65, 32.));
        animals.add(new Cat("Mr Whiskers", "a big old male", 18,9));
        animals.add(new Chihuahua("Rex"));
        animals.add(tzatziki);

        System.out.println(animals);

        // serialize and deserialize a cat (description is transient, hence not serialized)
        System.out.println("Save tzatziki");
        ((Cat)tzatziki).serialize("cat-tzatiki");
        Cat tzatziki2 = Cat.deserialize("cat-tzatiki");
        System.out.println(tzatziki2);

        // loop through animals in order to make actions on all animals that are not rabbits
        // could have done better, but this way we use "continue"
        // keyword continue
        for(Animal animal : animals){
            if(animal instanceof Rabbit){
                continue;
            }
            // animal is not a rabbit
            System.out.println(animal.talk());
        }


    }
}
