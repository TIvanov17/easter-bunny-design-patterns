package memory;

import java.util.Iterator;

public interface CustomList<T> extends Iterable<T> {

    void add(T t);

    T remove(int index);

    T removeLast();

    T removeFirst();

    T get(int index);

    int indexOf(T t);

    int size();

    boolean contains(T t);

    Iterator<T> iterator();

}
