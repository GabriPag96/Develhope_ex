package Ex_69;

public class Main {
    public static void main(String[] args){

        User user1 = User.getInstance ("Mario",64);
        User user2 = User.getInstance ();

        user1.printInfo ();
        user2.printInfo ();

        user2.setName ("Marcella");
        user2.setAge (27);

        user1.printInfo ();
        user2.printInfo ();
    }
}
