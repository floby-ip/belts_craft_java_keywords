package animals;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RabbitTest {

    @Test
    public void rabbitMustTalk(){
        // Arrange
        Rabbit rabbit = new Rabbit();

        // Act

        // Assert
        Assertions.assertThat(rabbit.talk()).isEqualTo("NiaNia!");
    }

    @Test
    public void rabbitCanEatVegetables(){
        // Arrange
        Rabbit rabbit = new Rabbit();

        // Act

        // Assert
        Assertions.assertThat(rabbit.canEat(Food.VEGETABLES)).isEqualTo(true);
    }

    @Test
    public void rabbitCannotEatDogFood(){
        // Arrange
        Rabbit rabbit = new Rabbit();

        // Act

        // Assert
        Assertions.assertThat(rabbit.canEat(Food.DOG_FOOD)).isEqualTo(false);
    }

    @Test
    public void assertFoodNotNull(){
        // Arrange
        Rabbit rabbit = new Rabbit();

        // Act

        // Assert
        Assertions.assertThatThrownBy(() -> rabbit.canEat(null)).isInstanceOf(AssertionError.class);
    }

}
