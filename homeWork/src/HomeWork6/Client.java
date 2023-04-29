package HomeWork6;

public class Client {
    public int age;
    public String name;

    public Client(int age, String name) {
        this.age = age;
        this.name = name;

    }

//    public void print() {
//        System.out.println(id);
//        System.out.println(name);
//    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return age + " " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && name.equals(client.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
}
