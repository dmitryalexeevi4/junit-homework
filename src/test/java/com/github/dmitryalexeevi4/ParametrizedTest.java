package com.github.dmitryalexeevi4;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import org.slf4j.*;

public class ParametrizedTest {
    private static final Logger LOG = LoggerFactory.getLogger(ParametrizedTest.class);

    public static Object[][] dataProvider() {
        return new Object[][]{
                {"Дмитрий", 24}
        };
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void parametrizedTest(String name, int age) {
        String print = String.format("Имя: %s | Возраст: %d", name, age);
        LOG.info(print);
    }
}

