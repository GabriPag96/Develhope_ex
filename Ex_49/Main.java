package Ex_49;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {

        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students("Mario Rossi", 20));
        students.add(new Students("Luigi Bianchi", 22));
        students.add(new Students("Giovanni Verdi", 21));
        students.add(new Students("Paolo Neri", 23));
        students.add(new Students("Marco Gialli", 19));
        students.add(new Students("Sara Viola", 20));
        students.add(new Students("Alessandro Marrone", 22));
        students.add(new Students("Giulia Fabbri", 21));
        students.add(new Students("Federico Bianco", 23));
        students.add(new Students("Martina Rosso", 19));
        students.add(new Students("Andrea Verde", 20));
        students.add(new Students("Valentina Gialli", 22));
        //me li sono fatti generare... scusa nicola.

        System.out.println("Lista degli studenti non ordinata:");
        for (Students s : students) {
            System.out.println(s.getName() + ", " + s.getAge() + " anni");
        }

        Collections.sort(students, Comparator.comparing(Students::getName));

        System.out.println("\nLista degli studenti ordinata per nome:");
        for (Students s : students) {
            System.out.println(s.getName() + ", " + s.getAge() + " anni");
        }

        Collections.sort(students, Comparator.comparing(Students::getAge));

        System.out.println("\nLista degli studenti ordinata per età:");
        for (Students s : students) {
            System.out.println(s.getName() + ", " + s.getAge() + " anni");
        }
    }
}

