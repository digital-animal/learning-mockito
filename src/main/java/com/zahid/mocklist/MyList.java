package com.zahid.mocklist;

import java.util.List;

public interface MyList extends List<String> {

    @Override
    default int size() {
        return 0;
    }

    @Override
    default String get(int arg0) {
        return null;
    }

    @Override
    default boolean isEmpty() {
        return false;
    }
    
}
