package com.company.mianshi;


public class MyHashMap22 {

    interface MyEntry<k,v> {
        k getkey();
        v getValue();

        int size();
        boolean isEmpty();
        Object get(Object key);
        Object put(Object key,Object value);
    }

//    public class Node implements  MyEntry{
//
//        Node next;
//        @Override
//        public Object getkey() {
//            return this.key;
//        }
//
//        @Override
//        public Object getValue() {
//            return null;
//        }
//
//        @Override
//        public int size() {
//            return 0;
//        }
//
//        @Override
//        public boolean isEmpty() {
//            return false;
//        }
//
//        @Override
//        public Object get(Object key) {
//            return null;
//        }
//
//        @Override
//        public Object put(Object key, Object value) {
//            return null;
//        }
//    }
//
//    private final int DEFALUT_LENGTH = 16;
//    Node[] table = new Node[DEFALUT_CAPACITY];
//    //长度
//    private int size=0;
//    //keySet
//    Set<K> keySet;
}
