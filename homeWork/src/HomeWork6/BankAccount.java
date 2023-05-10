package HomeWork6;

import java.util.*;

public class BankAccount {
    public static void main(String[] args) {


        Client client1 = new Client(18, "Вася");
        Client client2 = new Client(20, "Петя");
        Client client3 = new Client(24, "Коля");

        Client client = new Client(24, "Коля");//как будто ввели с консоли и ищем по параметрам этого объекта совпадения

        Map<Integer, Client> clients = new HashMap<>();
//      fillMap(clients);
        clients.put(123, client1);
        clients.put(456, client2);
        clients.put(789, client3);
        clients.put(555, client3);

        System.out.println("==============================> Создаю вторую мапу, в которой меня местами ключ и значения для ускорения поиска счетов");

        Map<Client, ArrayList<Integer>> clients2 = new HashMap<>();

        System.out.println(clients.get(123));

        for (Integer a : clients.keySet()) {
            try {
                ArrayList<Integer> list1 = (ArrayList<Integer>) clients2.get(clients.get(a)).clone();
                list1.add(a);
                clients2.put(clients.get(a), list1);
            } catch (NullPointerException e) {
                ArrayList<Integer> list2 = new ArrayList<>();
                list2.add(a);
                clients2.put(clients.get(a), list2);
            }
        }

        System.out.println(clients2);
        System.out.println();


//        clients2.put(client1.getName(), client1);
//        clients2.put(client2.getName(), client2);
//        clients2.put(client3.getName(), client3);


        System.out.println(clients);

        System.out.println("==============================> Вывожу все ключи мапы (банковские счета)");

        for (Integer acc : clients.keySet()) {
            System.out.println(acc);
        }

        System.out.println("==============================> Проверяю наличие занчений/ключей в мапе");

        System.out.println("clients.containsValue(client) -> " + clients.containsValue(client));
        System.out.println("clients2.containsKey(client) -> " + clients2.containsKey(client));
                System.out.println("clients.get -> " + clients.get(123));

        System.out.println("==============================> Передаю все пары ключ-значение в связанное множество и вывожу результат");

        for (Map.Entry e : clients.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        System.out.println("==============================> Передаю все ключи в множество и вывожу множество");

        Set<Integer> checkAcc = clients.keySet();
        System.out.println(checkAcc);

        System.out.println("==============================> Поиск всех счетов клиента");

        for (Integer c : getKeys(clients, client)) {
            System.out.println(c);
        }

        System.out.println("==============================> Поиск всех счетов клиента с использованием HashMap");

        System.out.println(clients2.get(client));
        System.out.println(clients2.get(client3));

        System.out.println("==============================> поиск клиента по номеру счёта");

        System.out.println(clients.get(555));


    }

    private static Set<Integer> getKeys(Map<Integer, Client> map, Client client) {

        Set<Integer> result = new HashSet<>();
        if (map.containsValue(client)) {
            for (Map.Entry<Integer, Client> entry : map.entrySet()) {
                if (Objects.equals(entry.getValue(), client)) {
                    result.add(entry.getKey());
                }
                // we can't compare like this, null will throws exception
              /*(if (entry.getValue().equals(value)) {
                  result.add(entry.getKey());
              }*/
            }
        }
        return result;

    }

}

//    private static void fillMap(Map<Client, ArrayList<Integer>> clients) {
//        Client client1 = new Client(1, "Вася");
//        Client client2 = new Client(2, "Петя");
//        Client client3 = new Client(3, "Коля");
//
//        clients.put(client1, 123);
//        clients.put(client2, 456);
//        clients.put(client3, 789);
//
//    }

//private static void findeObject (Map<Client, Integer> clients){
//
//}

//        client1.checkAcc();
//        String n = clients.get(1).getName();
//        System.out.println(clients.get(3).getName());

//        System.out.println("Введите пользователя ");
//        Scanner scanner = new Scanner(System.in);
//        String findAcc = scanner.next();
//}

