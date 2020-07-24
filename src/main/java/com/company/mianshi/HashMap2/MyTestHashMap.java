package com.company.mianshi.HashMap2;

public class MyTestHashMap<k,v> implements MyTestEntry {


    int initDate = 16;
    Node[] node = new Node[initDate];
    int size;



    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public Object put(Object key, Object value) {

        return null;
    }

    @Override
    public Object get() {
        return null;
    }


    static class Node implements MyTestEntry.MyEntry{
        int hash;
        Object key;
        Object value;
        Node next;
        Node(int hash,Object key,Object value,Node next){

            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }
        @Override
        public Object getValue() {
            return null;
        }

        @Override
        public Object getKey() {
            return null;
        }
    }
}

