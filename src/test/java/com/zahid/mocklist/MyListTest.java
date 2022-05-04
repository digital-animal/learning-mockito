package com.zahid.mocklist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyListTest {
    
    @Test
    void testSize() {
        List<String> mockedList = Mockito.mock(MyList.class);
        Mockito.when(mockedList.size()).thenReturn(5);

        assertEquals(5, mockedList.size());
    }
    
    @Test
    void testGet() {
        List<String> mockedList = Mockito.mock(MyList.class);
        Mockito.when(mockedList.get(0)).thenReturn("Mockito");

        assertEquals("Mockito", mockedList.get(0));
    }
    
    @Test
    void testEmpty() {
        List<String> mockedList = Mockito.mock(MyList.class);
        Mockito.when(mockedList.isEmpty()).thenReturn(true);
        
        assertTrue(mockedList.isEmpty());
    }
}
