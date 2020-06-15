package threadWorks.synchronization;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ConcatenatorTest {

    @Test
    public void concatenateTest(){
        // Arrange
        Concatenator.concatenate("A", '1');
        Concatenator.concatenate("B", '2');
        Concatenator.concatenate("C", '3');
        Concatenator.concatenate("A", '4');
        Concatenator.concatenate("B", '5');
        Concatenator.concatenate("C", '6');
        Concatenator.concatenate("A", '7');
        Concatenator.concatenate("C", '8');
        Concatenator.concatenate("C", '9');
        Concatenator.concatenate("A", '0');

        // Act

        // Assert
        Assertions.assertThat(Concatenator.getResult()).isEqualTo("[A]1[B]2[C]3[A]4[B]5[C]6[A]7[C]8[C]9[A]0");
    }

    @Test
    public void concatenateSyncTest(){
        // Arrange
        Concatenator.concatenateSynchronized("A", '1');
        Concatenator.concatenateSynchronized("B", '2');
        Concatenator.concatenateSynchronized("C", '3');
        Concatenator.concatenateSynchronized("A", '4');
        Concatenator.concatenateSynchronized("B", '5');
        Concatenator.concatenateSynchronized("C", '6');
        Concatenator.concatenateSynchronized("A", '7');
        Concatenator.concatenateSynchronized("C", '8');
        Concatenator.concatenateSynchronized("C", '9');
        Concatenator.concatenateSynchronized("A", '0');

        // Act

        // Assert
        Assertions.assertThat(Concatenator.getResultSynchronised()).isEqualTo("[A]1[B]2[C]3[A]4[B]5[C]6[A]7[C]8[C]9[A]0");
    }
}
