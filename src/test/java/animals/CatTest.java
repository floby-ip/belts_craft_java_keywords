package animals;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CatTest {
    @Test
    public void catMustTalk(){
        // Arrange
        Cat cat = new Cat("cat", "a cat", 1., 2.);

        // Act

        // Assert
        Assertions.assertThat(cat.talk()).isEqualTo("Miaou!");
    }

    @Test
    public void catCanEatVegetables(){
        // Arrange
        Cat cat = new Cat("cat", "a cat", 1., 2.);

        // Act

        // Assert
        Assertions.assertThat(cat.canEat(Food.VEGETABLES)).isEqualTo(true);
    }

    @Test
    public void catCannotEatDogFood(){
        // Arrange
        Cat cat = new Cat("cat", "a cat", 1., 2.);

        // Act

        // Assert
        Assertions.assertThat(cat.canEat(Food.DOG_FOOD)).isEqualTo(false);
    }

    @Test
    public void assertFoodNotNull(){
        // Arrange
        Cat cat = new Cat("cat", "a cat", 1., 2.);

        // Act

        // Assert
        Assertions.assertThatThrownBy(() -> cat.canEat(null)).isInstanceOf(AssertionError.class);
    }
}
