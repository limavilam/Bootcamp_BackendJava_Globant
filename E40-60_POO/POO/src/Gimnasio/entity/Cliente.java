package Gimnasio.entity;
import java.util.UUID;

public class Cliente {

    private UUID id;
    private String name;
    private int age;
    private double height;
    private double weight;
    private String goal;

    public Cliente(){

    }

    public Cliente(UUID id, String name, int age, double weight, double height,String goal){
        this.id=id;
        this.name = name;
        this.age =age;
        this.height = height;
        this.weight = weight;
        this.goal = goal;
    }

    public UUID getId(){
        return this.id;
    }
    public  void setId(UUID id){
        this.id =id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    @Override
    public String toString() {
        return "Cliente: ID:" +this.id+ " Nombre: " +this.name+ ", Edad:" +this.age + ", Altura:" +this.height
                +", Peso:" +this.weight +", Objetivo:" +this.goal;
    }
}

