/**
 * Created with IntelliJ IDEA.
 * User: jkates
 * Date: 11/3/15
 * Time: 4:04 PM
 * To change this template use File | Settings | File Templates.
 */
public interface List<T> {

    public boolean add(T item);

    public void add(int index, T item);

    public T get(int index);

    public T remove(int index);

    public T set(int index, T item);

    public int size();
}
