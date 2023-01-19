import java.util.ArrayList;

public class MyCustomList<T> {

    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }

    public void removeList(T element) {
        list.remove(element);
    }

    public T get(int index){
        return list.get(index);
    }

    public String toString() {
        return list.toString();
    }
}
