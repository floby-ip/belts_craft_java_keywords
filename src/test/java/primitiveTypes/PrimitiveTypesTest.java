package primitiveTypes;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import primitiveTypes.exceptions.NullArgException;

public class PrimitiveTypesTest {

    @Test
    public void getStringAsByteString(){
        // Arrange

        // Act

        // Assert
        Assertions.assertThatThrownBy(() -> PrimitiveTypes.getStringAsByteString(null))
                .isInstanceOf(NullArgException.class)
                .hasMessage("Argument s(String) can't be null for method getStringAsByteString of class PrimitiveTypes");
        try {
            Assertions.assertThat(PrimitiveTypes.getStringAsByteString("84|104|105|115|32|105|115|32|97|32|108|111|110|103|32|83|116|114|105|110|103|32|119|105|116|104|32|85|80|80|69|82|44|32|108|111|119|101|114|32|97|110|100|32|48|116|124|45|124|51|124|50|53|32|46|46|46|"));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
