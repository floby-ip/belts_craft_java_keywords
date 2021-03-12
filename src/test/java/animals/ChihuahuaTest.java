package animals;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ChihuahuaTest {
    @Test
    public void chihuahuaMustTalk(){
        // Arrange
        Chihuahua chihuahua = new Chihuahua("chihuahua");

        // Act

        // Assert
        Assertions.assertThat(chihuahua.talk()).isEqualTo("GRRRRRRrrrr!");
    }

    @Test
    public void chihuahuaCanEatVegetables(){
        // Arrange
        Chihuahua chihuahua = new Chihuahua("chihuahua");

        // Act

        // Assert
        Assertions.assertThat(chihuahua.canEat(Food.VEGETABLES)).isEqualTo(false);
    }

    @Test
    public void chichuahuaMustBeSmall(){
        // Arrange
        Chihuahua chihuahua = new Chihuahua("chihuahua");

        // Act

        // Assert
        Assertions.assertThat(chihuahua.getHeight()).isEqualTo(20);
        Assertions.assertThat(chihuahua.getWeight()).isEqualTo(6);
    }

    @Test
    public void chihuahuaCanEatDogFood(){
        // Arrange
        Chihuahua chihuahua = new Chihuahua("chihuahua");

        // Act

        // Assert
        Assertions.assertThat(chihuahua.canEat(Food.DOG_FOOD)).isEqualTo(true);
    }

    @Test
    public void assertFoodNotNull(){
        // Arrange
        Chihuahua chihuahua = new Chihuahua("chihuahua");

        // Act

        // Assert
        Assertions.assertThatThrownBy(() -> chihuahua.canEat(null)).isInstanceOf(AssertionError.class);
    }
}
