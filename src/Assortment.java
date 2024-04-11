import java.util.ArrayList;

public class Assortment<E> extends ArrayList<E> {
    ArrayList<E> a = new ArrayList<>();

    public void gather(E element) {
        a.add(element);
    }

    @Override
    public String toString() {
        return "Assortment{" +
                "a=" + a +
                '}';
    }

    public void getGathered() {
        for (E item : a) {
            System.out.println(item);
        }
    }
}
