package animals;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AustralianSheppardTest {
    @Test
    public void australianSheppardMustTalk(){
        // Arrange
        AustralianSheppard australianSheppard = new AustralianSheppard("australianSheppard", 1., 2.);

        // Act

        // Assert
        Assertions.assertThat(australianSheppard.talk()).isEqualTo("WOUAF! WOUAF!");
    }

    @Test
    public void australianSheppardCanEatVegetables(){
        // Arrange
        AustralianSheppard australianSheppard = new AustralianSheppard("australianSheppard",  1., 2.);

        // Act

        // Assert
        Assertions.assertThat(australianSheppard.canEat(Food.VEGETABLES)).isEqualTo(false);
    }

    @Test
    public void australianSheppardCanEatDogFood(){
        // Arrange
        AustralianSheppard australianSheppard = new AustralianSheppard("australianSheppard", 1., 2.);

        // Act

        // Assert
        Assertions.assertThat(australianSheppard.canEat(Food.DOG_FOOD)).isEqualTo(true);
    }

    @Test
    public void assertFoodNotNull(){
        // Arrange
        AustralianSheppard australianSheppard = new AustralianSheppard("australianSheppard",1., 2.);

        // Act

        // Assert
        Assertions.assertThatThrownBy(() -> australianSheppard.canEat(null)).isInstanceOf(AssertionError.class);
    }
}
