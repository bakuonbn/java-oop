package dogmanagement;

import data.Dog;

/**
 *
 * @author bakuonbn
 */
public class DogManagement {

    public static void main(String[] args) {

        Dog chiHu = new Dog("CHI HU HU", 2021, 0.5);
        chiHu.bark();

        Dog ngaoDa = new Dog("NGAO DA", 2020, 50.0);
        ngaoDa.bark();
        
        //tui mún show toàn bộ info của tui, theo cách toString()
        //object có nhiều hành động
        System.out.println("Show all info by using toString() - a new behavior");
        
        String chDetails = chiHu.toString();
        System.out.println("CH details: " + chDetails);
        System.out.println("ND details: " + ngaoDa.toString());

        //hàm toString() rất đặc biệt, @Override
        //mục tiêu là show ra all of info đã đổ vào hoặc chỉnh sửa
        //y chang như mở Setting trong phone xem phần info điện thoại
        
        System.out.println("Play with toStirng()");
        System.out.println(chiHu);  //chiHu là biến object, lưu toạ độ vùng new
                                    //lí thuyết in ra địa chỉ, thực tế Java thì gọi toString() ngầm
                                    //gọi thầm tên em
        System.out.println(ngaoDa);   
        
        //NẾU KHUÔN KHÔNG CÓ HÀM TOSTRING() THÌ MẶC NHIÊN KHI NÓ ĐƯỢC TRIỆU GỌI (GỌI THẦM HAY GỌI TRỰC TIẾP)
        //JVM SẼ TỰ ĐỘNG BĂM CÁI VÙNG RAM CỦA OBJECT THÀNH CON SỐ HEXA ĐẠI DIỆN CHO VALUE VÙNG RAM ĐÓ
        //HASH NUMBER - NÉN TOÀN BỘ DATA THÀNH 1 CON SỐ, MD5, SHA-256,...
        
        //xem tuổi của 1 object, tương tác, hỏi đáp, giao tiếp với object qua dấu chấm
        System.out.println("Get age");
        System.out.println("ND age: " + ngaoDa.getAge());
    }
    
}
