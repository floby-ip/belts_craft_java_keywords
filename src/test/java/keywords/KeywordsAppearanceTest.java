package keywords;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class KeywordsAppearanceTest {

    @Test
    public void keywordsInitTest(){
        // Arrange

        // Act

        // Assert
        // There are 50 keywords
        Assertions.assertThat(KeywordsAppearance.getKeywords().split(",")).hasSize(50);
    }

    @Test
    public void keywordsUnknownTest(){
        // Arrange

        // Act

        // Assert
        // The keyword toto does not exist
        Assertions.assertThat(KeywordsAppearance.getKeywordAppearance("toto")).isNull();
    }

    @Test
    public void keywordsKnownTest(){
        // Arrange

        // Act

        // Assert
        // The keyword private exists
        Assertions.assertThat(KeywordsAppearance.getKeywordAppearance("private")).isNotNull();
    }

    @Test
    public void keywordsNotUsedTest(){
        // Arrange

        // Act
        String notUsed = KeywordsAppearance.getNotYetUsed();
        notUsed = notUsed.replaceAll(" ", "");
        String[] notUsedArray = notUsed.split(",");

        // Assert
        // The values for the keys returned by "getNotUsedYet()" must all be "Not Yest Used"
        for(String k : notUsedArray){
            Assertions.assertThat(KeywordsAppearance.getKeywordAppearance(k)).isEqualTo("Not Yet Used");
        }

    }
}
