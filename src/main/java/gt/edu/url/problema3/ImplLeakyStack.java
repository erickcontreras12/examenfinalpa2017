/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema3;

/**
 *
 * @author Erick Contreras
 */
public class ImplLeakyStack<E> implements LeakyStack<E>{

    CircularLinkedList<E> history = new CircularLinkedList();
    int maxSize;
    
    public ImplLeakyStack(int n){
        maxSize = n;
    }
    
    public E leak(E e){
        E k = history.removeFirst();
        history.addFirst(e);
        return k;
    }
    
    @Override
    public int size() {
        return history.size();
    }

    @Override
    public boolean isEmpty() {
        return history.isEmpty();
    }

    @Override
    public E saveHistory(E e) {
        if (history.size() == maxSize) {
            return this.leak(e);
        }else{
            history.addLast(e);
        }
        return e;
    }

    @Override
    public E actual() {
        return history.first();
    }

    @Override
    public E undo() {
       
        return history.removeFirst();
    }
    
}
