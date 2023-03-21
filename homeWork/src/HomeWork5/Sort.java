package HomeWork5;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        List<Integer> tempList1 = createList();
        List<Integer> tempList2 = tempList1;

        System.out.println("Первоначальный список");
        System.out.println(tempList1);
        System.out.println(" ");
//        System.out.println("Первоначальный список 2");
//        System.out.println(tempList2);

        long startTimePrimitive1 = System.currentTimeMillis();

        for (int i = 0; i < tempList1.size() - 1; i++) {
            int min = tempList1.get(i);
            int Nmin = i;

            for (int j = i + 1; j < tempList1.size(); j++) {
                if (min > tempList1.get(j)) {
                    min = tempList1.get(j);
                    Nmin = j;
                }
            }
            tempList1.set(Nmin, tempList1.get(i));
            tempList1.set(i, min);
//            System.out.println(" " + tempList1);
        }
        long endTimePrimitive1 = System.currentTimeMillis();

        System.out.println("Обработанный список 1");
        System.out.println("Working time " + (endTimePrimitive1 - startTimePrimitive1) + " millis");
        System.out.println(tempList1);
        System.out.println(" ");

        long startTimePrimitive2 = System.currentTimeMillis();
        Collections.sort(tempList2);
        long endTimePrimitive2 = System.currentTimeMillis();

        System.out.println("Обработанный список 2");
        System.out.println("Working time " + (endTimePrimitive2 - startTimePrimitive2) + " millis");
        System.out.println(tempList2);

    }

    private static List<Integer> createList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            int b = (int) (Math.random() * 1000);
            list.add(b);
        }
        return list;
    }
}
