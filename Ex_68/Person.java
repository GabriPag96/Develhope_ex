package Ex_68;

public class Person {
    private final String firstName;

    private final String lastName;

    private final int age;

    private final String address;

    @Override
    public String toString(){
        return "Person: " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '.';
    }

    public Person(String name, String lastName, int age, String address){
        this.firstName = name;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public String getAddress(){
        return address;
    }

    public static class Builder {

        private final String firstName;

        private final String lastName;

        private int age;

        private String address;

        public Builder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int age){  //fare costruttore ma modificarlo in modo tale da diventare Builder Pattern
            this.age = age;
            return this;
        }

        public Builder address(String address){ //NOTA: Builder Pattern non può essere legato ad un "final"
            this.address = address;
            return this;
        }

        public Person build (){
            return new Person (firstName,lastName,age,address);
        }
    }
    public static Builder builder(String firstName, String lastName) {
        return new Builder(firstName, lastName);
    }
}
