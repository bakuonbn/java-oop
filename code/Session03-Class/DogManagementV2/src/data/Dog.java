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
    
    //ta chủ động đưa nhiều info của ta ra
    public void bark() {
        System.out.printf("|%-10s|%4d|%4.1f|\n", name, yob, weight);
    }
    
    //một object bất kì có nhiều info mô tả
    //ví dụ: xem điện thoại trên TGDD có ghi thông số
    //nhìn cuốn sách trên mạng có tác giả, ngày xuất bản, mã số,...
    //gặp CSGT, show ra các info mình có: CCCD, Driver lic,...
    //việc show info của 1 object là tự nhiên, FB profile
    //đó là 1 hành động nên có của mỗi object - mô tả, đặc tả về object
    //hành động này có thể do ta chủ động tự đưa ra, hoặc tự generate theo template có sẵn
    //template có sẵn mà Java giúp mình, mình không cần code

    @Override //khác Overload, dính đến kế thừa
    //cả 2 thằng đều có liên quan đến 1 khái niệm là POLYMORPHISM - 50 sắc thái, đa nhân cách
    public String toString() {
        //return "Dog{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
        //độ lại được quyền, vì chỉ cần trả chuỗi chứa info của mình
        //y chang mình làm card visit
        
        //String tmpMsg = String.format("|%-10s|%4d|%4.1f|", name, yob, weight);
        //return tmpMsg;
        
        return String.format("|%-10s|%4d|%4.1f|", name, yob, weight);
    }
    
    //hàm gắn với việc xử lí info của chính object. Ai giàu info, gã đó nên xử lí
    public int getAge() {
        return 2026 - yob;
    }
    //viết code kiểu này gọi là hard-code, fix value, năm sau phải sửa code thì tuổi mới đúng
    //chuẩn: lấy giờ hệ thống Windows - yob;
    
}
