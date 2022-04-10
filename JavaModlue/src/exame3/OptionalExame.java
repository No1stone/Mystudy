package exame3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class OptionalExame {

    public static void main(String[] args) {
        List<OnlineClass> springClass = new ArrayList<>();

        springClass.add(new OnlineClass(1, "Spring boot", true));
        springClass.add(new OnlineClass(2, "Spring data jpa", true));
        springClass.add(new OnlineClass(3, "Spring mvc", false));
        springClass.add(new OnlineClass(4, "Spring core", false));
        springClass.add(new OnlineClass(5, "rest api development", true));

        OnlineClass spring_boot = new OnlineClass(1, "Spring Boot", true);

        Optional<OnlineClass> spring = springClass.stream().filter(oc -> oc.getTitle().startsWith("Spring"))
                .findFirst();




    }

}
