package com.zahid.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class CalculatorTest {
    // @Mock
    // CalculatorService calculatorService;

    CalculatorService calculatorService;
    Calculator calculator;


    @BeforeEach
    void setUp() {
        // calculator = new Calculator();

        calculatorService = Mockito.mock(CalculatorService.class); // stub i.e. fake objectm
        calculator = new Calculator(calculatorService);
    }

    @Test
    @DisplayName("Testing addition with mockito")
    void testAddition() {
        // external service(server, database), mock for external service, not for local service
        Mockito.when(calculatorService.add(4, 9)).thenReturn(13);        

        // test for local service, not for external service
        assertEquals(49, calculator.perform(4, 9));
        // assertThrows(NullPointerException.class, () -> calculator.add(4, 9));
        
        Mockito.verify(calculatorService).add(4, 9);
    }
}
