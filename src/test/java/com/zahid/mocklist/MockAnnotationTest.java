package com.zahid.mocklist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MockAnnotationTest {
    @Mock
    List<String> mockList;

    @BeforeAll
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSize() {
        Mockito.when(mockList.size()).thenReturn(10);

        assertEquals(10, mockList.size());
    }

    @Test
    void testGet() {
        Mockito.when(mockList.get(0)).thenReturn("Zahid");

        assertEquals("Zahid", mockList.get(0));
    }
}
