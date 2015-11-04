import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: jkates
 * Date: 11/4/15
 * Time: 1:47 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ListIterator<T> extends Iterator<T> {

    void add(T item);

    void set(T item);

    boolean hasPrevious();

    T previous();
}
