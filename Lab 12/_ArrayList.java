/*
    Demonstrate the use of Collection Framework in Java.
    (ArrayList)
 */

import java.util.*;

public class _ArrayList {
    public static void main(String[] args) {
        ArrayList<String> S = new ArrayList<>();
        List<String> moreFruits = Arrays.asList("Orange", "Pineapple", "Strawberry");
        S.add("Apple");
        S.add("Banana");
        S.add("Mango");
        S.addAll(moreFruits);
        S.set(2, "Apy Fiz");
        System.out.println("Get - "+S.get(3));
        System.out.println("Mango? - "+S.contains("Mango"));
        System.out.println("Total - " + S.size());
        System.out.println("Sublist - "+S.subList(2, 5));
        S.add(3,"Apy Fiz");
        System.out.println("I - "+S.get(6));
        System.out.println("Last Apy Fiz - "+S.lastIndexOf("Apy Fiz"));
        Iterator<String> itr = S.iterator();
        while (itr.hasNext()) {
            String temp = itr.next();
            System.out.println(temp);
        }
        int hc=S.hashCode();
        int hc1=moreFruits.hashCode();
        System.out.println("Hashcode - "+hc+"\n"+hc1);

        System.out.println("\n\nLet us see previous :-");
        ListIterator<String> listitr = S.listIterator(7);
        while(listitr.hasPrevious()){
            System.out.print(listitr.previous()+", ");
        }
        System.out.println("\nIndex - "+S.indexOf("Apple"));
        S.remove("Strawberry");
        System.out.println("Size - "+S.size());
        System.out.println();
        S.removeAll(moreFruits);
        S.retainAll(moreFruits);
        Collection<String> fruitsCopy = new ArrayList<>(S);
        System.out.println("\nEquals Copy Object ? - "+S.equals(fruitsCopy));
        itr = S.iterator();
        while (itr.hasNext()) {
            String temp = itr.next();
            System.out.println(temp);
            itr.remove();
        }
        S.clear();
        System.out.println("\nTotal - " + S.size());
        System.out.println("\nIs the fruits collection empty? " + moreFruits.isEmpty());
        System.out.println("\nIs the fruits collection empty? " + S.isEmpty());
    }
}