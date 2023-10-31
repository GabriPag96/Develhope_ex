package Ex_29;

public class Car {

    private String brand;
    private String model;
    private String plate;
    private int cylinder;

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public String getPlate(){
        return plate;
    }

    public int getCylinder(){
        return cylinder;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setPlate(String plate){
        this.plate = plate;
    }

    public void setCylinder(int cylinder){
        this.cylinder = cylinder;
    }

    public Car(String brand, String model, String plate, int cylinder){
        this.brand = brand;
        this.model = model;
        this.plate = plate;
        this.cylinder = cylinder;
    }

    @Override
    public String toString(){
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", plate='" + plate + '\'' +
                ", cylinder='" + cylinder +
                "cv'}";
    }
}
