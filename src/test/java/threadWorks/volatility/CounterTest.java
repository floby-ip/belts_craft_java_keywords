package threadWorks.volatility;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CounterTest {

    @Test
    public void incrementTest(){
        // Arrange
        Counter counter = new Counter();

        // Act
        long start = System.currentTimeMillis();
        for(int i = 0; i<10; i++){
            counter.increment();
        }
        long end = System.currentTimeMillis();

        // Assert
        Assertions.assertThat(counter.getCount()).isEqualTo(counter.getVolatileCount());
        Assertions.assertThat(counter.getCount()).isBetween(start, end);
    }
}
