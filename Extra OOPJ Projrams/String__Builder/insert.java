// insert() method

package String__Builder;

public class insert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.insert(5, "@");
        System.out.println(sb);
    }
}
