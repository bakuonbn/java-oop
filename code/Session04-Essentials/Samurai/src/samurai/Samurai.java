package samurai;

import java.util.Scanner;

/**
 *
 * @author bakuonbn
 */
public class Samurai {

    public static void main(String[] args) {
        //inputProfile();
        inputProfileVip();
    }

    public static void inputProfileVip() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        while (true) { //cuộc chiến vô cực
            try {
                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Do ku know to input a positive number?");
            }
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);

    }

    public static void inputProfile() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        //mặc định JVM sẽ giết app nếu có cà chớn xảy ra để đảm bảo an toàn cho app, xử lí data
        //nó cũng đưa ta 1 cơ chế tự xử khi có cà chớn, chuyển quyền giết chóc cho mình
        //báo JVM biết đừng giết, tao tự xử, nhốt các lệnh cà chớn lại, SANDBOX
        try {
            //lệnh cà chớn nằm here
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
            //nextLine() hốt sạch buffer, loại bỏ enter, còn chuỗi số -> số
        } catch (Exception e) {
            //CPU sẽ chạy đến chỗ này, khi có cà chớn xảy ra
            //JVM không giết app như truyền thống
            //chỗ này là chỗ xử lí hậu quả cà chớn
            //không có cà chớn thì không vào đây
            //e chính là lá thư/msg màu đỏ mà JVM gửi cho mình báo rằng có lỗi cà chớn
            //làm gì thì làm
            //Exception e = new Exception(nội dung lỗi màu đỏ đây nè...);

            //xử lí sao??? nhiều cách: default value (không hay)
            //hay: bắt nhập lại
            yob = 69;
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);

    }

}
