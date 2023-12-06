package Ex_68;

public class Main {
    public static void main(String[] args){

        Person person1 =
                new Person.Builder ("Pippo","Manichino")
                        .age (22)
                        .address ("Via Italia 1")
                        .build ();

        System.out.println (person1);

        Person person2 =
                new Person.Builder ("Carla", "Martello")
                        .age (35)
                        .address ("Via Garibaldi 22")
                        .build ();

        System.out.println (person2);

        //crediti http://www.javabyexamples.com/builder-pattern-in-java/
    }
}
