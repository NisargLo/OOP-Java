/*  Taking user input of all data-types through Command Line Argument.
*/

public class L1_4 {
    public static void main(String[] args) {
        byte b = Byte.parseByte(args[0]);
        System.out.println("Byte = "+b);

        short s1 = Short.parseShort(args[1]);
        System.out.println("Short = "+s1);

        int i = Integer.parseInt(args[2]);
        System.out.println("Integer = "+i);

        long l = Long.parseLong(args[3]);
        System.out.println("Long = "+l);

        float f = Float.parseFloat(args[4]);
        System.out.println("Float = "+f);

        double d = Double.parseDouble(args[5]);
        System.out.println("Double = "+d);

        char c = args[6].charAt(0);
        System.out.println("Character = "+c);

        String s2 = args[7];
        System.out.println("String = "+s2);
    }
}