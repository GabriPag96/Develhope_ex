package Ex_28;

public class Studente {

    private String nome;
    private String cognome;
    private int age;
    private int id;

    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    public int getAge(){
        return age;
    }

    public int getId(){
        return id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setId(int id){
        this.id = id;
    }

    Studente (String nome, String cognome, int age, int id){

        this.nome = nome;
        this.cognome = cognome;
        this.age = age;
        this.id = id;


    }

    @Override
    public String toString(){
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }


}
