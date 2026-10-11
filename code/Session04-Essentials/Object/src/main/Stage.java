package main;

import data.Student;

/**
 *
 * @author bakuonbn
 */
public class Stage {
    public static void main(String[] args) {
        Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        //reference var          object, vùng ram bự trong HEAP
        //object    var          instance, thể hiện, hiện thân, bức tượng
        //"pointer" var
        
        s1.showProfile();
        //s1 đang nắm/lưu toạ độ vùng ram object trong HEAP
        //new làm cực kì nhiều việc
        //1. clone Khuôn (object và static)
        //2. gọi phễu đổ data vào vùng clone
        //3. chốt lại toạ độ vùng new vừa rồi, đem toạ độ đó đi gán cho biến con trỏ
        
        //s1 là biến, vậy nó có thể thay đổi value!!!
        //sếp với bạn trẻ đang trỏ đến CaSi Sơn Tùng
        //sếp với người đi làm, trỏ đến ông/bà quyết định lương cho mình
        //sếp tham chiếu người này người kia
        Student x = s1; //2 con trỏ trỏ cùng vùng new, 2 chàng trỏ 1 nàng
        
        s1 = new Student ("SE666788", "BINH LE", 1998, 8.8);
        //LI DỊ AN
        System.out.println("s1 now is BINH");
        s1.showProfile();
        
        System.out.println("AN after s1 từ chối chơi"); //AN CŨ
        x.showProfile();
        
        //AN NGUYEN KHÔNG CÒN AI TRỎ, KHÔNG CÒN CÁCH NÀO LẤY LẠI ĐƯỢC VÙNG RAM NÀY
        //TOẠ ĐỘ NEW CŨ TA KHÔNG GIỮ LẠI
        
        //biến object là tay cầm con diều, vùng new chính là con diều
        //khi tay cầm nối sợi dây con diều mới, con diều cũ không còn chơi nữa, đứt sợi dây, bay mất
        //1 vùng ram new Object mà không còn ai trỏ tới, JVM có chương trình ngầm gọi là
        //Cty Môi trường đô thị, GARBAGE COLLECTOR, ĐI GOM NHỮNG VÙNG NEW MỒ CÔI, KHÔNG CON TRỎ, DỌN FREE RAM FREE HEAP
        //trả lại ram không dùng cho new sau này
        
        //1 biến có quyền trỏ vùng new, giữ lại AN được không, mà vẫn có BINH lưu toạ độ thôi mà
        
        //VI DIỆU
        new Student("SE666789", "DAI GIA", 2001, 9.9).showProfile();
    }
}
