package studentprofile;

import java.util.Scanner;

/**
 *
 * @author bakuonbn
 */
public class StudentProfile {

    public static void main(String[] args) {
        inputProfile();
    }
    
    //Nhập thông tin cơ bản của SV và in ra
    public static void inputProfile() {
        //Không OOP, chỉ cần hiểu về việc nhập info trước đã, không chơi class Student
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();
        
        System.out.print("Input yob: ");
        //yob = sc.nextInt(); //convert data từ bàn phím - là chuỗi thành số
        //để lại rác trong buffer, tệ nhất là enter, rác dấu cách + enter
        //xoá bộ đệm trước nhập chuỗi
        //sc.nextLine(); //hốt rác trong buffer (nếu in ra sẽ là rác)
        
        yob = Integer.parseInt(sc.nextLine());
        //nextLine() hốt sạch buffer, loại bỏ enter, còn chuỗi số -> số
        
        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();
        
        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);

    }
    
}
