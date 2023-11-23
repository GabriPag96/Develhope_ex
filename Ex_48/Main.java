package Ex_48;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students("Mario Morri", 21));
        students.add(new Students("Carla Frappi", 23));
        students.add(new Students("Pippo Spada", 22));
        students.add(new Students("Santina Pera", 25));

        System.out.println("Lista studenti:");
        for (Students s : students) {
            System.out.println(s.getName() + ", " + s.getAge());
        }

        students.add(new Students("Gianluca Marti", 26));
        students.add(new Students("Carlotta Magi", 22));
        students.removeFirst();

        System.out.println("Lista studenti aggiornata:");
        for (Students o: students) {
            System.out.println(o.getName() + ", " + o.getAge());
        }
    }
}
