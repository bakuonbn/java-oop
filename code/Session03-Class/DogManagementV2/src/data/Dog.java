package data;

/**
 *
 * @author bakuonbn
 */

public class Dog {

    private String name;
    private int yob;
    private double weight;

    public Dog(String name, int yob, double weight) {
        //this sử dụng khi lôi cái tôi cá nhân ra, khi có sự xung đột giữa ngoài và trong
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void bark() {
        System.out.printf("|%-10s|%4d|%4.1f|\n", name, yob, weight);
    }
    
}
