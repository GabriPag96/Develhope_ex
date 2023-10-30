package Ex_28;

public class Studente {

    String nome;
    String cognome;
    int age;
    int id;

    @Override
    public String toString(){
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    Studente (String nome, String cognome, int age, int id){

        this.nome = nome;
        this.cognome = cognome;
        this.age = age;
        this.id = id;


    }
}
