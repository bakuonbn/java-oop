package data;

/**
 *
 * @author bakuonbn
 */
public class Student {
    //static
    private static String id;   //nằm ở 1 vùng nhớ riêng, mà object nào cũng dùng ké, chung
    public static String name;  //vùng nhớ dùng chung cho các object cùng Nhóm/Class
                                //dữ liệu đổ vào hay chỉnh sửa ăn theo thằng cuối cùng gán/đổ
    
    //CHỐT HẠ: KHÔNG DÙNG STATIC CHO NHỮNG THỨ/ĐẶC ĐIỂM/HÀM MÀ CỦA RIÊNG TỪNG OBJECT
    //tui có mã số, bạn có mã số, bạn kia có mã số, nhưng đều là riêng của mỗi đứa
    //chung đặc điểm, khác value, vậy phải có biến clone riêng - NON STATIC
    
    //non-static
    public int yob;
    private double gpa; //grade point average

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    //public void setId(String id) {
    //    this.id = id;
    //}
    //hiếm khi đổi mã số, giống như môn DB primary key

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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%8s|%-25s|%4d|%4.1f|", id, name, yob, gpa);
    }

    public void showProfile() {
        System.out.printf("|%8s|%-25s|%4d|%4.1f|\n", id, name, yob, gpa);
    }   //NON STATIC CHƠI VỚI NON - DĨ NHIÊN CÙNG OBJECT VÀ STATIC LUÔN, ĐỒ RIÊNG THÀNH CHUNG
    
    public int getAge() {
        return 2026 - yob;
    }
    
    public static void sayHi() {
        System.out.println("Hi everyone, my name is " + name);
        //System.out.println("By the way, my yob is " + yob);
        //static chỉ chơi với static vì cùng khu vực, không chơi với non
        //có quá nhiều yob được clone - biết lấy ai bỏ ai
    }

}
