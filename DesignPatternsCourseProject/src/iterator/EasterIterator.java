package iterator;

import memory.CustomList;

import java.util.Iterator;

public class EasterIterator<E> implements Iterator<E> {

    private final CustomList<E> customList;
    private int currentIndex;

    public EasterIterator(CustomList<E> customList){
        this.customList = customList;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return this.currentIndex < this.customList.size();
    }

    @Override
    public E next() {
        if(this.hasNext()){
            E element = this.customList.get(currentIndex);
            this.currentIndex++;
            return element;
        }
        return null;
    }
}
