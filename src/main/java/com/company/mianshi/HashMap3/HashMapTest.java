package com.company.mianshi.HashMap3;

public class HashMapTest {

    interface Entry<k, v> {
        k getkey();

        v getValue();
    }

    class Node implements Entry {

        int hash;
        Object key;
        Object value;
        Node next;

        Node(int hash, Object key, Object value, Node next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public Object getkey() {
            return this.key;
        }

        @Override
        public Object getValue() {
            return this.value;
        }
    }

    final int init = 16;
    Node[] table = new Node[init];
    int size;
    boolean isEmpty;

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Object put(Object key, Object value) {
        //通过key,求hash值
        int hashValue = hash(key);
        //通过hash,找到这个key应该放的位置
        int i = indexFor(hashValue, table.length);
        for (Node node = table[i]; node != null; node = node.next) {
            Object k;
            if (node.hash == hashValue && ((k = node.key) == key || key.equals(k))) {
                Object oldValue = node.value;
                node.value = value;
                return oldValue;
            }
        }
        //新增节点
        addEntry(key, value, hashValue, i);
        return null;
    }

    public void addEntry(Object key, Object value, int hashValue, int i) {
        //如果超过了原数组大小，则扩大数组
        if ((size + 1) == table.length) {
            Node[] newTable = new Node[table.length * 2];
            System.arraycopy(table, 0, newTable, 0, table.length);
            table = newTable;
        }
        Node eNode = table[i];
        //新增节点，将该节点的next指向前一个节点
        table[i] = new Node(hashValue, key, value, eNode);
    }

    //获取插入的位置
    public int indexFor(int hashValue, int length) {
        return hashValue % length;
    }

    //获取hash值
    public int hash(Object key) {
        return key.hashCode();
    }

    public Object get(Object key) {
        int hashValue = hash(key);
        int i = indexFor(hashValue, table.length);
        for (Node node = table[i]; node != null; node = node.next) {
            if (node.key.equals(key) && hashValue == node.hash) {
                return node.value;
            }
        }
        return null;
    }

}
