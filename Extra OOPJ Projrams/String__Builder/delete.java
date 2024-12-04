// delete() method

package String__Builder;

public class delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.delete(5, 10);
        System.out.println(sb);
    }
}
