package Ex_69;

public class User {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    private static User instance = null;

    private User() {
        this.name = "default";
        this.age = 0;
    }

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static User getInstance() {  //Singleton instance.
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }
    public static User getInstance(String name, int age) {  //Singleton instance con parametri.
        if (instance == null) {
            instance = new User(name, age);
        }
        return instance;
    }
    public void printInfo() {  //costruttore per print informazioni.
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
