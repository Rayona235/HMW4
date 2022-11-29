import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String text = scanner.nextLine();
            listA.add(text);

        }
        System.out.println(listA);

        for (int i = 0; i < 5; i++) {
            String text = scanner.nextLine();
            listB.add(text);

        }
        System.out.println(listB);

        Collections.reverse(listB);
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        System.out.println(listC);
        Collections.sort(listC, (o1, o2) -> o1.length()-o2.length());
        System.out.println(listC);
    }



}
