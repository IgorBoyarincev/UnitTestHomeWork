package ru.netology;

import org.junit.jupiter.api.*;

@DisplayName("тестирование ManagerSales класс")
public class ManagerSalesTest {
    private ManagerSales sale;

    @BeforeAll
    static void setUpAll() {
        System.out.println("start test");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("finisn test");
    }

    @BeforeEach
    void setUp() {
        long[] sales = {40, 15, 35, 12, 4, 88, 56, 77, 23, 60};
        sale = new ManagerSales(sales);
    }

    @AfterEach
    void tearDown() {
        System.out.println("test of method finish");
    }

    @Test
    @DisplayName("tested method max()")
    void max() {
        Assertions.assertEquals(88, sale.max());
    }

    @Test
    @DisplayName("tested method min()")
    void min() {
        Assertions.assertEquals(4, sale.min());
    }

    @Test
    @DisplayName("tested method cutAverage()")
    void cutAverage() {
        Assertions.assertEquals(63, sale.gutAverage());
    }

}
