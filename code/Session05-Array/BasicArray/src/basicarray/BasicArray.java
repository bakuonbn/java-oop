package basicarray;

/**
 *
 * @author bakuonbn
 */
public class BasicArray {

    public static void main(String[] args) {
        playWithStudentArray();
    }
    
    public static void playWithStudentArray(){
        //lưu hồ sơ 10 bạn sinh viên
        //10 biến/tên tắt + 10 value phức tạp ~ 10 phát new ()
        //lưu 10 số tự nhiên
        //10 biến/tên tắc + 10 value đơn
        //int arr[] = new int[10]; //arr[0] ~ int x; arr[1] ~ int y
                                 //= value đơn từ từ
        Student s1,  s2,  s3,  s4,  s5, s6, s7, s8, s9, s10, s11, s12, s13; //LẺ
        //     x[0] x[1] x[2] x[3] x[4]
        Student list[] = new Student[10]; //đừng nhầm lẫn khi new, 2 loại ngoặc
                                         //() gọi phễu 1 object
                                         //[] tao cần ? biến đối tượng
        //[] dành cho nhiều biến, nhiều tên gọi tắt
        list[0] = new Student("SE123456", "AN NGUYEN", 2001, 5.6);
        list[1] = new Student("SE123457", "BINH LE", 2000, 5.7);
        list[2] = new Student("SE123458", "CUONG VO", 1999, 5.8);
        //mấy con trỏ còn lại mang giá trị gì??? biến Student chưa gán mang giá trị gì
        //list[3] ... list[9] là gì??? 0 LÀ DEFAULT
        //                             TRỎ VÀO TOẠ ĐỘ 0 CỦA RAM, ĐỊA CHỈ 0 CỦA RAM
        //                             BYTE ĐẦU TIÊN TRONG THANH RAM TOÀN LÀ SỐ 0 OFOFOFOFOFOFOFOF
        //tức là byte đầu tiên (thứ 0), toạ độ thứ 0 của ram chứa toàn số 0
        //byte NULL, BYTE KHÔNG CÓ GÌ CẢ, TOÀN 0
        //IN MẢNG CÁI COI
        System.out.println("The list of students");
        for (int i = 0; i < 3; i++) {
            list[i].showProfile();
            //tao chỉ là 1 biến Student x thôi mà
        }
        
        s1 = null; //tao trỏ đáy ram heng, null heng, làm biếng new
                   //có value rồi, số 0, toạ độ 0 ở đáy ram, đi vào 00000000
        s1.showProfile(); //có mẹ gì mà show, NullPointerException
        
        //NGUYÊN TẮC KHI CHƠI VỚI MẢNG PHẢI LÀ: LUÔN LUÔN CÓ BIẾN COUNT ĐỂ CHO BIẾT
        //MẢNG ĐÃ GÁN VALUE ĐẾN ĐÂU, FOR ĐẾN ĐÓ, KHÔNG FOR ĐẾN .LENGTH
        //BỊ DEFAULT VỚI PRIMITIVE, NULL VỚI MẢNG OBJECT
        
    }
    
    public static void playWithStudentObject(){
        Student x = new Student("SE123456", "AN NGUYEN", 2001, 5.6);
        x.showProfile();
    }
    
    public static void playWithPrimitiveArrayV3(){
        int arr1[] = {5, 10, 15, 20}; //new ngầm, không nói rõ việc new, thực ra là có
        int arr3[] = new int[]{5, 10, 15, 20};
        int arr2[] = new int[5];
        
        int arr[];
        arr = new int[5];
        //có nhiều biến trùng tên rồi, sau đó dùng từng biến theo nhu cầu!!!
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        
        //arr là gì, mày là 1 biến đặc biệt, mày là biến object luôn, vì trỏ 1 vùng new bự
        //có quyền chấm, chấm cái gì???, tệ nhất là .toString()
        //arr là biến phức tạp vì nó có nhiều info bên trong
        //info này là phần tử của mảng
        //arr[0] ~~~ arr.get(thằng thứ 0) -> được 5 / arr[0] được 5
        //arr.length - biến lưu đặc điểm của 1 mảng, có bao nhiêu phần tử
        //static hay non? non, vì nếu static thì mọi mảng cùng kích thước
        
        //arr.length; //hằng số đặc biệt, ăn theo từng mảng, mỗi mảng sẽ khác nhau size
        
        System.out.println("Array has: " + arr); //gọi thầm tên em, convert data của các biến thành mã Hexa
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        //arr . xổ ra gì? public của vùng new
        
        //arr[0] xổ ra gì? xổ cái đầu mày, tao là primitive, tên biến phức tạp thôi
        //nhưng tao vẫn đơn giá trị (tên tao có ngoặc vuông do trùng tên nhưng value của tao đơn giản)
        System.out.println("");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        
        //get() set() không có mà thay = chơi trực tiếp []
        //để thay đổi value bên trong biến/phần tử
    }
    
    public static void playWithPrimitiveArrayV2(){
        double arr[] = new double[100]; //default gán hết = 0
        arr[0] = 39;
        arr[1] = 79;
        arr[2] = 6868;
        arr[3] = 2204;
        
        System.out.println("The array has values of (for i)");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        //arr[0] chấm éo xổ gì vì nó là biến primitive
        //arr.length
        //DÙ LÀ MẢNG PRIMITIVE HAY MẢNG MẸ GÌ CHƯA BIẾT
        //TÊN MẢNG LÀ BIẾN MÁ MÌ, TÚ ÔNG TÚ BÀ, BIẾN OBJECT, BIẾN CON TRỎ, REFERENCE
        //TAO SẼ TRỎ VÙNG RAM CHÀ BÁ LỬA NEW ĐÓ, KHÔNG ĐÚC TRUYỀN THỐNG MÀ LÀ ĐÚC NHIỀU BIẾN
        //MÁ MÌ SẼ QUẢN LÍ CÁC CHÁU DƯỚI QUYỀN (ĐẶC ĐIỂM CỦA MÁ MÌ)
        //MÁ MÌ CHẤM RA ĐƯỢC SỐ LÍNH
        
        System.out.println("\nThe array has values of (for each)");
        for (double x : arr) {
            System.out.print(x + " ");
        }
    }
    
    public static void playWithPrimitiveArray(){
        //double vol[365]; //Java cấm khai báo kích thước mảng, số phần tử trong []
        
        //double vol[365] = {0, 0, 5, 10, 15, 20, 25};
        
        float v[] = {0, 0, 5, 10, 15, 20, 25};   //mảng có 7 phần tử, có sẵn luôn value
        //7 biến float v[0] = 0; v[1] = 0; v[2] = 5;,...
        //7 biến float nằm trên HEAP, có new ngầm đấy
        System.out.println("The array has values of (printed by individual)");
        
        v[0] = 6868; 
        for (int i = 0; i < 6; i++) {
            System.out.print(v[i] + " ");
        }
        
        //ta có thể xem mảng như là 1 tập hợp các value trong dấu {} giống Toán
        //ta có thể xài khái niệm với mọi, với mỗi để duyệt qua toàn bộ mảng
        System.out.println("\nThe array v has values of (using for each)");
        for (float x : v) {
            //x = v[0], x = v[1], x = v[i] với mọi x là 1 biến lẻ, bằng từng thằng lẻ trong mảng sỉ
            //sout(v[i])~~~~~~~~~~~~~~~~~~~~~~~~sout(x)
            System.out.print(x + " ");
        }
        
        //N = {0, 1, 2, 3, 4, 5,...}
        //V x e N, x là mấy, x là bất kì trong N
        //         x = 0, x = 1,...
        //với mọi là kĩ thuật quét qua mảng
        //dùng đèn pin quét từ đầu đến cuối
        //kĩ thuật dùng là 1 con số tự nhiên
        //duyệt qua tất cả phần tử của tập hợp
        
    }
    
}
