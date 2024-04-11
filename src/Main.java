import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Cookie cookie1 = new Cookie("Choclate","large");
        Cookie cookie2 = new Cookie("Vinilla","small");
        Cookie cookie3 = new Cookie("Marshmellow","large");
        Cookie cookie4 = new Cookie("Lemon","Medium");

        Assortment<Cookie> b  = new Assortment<>();
        b.add(cookie1);
        b.add(cookie2);
        b.add(cookie3);
        b.add(cookie4);
        System.out.println(cookie1);

    }
}
class Cookie implements Comparable<Cookie>{
    private String type;
    private String size;

    public Cookie(String type, String size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cookie o) {
        int compareResult = this.type.compareTo(o.type);
        return compareResult;
    }

}
