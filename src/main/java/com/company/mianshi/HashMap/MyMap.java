package com.company.mianshi.HashMap;

public interface MyMap<k,v> {
    //大小
    int size();
    //是否为空
    boolean isEmpty();
    //根据key获取元素
    Object get(Object key);
    //添加元素
    Object put(Object key,Object value);
    interface Entry<k,v>{
        k getkey();
        v getValue();
    }
}
