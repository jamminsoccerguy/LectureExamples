package week7;

/**
 * Created by Mike Plucker
 * Date: 3/8/2016
 * Class: CSCI 1933-12
 */

// GenericNode.java  Updated/Corrected Oct. 23, 2014

// Further improved linked list Node example that works on generic types rather
// than Objects as the data field in the Node
// As in predecessors (Node, NewNode) addInOrder2 puts items in order from
// "largest" to "smallest" using toString() to determine order and uses a
// headed list.
// The static methods found in NewNode.java have been REMOVED since generics
// do NOT work with static class  members.

public class GenericNode<E> {   // Type parameter gives specific type (E) to be
                                // used within the class GenericNode.
                                // When referring to GenericNode within the class, use
                                // <E> after it since that is the effective name of the
                                // type.  The exception is on the constructor (see below)

    public GenericNode (E initData, GenericNode<E> initLink) {  // not intuitive, but <E>
        // is NOT used in the constructor name
        data = initData;
        next = initLink;
    }


    // selectors and modifiers
    public void setData(E newData) {
        data = newData;
    }

    public void setNext(GenericNode<E> newLink) {
        next = newLink;
    }

    public E getData() {
        return data;
    }

    public GenericNode<E> getNext() {
        return next;
    }


    // methods
    public void display() {
        System.out.println(data.toString());
    }

    public void printFrom() {
        display();
        if (getNext() != null)
            getNext().printFrom();
    }

    public void printList(GenericNode<E> begin) {
        GenericNode<E> ptr = begin.getNext();
        while (ptr != null) {
            ptr.display();
            ptr = ptr.getNext();
        }
    }

    public void addInOrder2(GenericNode<E> newItem, GenericNode<E> list) {
        GenericNode<E> ptr = list.getNext();
        GenericNode<E> trailer = list;
        while (ptr != null &&
                newItem.getData().toString().compareTo(ptr.getData().toString())
                        < 0) {
            ptr = ptr.getNext();
            trailer = trailer.getNext();
        }
        newItem.setNext(ptr);
        trailer.setNext(newItem);
    }


    // instance data
    private E data;
    private GenericNode<E> next;

}// GenericNode
