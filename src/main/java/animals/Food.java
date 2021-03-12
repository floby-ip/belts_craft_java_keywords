package animals;

import java.util.Arrays;

// keyword enum
public enum Food {
    CAT_FOOD (new Class[]{Cat.class, Dog.class}),
    DOG_FOOD (new Class[]{Dog.class}),
    RABBIT_FOOD (new Class[]{Rabbit.class}),
    VEGETABLES (new Class[]{Cat.class, Rabbit.class}),
    CHOCOLATE (new Class[]{}),
    GRASS (new Class[]{Cat.class, Rabbit.class});

    private Class[] animalsAbleToEat;

    Food (Class[] animalsAbleToEat){
        this.animalsAbleToEat = animalsAbleToEat;
    }

    // keyword return
    // keyword boolean
    boolean canEat(Animal animal){
        if(animal == null){
            throw new RuntimeException("Food.canEat :: animal must not be null");
        }
        return Arrays.asList(this.animalsAbleToEat).contains(animal.getClass())
                || Arrays.asList(this.animalsAbleToEat).contains(animal.getClass().getSuperclass());
    }
}
