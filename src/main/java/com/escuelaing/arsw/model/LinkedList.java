package com.escuelaing.arsw.model;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Johann Cepeda
 */
public class LinkedList<E> implements List<E>{

    public LinkedList() {

    }
    
    
    private int size= 0;
    private Node<E> head;
    private Node<E> tail;
    
    private static class Node<E> {
        E item;
        Node<E> next;

        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported isEmpty."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported contains."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported iterator."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported toArray."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported toArray."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Addiciona el elemento dado al final de la lista
     * @param e Elemento que se quiere agregar
     * @return true si se pudo insertar el valor
     */
    @Override
    public boolean add(E e) {
        Node<E> l = tail;
        Node<E> newElement = new Node<>(e,null);
        tail = newElement;
        if(l==null){
            head = newElement;
        }else{
            l.next=newElement;
            
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported remove."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported containsAll."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported addAll."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported addAll."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported removeAll."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported retainAll."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported clear."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Devuelve el valor del nodo correspondiente a la posicion del index
     * @param index posicion dada
     * @return Elemento del nodo
     */
    @Override
    public E get(int index) {
        if(!(index>=0 && index<size)){
            throw new IndexOutOfBoundsException();
        }else{
            Node<E> x = head;
            for(int i=0; i<index; i++){
                x = x.next;
            }
            return x.item;
        }
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("Not supported set."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException("Not supported add."); //To change body of generated methods, choose Tools | Templates.

        
    }

    @Override
    public E remove(int index) {
        /*
        if(!(index>=0 && index<size)){
            throw new IndexOutOfBoundsException();
        }else{
            Node<E> x = head;
            for(int i=0; i< index; i++){
                x = x.next;
            }
            Node<E> y = x.prev;
            x.prev.next=x.next;
            x.next.prev=y;
        }
                */
        throw new UnsupportedOperationException("Not supported remove."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported indexOf."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported lastIndexOf."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("Not supported listIterator."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported listIterator."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported subList."); //To change body of generated methods, choose Tools | Templates.
    }
}