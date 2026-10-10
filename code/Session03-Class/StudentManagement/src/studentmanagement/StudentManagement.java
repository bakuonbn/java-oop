package studentmanagement;

import data.Student;
import java.util.Scanner;

/**
 *
 * @author bakuonbn
 */
public class StudentManagement {

    public static void main(String[] args) {
        //saveAStudent();
        inputAStudent();
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
    public static void saveAStudent() {
        Student an = new Student("SE666789", "AN NGUYEN", 2001, 8.9);
        an.showProfile();
    }

}
