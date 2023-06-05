package memory;

import iterator.EasterIterator;
import java.util.Iterator;

public class EasterList<T> implements  CustomList<T>{

    private Object[] collection;
    private int nextIndex;
    private int size;
    private static final int INITIAL_CAPACITY = 4;

    public EasterList(){
        this.collection = new Object[INITIAL_CAPACITY];
        this.nextIndex = 0;
        this.size = INITIAL_CAPACITY;
    }

    @Override
    public void add(T t) {
        if(nextIndex >= this.size){
            this.extendArray();
        }
        this.collection[nextIndex] = t;
        this.nextIndex++;
    }

    @Override
    public T remove(int index) {

        this.ensureIndexIsInBound(index);

        if(this.size / 2 > this.size() ){
            this.shrinkArray();
        }

        Object removedElement = null;

        if(index == this.size() - 1){
            removedElement = this.collection[index];
            this.collection[index] = null;
            this.nextIndex--;
            return (T) removedElement;
        }

        boolean isFound = false;

        for(int i = 0; i < this.size() - 1; i++){
            if(i == index){
                isFound = true;
                removedElement = this.collection[i];

            }
            if(isFound){
                this.collection[i] = this.collection[i + 1];
            }
        }
        this.nextIndex--;
        this.collection[this.size() - 1] = null;
        return (T) removedElement;
    }

    public T removeFirst(){
       return this.remove(0);
    }

    @Override
    public T removeLast(){
       return this.remove(this.size() - 1);
    }

    public T get(int index){
        for(int i = 0; i < this.size(); i++){
            if(i == index){
                return (T) this.collection[index];
            }
        }
        return null;
    }

    public int indexOf(T t){
        for(int index = 0; index < this.size(); index++){
            if(this.collection[index].equals(t)){
                return index;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return this.nextIndex;
    }

    @Override
    public boolean contains(T t) {
        for(int index = 0; index < this.size(); index++){
            if(this.collection[index].equals(t)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new EasterIterator<>(this);
    }

    private void extendArray(){
        Object[] tempCollection = new Object[nextIndex * 2];
        for(int index = 0; index < this.size(); index++){
            tempCollection[index] = this.collection[index];
        }
        this.collection = tempCollection;
        this.size = nextIndex * 2;
    }

    private void shrinkArray(){
        Object[] tempCollection = new Object[size / 2];
        for(int index = 0; index < this.size() - 1; index++){
            tempCollection[index] = this.collection[index];
        }
        this.collection = tempCollection;
        this.size = size / 2;
    }
    private void ensureIndexIsInBound(int index){
        if(index < 0 || index > this.size()){
            throw new IndexOutOfBoundsException(index);
        }
    }

}
