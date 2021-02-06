import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) throws IOException {

        HashSet<String> statuses = new HashSet<>();

        String aNew = "new";
        String inProgress = "in progress";
        String done = "done";
        String failed = "failed";
        String lost = "lost";

        statuses.add(aNew);
        statuses.add(inProgress);
        statuses.add(done);
        statuses.add(failed);
        statuses.add(lost);

        System.out.println(statuses);

        System.out.println(statuses.contains("two"));
        System.out.println(statuses.contains("four"));

        for(String str: statuses){
            System.out.println(str);
        }

        Set<String> goodStatuses = Set.of(aNew, inProgress, done);
        Set<String> badStatues = Set.of(failed,lost);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String orderStatus;
        while(!(orderStatus = reader.readLine()).equals("exit")) {

            if (goodStatuses.contains(orderStatus)) {
                System.out.println("Everything is good. Green color");
            }else if (badStatues.contains(orderStatus)) {
                System.out.println("Everything is bad. Red color");
            }else{
                System.out.println("Unknown status");
            }


        }
    }

}
