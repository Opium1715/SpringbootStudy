import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStudy {
    @Test
    public void assertTEst(){
        int cal = 6;
        assertEquals(6,cal,"出错了");
    }

    @ParameterizedTest
    @ValueSource( ints = {123,456,79})
    @DisplayName("参数化测试")
    void parameterTest(int array){
        System.out.println(array);
    }


    static Stream<Integer> returnInt(){
        return Stream.of(123,456,789);
    }

    @ParameterizedTest
    @MethodSource(value = "returnInt")
    @DisplayName("参数方法返回值测试")
    void methodValueTest(int a){
        System.out.println(a);
    }
}
