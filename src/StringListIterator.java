/**
 * Created with IntelliJ IDEA.
 * User: jkates
 * Date: 11/4/15
 * Time: 1:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringListIterator implements ListIterator<Character> {

    private StringList stringList;
    private int currentIndex;

    public StringListIterator(StringList stringList) {
        this.currentIndex = 0;
        this.stringList = stringList;
    }

    @Override
    public void add(Character item) {
        stringList.add(currentIndex, item);
    }

    @Override
    public void set(Character item) {
        stringList.set(currentIndex, item);
    }

    @Override
    public boolean hasPrevious() {
        return currentIndex > 0;
    }

    @Override
    public Character previous() {
        Character prevChar = stringList.get(currentIndex - 1);
        currentIndex--;
        return prevChar;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < stringList.size();
    }

    @Override
    public Character next() {
        Character nextChar = stringList.get(currentIndex);
        currentIndex++;
        return nextChar;
    }
}
