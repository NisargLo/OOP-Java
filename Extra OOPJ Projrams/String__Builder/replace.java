// replace() method

package String__Builder;

public class replace {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.replace(5, 10, " $ ");
        System.out.println(sb);
    }
}
