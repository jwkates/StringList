/**
 * Created with IntelliJ IDEA.
 * User: jkates
 * Date: 11/3/15
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringList implements List<Character> {

    DynamicArray<Character> characterList;

    public StringList() {
        characterList = new DynamicArray<>(10);
    }

    public StringList(String s) {
        characterList = new DynamicArray<>(s.length());

        for (char c : s.toCharArray()) {
            add(c);
        }
    }

    @Override
    public boolean add(Character item) {
        return characterList.add(item);
    }

    @Override
    public void add(int index, Character item) {
        characterList.add(index, item);
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
        StringList a = new StringList("abcdefg");
        a.add(new Character('1'));
        a.add(new Character('2'));
        System.out.println(a.get(0));
        System.out.println(a.get(7));
        System.out.println(a.get(8));
        System.out.println();

        a = new StringList("");
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
