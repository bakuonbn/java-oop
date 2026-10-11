package cuong.util;

import java.util.Scanner;

/**
 *
 * @author bakuonbn
 */

//đây là Class, Khuôn, chứa, có đặc điểm/hành động/chứa các món đồ chơi dùng chung
//cho mọi nơi - vì nó không nhớ cái gì cho riêng tư của nó

//LIBRARY/FRAMEWORK - chứa các hàm/biến (data) dùng chung cho nhiều công việc khác nhau
//của các dự án khác nhau
public class MyToys {
    //đặc điểm/hành vi là static, cho người ta sờ thì thêm public
    //không nhớ cái gì của riêng mình
    //Một class bình thường thì vẫn có thể vừa static vừa non-static, tuỳ nhu cầu, cách thức
    //Math: hầu hết static
    //String: vừa non-static, vừa có static
    //System: hầu hết static
    public static final double PI = 3.1415;
    public static final double VAT = 0.1;
    //final (HẰNG SỐ) ~ const bên C: biến không cho thay đổi value, trừ lần đầu tiên khái báo

    //đẩy Scanner ra ngoài xài chung cho các hàm static của chúng ta, tại sao không?
    private static Scanner sc = new Scanner(System.in);
    //private cho nhu cầu dùng nội bộ bên trong
    
    //                                   tb nhập, errorMsg, lower, upper
    public static int getAnChoice(String inputMsg) {
        int n;  //hứng từ bàn phím gõ gì
        do {
            try {
                System.out.print(inputMsg);
                //n = sc.nextInt(); để lại rác
                n = Integer.parseInt(sc.nextLine());
                //if chửi ngoài biên...
                return n;
            } catch (Exception e) {
                System.out.println("Do ku know how to input an integer?");
            }
        }while (true);
    }
    
    //trong quá trình làm app, việc nhập số là gặp lại nhiều lần
    //nhập 2 cạnh của 1 HCN, 3 cạnh của 1 TG, nhập sự lựa chọn menu, điểm TB, điểm thi các môn,...
    //mỗi cú nhập, biến nhập, kèm theo: trôi lệnh, cà chớn - try catch - do while
    //tách việc nhập số nguyên thành 1 hàm, gói chửi bới, trôi lệnh, nhập lại vào 1 chỗ
    //ta hứng kết quả trả về từ hàm, lấy để dùng, MyToys nhớ con số này làm gì
    //Math.sqrt(4) -> mình dùng, Math không cần nhớ, không cần non-static
    //new mà trả về kết quả cho người ta dùng, không cần nhớ, dùng nhiều ram làm gì, STATIC là thượng sách
    public static int getAnInteger() {
        int n;  //hứng từ bàn phím gõ gì
        do {
            try {
                System.out.print("Input an integer: ");
                //n = sc.nextInt(); để lại rác
                n = Integer.parseInt(sc.nextLine());
                //if chửi ngoài biên...
                return n;
            } catch (Exception e) {
                System.out.println("Do ku know how to input an integer?");
            }
        }while (true);
    }
}
