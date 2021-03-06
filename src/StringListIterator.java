import java.util.ListIterator;

/**
 * Created with IntelliJ IDEA.
 * User: jkates
 * Date: 11/4/15
 * Time: 1:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringListIterator implements ListIterator<Character> {

    private StringList stringList;
    private int nextIndex;

    boolean iterationRequired;

    public StringListIterator(StringList list) {
        nextIndex = 0;
        stringList = list;
        iterationRequired = false;
    }

    @Override
    public void add(Character item) {
        stringList.add(nextIndex, item);
        nextIndex++;
    }

    @Override
    public void remove() {
        if (nextIndex > 0) {
            stringList.remove(nextIndex - 1);
            nextIndex--;
        }
    }

    @Override
    public void set(Character item) {
        stringList.set(nextIndex - 1, item);
    }

    @Override
    public boolean hasPrevious() {
        return nextIndex > 0;
    }

    @Override
    public Character previous() {
        Character prevChar = stringList.get(nextIndex - 1);
        nextIndex--;
        return prevChar;
    }

    @Override
    public int nextIndex() {
        return nextIndex;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public boolean hasNext() {
        return nextIndex < stringList.size();
    }

    @Override
    public Character next() {
        Character nextChar = stringList.get(nextIndex);
        nextIndex++;
        return nextChar;
    }
}
