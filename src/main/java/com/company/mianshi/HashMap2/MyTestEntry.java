package com.company.mianshi.HashMap2;

public interface MyTestEntry {

    int size();

    boolean isEmpty();

    Object get();
    Object put(Object key, Object value);
    interface MyEntry<k,v>{
        k getKey();
        v getValue();

    }

}
