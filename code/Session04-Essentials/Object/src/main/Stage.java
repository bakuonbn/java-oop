package main;

import data.Student;

/**
 *
 * @author bakuonbn
 */
public class Stage {
    
    public static void main(String[] args) {
        Student ahihi = checkObjectV8(); //ahihi lưu toạ độ của AN trong hàm thảy ra ngoài
        ahihi.showProfile();
    }
    
    //Hàm trả về 1 object hả? KHÔNG
    //đọc chuẩn: hàm trả về 1 toạ độ của object nào đó, vì trả được toạ độ nghĩa là
    //sờ được object, có toạ độ chấm là tới object
    public static Student checkObjectV8(){ //~~~ Student x = sẽ là 1 vùng new
        Student x;
        x = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        return x;   //Việt sub: x lưu toạ độ vùng clone AN
                    //thảy toạ độ đó cho tên hàm
    }
    
    public static void checkObjectV7(){
        Student x;  //khai báo biến, khai báo con trỏ, nhưng chưa trỏ ai
        //tao với mày nói về thằng x kia đi, ai vậy, từ từ sẽ nói
        
        x = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        //à nó đây nè
        //x = new()
    }
    
    public static void checkObjectV6(){
        //câu chuyện của sinh ra rồi chết non
        //câu chuyện vô danh tên gọi
        //object không có tên gọi, vẫn hành xử được
        
        //Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        //           đã tương đương toạ độ rồi, thảy toạ độ đó đi đâu thôi
        //           thảy cho biến object nào đó giữ giùm toạ độ
        //biến đó mà chấm nghĩa là toạ độ chấm, NGHĨA LÀ NEW CHẤM LUÔN
        //vì biến có toạ độ từ new. CHỐT HẠ: NEW NẮM TOẠ ĐỘ
        //chấm là vào tỏng toạ độ xem có cái gì, trong object có gì

        new Student("SE666789", "AN NGUYEN", 1999, 8.9).showProfile();
        //không thèm đặt tên cho object để giao tiếp, để object tự giao tiếp
        //object vô danh, anonymous object, object was created without a name, a reference variable
        //XUẤT HIỆN XONG, GÁY XONG, KHÓC XONG, GARBAGE COLLECTOR PHÁT HIỆN KHÔNG CON TRỎ -> GIẾT, CLEAR
        //MUỐN RE-USE LẠI VÙNG NEW, TỐI THIỂU ÍT NHẤT 1 TÊN GỌI, 1 BIẾN OBJECT ĐỂ CÒN CHẤM TIẾP
    }
    
    public static void checkObjectV5(){
        //câu chuyện 2 chàng 1 nàng
        Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        Student x = s1; //mày là biến lưu toạ độ vùng new, cho tao toạ độ đi
        
        s1.showProfile();
        x.showProfile(); //backup toạ độ new AN ở trên, thêm 1 con trỏ trỏ cùng, trùng
        //chứng minh 2 chàng trỏ đúng 1 nàng
        //chàng 1 tát, chàng 2 thấy
        s1.setName("MÌNH CHƠI Ú TÌM HENG");
        //trong vùng clone new AN đã bị thay đổi name thành MÌNH CHƠI Ú TÌM HENG
        System.out.println("After TÁT");
        //không thèm hỏi s1, hỏi luôn x xem sao
        x.showProfile();
        
        //NHIỀU TÊN CÙNG THAM CHIẾU 1 OBJECT
    }
    
    public static void checkObjectV4(){
        Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        Student x = s1; //mày là biến lưu toạ độ vùng new, cho tao toạ độ đi
                        //nếu tao tự new như mày, ra vùng clone mới
                        
        //int a = 10;
        //int b = a; //cho tao value của mày, tao muốn lấy value của mày
        
        //trước khi s1 trỏ toạ độ mới, backup 
        //giữ lại được AN
        s1 = new Student("SE666788", "LOC PHAT", 1998, 8.8);
        s1.showProfile();   //LP
        x.showProfile();    //AN đã trở lại, backup toạ độ new vào 1 biến khác cùng kiểu
        
    }
    
    public static void checkObjectV3(){
        Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        s1 = new Student("SE666788", "LOC PHAT", 1998, 8.8);
        //con diều AN đứt dây
        //vì sợi dây nối với diều mới LP
        
        //s1 li dị vùng clone AN NGUYEN, chuyển sang kết nối với LOC PHAT
        //ống nhòm dòm sang chỗ mới, con trỏ lưu toạ độ mới, biến thay đổi value, lưu value gần nhất
        
        //int a = 10; a = 100;
        
        s1.showProfile();
        //mất toạ độ vùng clone AN NGUYEN
        //vùng ram không có ai trỏ tới, thì định kì khi chạy app
        //JVM sẽ kiểm soát app, giết/clear vùng clone không có con trỏ
        //JVM có đoạn code, module giám sát HEAP, xem đứa nào mồ côi (không có con trỏ) giết ngay và luôn
        //anh giám sát này gọi tên là Garbage Collector - người gom rác
        System.gc(); //gom rác HEAP
        
        //ngoài đời có gán lại biến con trỏ, tên tắt cho thứ phức tạp
        //sếp = ca sĩ Sơn Tùng
        //chết cha sếp kìa, sếp = người chấm lương cho mình
    }
    
    public static void checkObjectV2(){
        Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        Student s2 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        s1.setName("AI ROI CUNG KHAC");
        
        s1.showProfile();
        s2.showProfile();
        //1 new 1 clone, 2 SV khác nhau, 2 vùng ram khác nhau
    }
    
    public static void checkObjectV1() {
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
