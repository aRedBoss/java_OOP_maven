import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;
    String city;

    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return name + " (" + age + ") from " + city;
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30, "New York"));
        people.add(new Person("Bob", 25, "Los Angeles"));
        people.add(new Person("Charlie", 35, "New York"));
        people.add(new Person("David", 28, "Chicago"));

        // Sort by age
        people.sort(Comparator.comparingInt(person -> person.age));

        // Filter by city
        people.removeIf(person -> !person.city.equals("New York"));

        // Print the sorted and filtered list
        people.forEach(System.out::println);
    }
}
