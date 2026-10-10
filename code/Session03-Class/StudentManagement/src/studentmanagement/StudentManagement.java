package studentmanagement;

import data.Student;
import java.util.Scanner;

/**
 *
 * @author bakuonbn
 */
public class StudentManagement {

    public static void main(String[] args) {
        saveStudents();
        //saveAStudent();
        //inputAStudent();
    }

    //nhập từ bàn phím
    //cần Scannner - object bàn phím - trong OOP cái gì cũng object, class
    //Máy Cam, Scanner tiệm photo, WC, Bàn Phím Cơ, Touchpad -> nhóm Quét dữ liệu
    //đưa vào máy tính, Class Scanner xuất hiện. Dùng phải new để cho nó hành xử
    //từ bàn phím đi vào ram, do đó phải có biến hứng value
    public static void inputAStudent() {
        String id, name;
        int yob;
        double gpa;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input id: ");
        id = sc.nextLine();
        
        System.out.print("Input name: "); //chuỗi trước số không bị lạc trôi lệnh
        name = sc.nextLine();
        
        System.out.print("Input yob: ");
        yob = sc.nextInt();
        
        System.out.print("Input gpa: ");
        gpa = sc.nextDouble();
        
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
        //x.setId(id); //nguy hiểm
    }

    //hard-code
    public static void saveStudents() {
        Student an = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        Student binh = new Student("SE662204", "BINH LE", 2004, 0.4);
        an.showProfile();
        binh.showProfile();
        
        //chấm xổ gì
        //Access Modifier (quyền truy xuất để chỉnh sửa)
        //Access Specifier (chỉ định rõ truy xuất theo cách nào)
        System.out.println("An name (directly): " + an.name);   //y chang cầu thủ dán tên sau lưng
        System.out.println("An name (directly): " + an.getName());
        
        //vì sờ được trực tiếp cái name/biến/instance variable, ta có thể get() và set()
        //an.name = "KHONG HOC BAI";
        Student.name = "CAY RANK HON CAY CODE";
        
        System.out.println("Binh name (directly): " + binh.name);
        System.out.println("An name again (directly): " + an.name);
        
        System.out.println("Student name (directly): " + Student.name);
        
        an.showProfile();
        
        //sayHi() mà sayHi() đang là static
        System.out.println("Using static");
        an.sayHi();         //không tư hữu theo kiểu của riêng mình cho static
        binh.sayHi();
        Student.sayHi();    //Tên Class chấm static vì là đồ chung cho multiple objects
        
        //2 loại dấu chấm
        //chấm trực tiếp qua tên class tức là chạm sờ STATIC
        //chấm qua con đường new tức là bạn đang hàm ý chơi với non-static
        //                                  đồ của riêng từng object
    }

}

//STATIC ĂN THEO THẰNG CUỐI CÙNG
