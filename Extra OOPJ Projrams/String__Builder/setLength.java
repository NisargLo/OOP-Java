// setLength() method

package String__Builder;

public class setLength {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.setLength(50);
        System.out.println(sb+"\nNew Length of String Buffer - "+sb.length());
    }
}