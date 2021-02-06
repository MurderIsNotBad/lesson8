import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PersonQueueMain {

    public static void main(String[] args) {

        //Queue<Person> persons = new PriorityQueue<>();
        Comparator<Person> personComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                if(o1.getName().length() > o2.getName().length()){
                    return -1;
                }else if(o2.getName().length() > o1.getName().length()) {
                    return 1;
                }

                return 0;
            }
        };
        Queue<Person> persons = new PriorityQueue<>(personComparator);

        persons.add(new Person("Oleg", 30));
        persons.add(new Person("Viktor", 20));
        persons.add(new Person("Olga", 40));
        persons.add(new Person("Vanya", 50));
        persons.add(new Person("Kolya", 70));

        System.out.println(persons.poll());
        System.out.println(persons.poll());
        System.out.println(persons.poll());
        System.out.println(persons.poll());
        System.out.println(persons.poll());
    }

}
