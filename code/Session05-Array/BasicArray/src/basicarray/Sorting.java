package basicarray;

import java.util.Scanner;

/**
 *
 * @author bakuonbn
 */
public class Sorting {
    
    //main() bên kia là main() default, mặc định, đứng ở bất kì class nào
    //F6 đều chạy main() default
    //main() thứ 2 muốn chạy, thì bắt buộc phải mở nó lên, Shift F6
    //đổi default bằng cách -> Properties của dự án -> Run
    public static void main(String[] args) {
        inputStudentList();
    }
    
    //CHƯA OOP 100%, MỌI THỨ PHẢI THUỘC VỀ OBJECT, ĐI QUA OBJECT CHẤM!!!
    public static void inputStudentList() {
        Student[] arr;  //chưa biết bao nhiêu sinh viên!!!
        //có thể khai báo mảng 500 sinh viên có sẵn 500 chỗ
        //có thể hỏi muốn bao nhiêu, thì new bấy nhiêu
        //có 1 cách xịn sò hơn, khỏi hỏi bao nhiêu, đưa new Student() vào
        //là có chỗ, mảng linh hoạt, có giãn kích thước - Collections Framework
        int count, yob;
        String id, name;
        double gpa;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students do you want to input? ");
        //count = sc.nextInt();   //trôi lệnh, try-catch, MyToys.
        count = Integer.parseInt(sc.nextLine());
        arr = new Student[count];
        
        for (int i = 0; i < count; i++) {
            System.out.println("Input student #" + (i + 1) + "/" + count);
            //ngoài đời đếm từ 1, lừa đảo chỉ số i 1 tí, i chạy như cũ,
            //đếm đôn lên 1 giá trị
            System.out.print("Input id: ");
            id = sc.nextLine();
        
            System.out.print("Input name: ");
            name = sc.nextLine();
       
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
        
            System.out.print("Input gpa: ");
            gpa = Double.parseDouble(sc.nextLine());
            
            arr[i] = new Student(id, name, yob, gpa);
        }
        
        System.out.println("The student list");
        for (Student student : arr) {
            student.showProfile();
        }
    }
    
    public static void sortStudentList() {
        //Student arr[] = new Student[5];
        //arr[0] = new Student("SE9", "CHIN", 19, 9.0);
        //arr[1] = new Student("SE5", "NAM", 15, 5.0);
        //arr[2] = new Student("SE8", "TAM", 18, 8.0);
        //arr[3] = new Student("SE2", "HAI", 12, 2.0);
        //arr[4] = new Student("SE7", "BAY", 17, 7.0);
        
        Student arr[] = new Student[]{
            new Student("SE9", "CHIN", 19, 9.0),
            new Student("SE5", "NAM", 15, 5.0),
            new Student("SE8", "TAM", 18, 8.0),
            new Student("SE2", "HAI", 12, 2.0),
            new Student("SE7", "BAY", 17, 7.0)
        };
        
        System.out.println("The student list before sorting");
        for (Student x : arr) {
            x.showProfile();
        }
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getGpa() > arr[j].getGpa()){
                   Student t = arr[i];  //điểm [0] ổn, thì đổi gọi tên, trỏ
                   arr[i] = arr[j];
                   arr[j] = t;
                } //hoán đổi việc trỏ đúng vào vùng new có data điểm phù hợp thứ tự
                  //đổi việc/thứ tự gọi tên sinh viên
                  //thay vì gọi điểm cao, thì gọi thấp trước, vẫn gọi từ [0] từ đầu danh sách
            }
        }
        
        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }
    }
    
    public static void sortPrimitiveArrayV2(){
        int arr[] = new int[]{1000, -1000, 20, -20, 1000, 30, -3000};

        System.out.println("The array before sorting ascending");
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println("");
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {  //i luôn nhỏ hơn j, trước j trong mảng
                    int t = arr[i];     //đứng trước mà bày đặt đòi lớn hơn
                    arr[i] = arr[j];    //thì swap
                    arr[j] = t;
                }
            }
        }
        
        System.out.println("The array after sorting ascending");
        for (int x : arr)
            System.out.print(x + " ");
    }
    
    public static void sortPrimitiveArray(){
        int arr[] = new int[]{1000, -1000, 20, -20, 1000, 30, -3000};
        //                    [0]     đổi
        //                   -1000   1000
        //                                 ko   ko   ko   ko    có
        //                   -3000   1000                     -1000
        //sắp xếp tăng dần
        System.out.println("The array before sorting ascending");
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println("");
        //sắp xếp tăng dần: thằng trước phải < thằng sau, bất kì vị trí nào trên mảng
        //if (thằng trước > thằng sau) -> swap
        //tao cần [0] mày phải nhỏ nhất trong cả đám
        //lấy tao [0] đi so với tất cả phần còn lại, if không ổn thì đổi
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] > arr[i]) {  //[0] đi so với còn lại, bất ổn thì đổi
                int t = arr[0];
                arr[0] = arr[i];
                arr[i] = t;
            }
        }
        
        //-3000 1000 20 -20 1000 30 -1000
        //-3000 20 1000 -20 1000 30 -1000
        //-3000 -20 1000 20 1000 30 -1000
        //-3000 -1000 1000 20 1000 30 -20
        for (int i = 2; i < arr.length; i++) {
            if (arr[1] > arr[i]) {  //[1] đi so với còn lại, bất ổn thì đổi
                int t = arr[1];
                arr[1] = arr[i];
                arr[i] = t;
            }
        }
        
        System.out.println("The array after sorting ascending");
        for (int x : arr)
            System.out.print(x + " ");
    }
}
