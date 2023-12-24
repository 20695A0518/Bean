import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
       List<Person> p=List.of(new Person("vasu","deva","vasudeva@gmail.com","mpl",List.of("Manager","SDE")),
               new Person("Ramesh","Kumar","rameshkumar@gmail.com","bng",List.of("Manager1","SDE1")),
               new Person("suresh","Reddy","SureshReddy@gmail.com","bng",List.of("Manager2","SDE2")),
               new Person("Ram","Reddy","RamReddy@gmail.com","bng",List.of("Manager3","SDE3")),
        new Person("venky","vekatesh","Venky@gmail.com","bng",List.of("Manager4","SDE4")));
       String []collect=p
               .stream()
               .map(e-> String.format(e.getFirstName()+" "+e.getLastName()))
               .map(F->F.toUpperCase(Locale.ROOT))
               .sorted(Collections.reverseOrder())
               .toArray(String[]::new);
//
//       String []dd=p
//               .stream()
//               .flatMap(e->e.getRoles().stream())
//               .distinct()
//               .sorted()
//               .toArray(String[]::new);
        for (String i :collect
             ) {
            System.out.println(i);

        }

       // p.stream().forEach(System.out::println);
//        (or)
//        Iterator<Person> it=p.stream().iterator();
//        while (it.hasNext()){
//            Person p1=it.next();
//            System.out.println(p1);
//        }
    }
}