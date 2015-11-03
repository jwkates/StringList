/**
 * Created with IntelliJ IDEA.
 * User: jkates
 * Date: 11/3/15
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringList implements List<Character> {

    LinkedList<Character> characterList;

    public StringList() {
        characterList = new LinkedList<>();
    }

    public StringList(String s) {
        this();

        for (Character character : s.toCharArray()) {
            add(character);
        }
    }

    @Override
    public void add(Character item) {
        characterList.add(item);
    }

    @Override
    public void add(int index, Character item) {
        characterList.insert(index, item);
    }

    @Override
    public Character get(int index) {
        return characterList.get(index);
    }

    @Override
    public Character remove(int index) {
        return characterList.remove(index);
    }

    @Override
    public Character set(int index, Character item) {
        characterList.set(index, item);

        return item;
    }

    @Override
    public int size() {
        return characterList.size();
    }

    public static void main(String[] args) {
        StringList a = new StringList("");
        a.add(new Character('X'));
        System.out.println(a.size());
        a.add(0,new Character('Y'));
        System.out.println(a.size());
        a.add(0,new Character('Z'));
        System.out.println(a.size());
        a.add(1,new Character('R'));
        System.out.println(a.size());
        a.add(4,new Character('x'));
        System.out.println(a.size());

        for (int i = 0; i < a.size(); i++)
            System.out.print(a.get(i) + " ");
        System.out.println();


    }
}
