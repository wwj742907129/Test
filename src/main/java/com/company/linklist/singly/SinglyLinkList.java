package com.company.linklist.singly;

import com.company.linklist.po.Node;

public class SinglyLinkList {

    private Node first;
    private int pos = 0;

    public SinglyLinkList() {
        first = null;
    }

    public void addHeadNode(Node node) {

        if (first == null) {
            first = node;
            first.setNext(null);
        }
    }

    public void addNode(Node node) {

        if (node != null) {
            node.setNext(first.getNext());
            first.setNext(node);
        }
    }
}
