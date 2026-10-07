package varnfun;

/**
 *
 * @author bakuonbn
 */

// Biến là 1 tên gọi, đại diện cho 1 giá trị được thay đổi theo thời gian
// và giá trị đó sẽ được cất vào trong RAM
// VD: VAT: 10%, PI: 3,14
// Vùng RAM cất giá trị đó sẽ được đặt 1 cái tên để dễ tham chiếu, dễ nói chuyện
// Biến (Variable) tức là có sự thay đổi (Age - năm nay 20 | năm sau 21,...)
public class VarNFun {

    public static void main(String[] args) {
        printIntegerList();
        
        //playWithBooleans();
        
        //playWithCharacters();
        
        //playWithDoubles();
        
        //playWithIntegers();
        
        //playWithVariables();
    }
    
    //in ra các siis tự nhiên từ 1 đến 100
    public static void printIntegerList() {
        System.out.println("The list of 100 first integers");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
    
    public static void playWithBooleans() {
        boolean marriedStatus = false;
        if (marriedStatus == true)
            System.out.println("Đánh đồn có địch mới vui");
        else
            System.out.println("Vườn hồng có lối nhưng chưa ai vào");
    } 
    
    public static void playWithCharacters() {
        //2 byte cho kiểu char, lưu bảng Unicode
        char m = '$';
        System.out.println("unit: " + m);
        
        //tên em thì sao?
        String name = "Cuong Nguyen Ba"; //loại data type mới hoàn toàn
                                         //phức tạp, do gom n thứ khác
                                         //object data type
        System.out.println("My name is: " + name);
        System.out.println("1st letter of my name: " + name.charAt(0));
        System.out.println("My name as in a lowercase: " + name.toLowerCase());
    }
    
    //Java ưu tiên double hơn float
    public static void playWithDoubles() {
        double pi = 3.14;
        System.out.println("pi: " + pi);
        System.out.printf("pi: %.2f\n", pi); //cấm tuyệt đối dùng %lf
        
        float vat = 0.1F;
        System.out.println("vat: " + vat);
    }
    
    public static void playWithIntegers() {
        int n = 39; //mọi con số, kí tự xuất hiện trong code được gọi là literal value
                    //số nguyên xuất hiện trong code mặc định là int
        System.out.println("n: " + n);
        
        long m = 3_000_000_000L;
        System.out.println("m: " + m);
        
        int status = 0xFA; //hệ 16
        System.out.println("status: " + status);
        
        int phone = 010; //hệ 8 octal
        System.out.println("phone: " + phone);
    }

    //static thì chỉ chơi với static
    public static void playWithVariables() {
        //biến là 1 vùng ram được đặt tên, chiếm 1 số byte nhất định tuỳ loại
        //dữ liệu, thông tin mà nó sẽ chứa bên trong - data type - hình thức data
        //số, chữ, ảnh,...
        //biến là cách đặt tên cho 1 đại lượng, 1 giá trị đơn - phức
        
        int age = 20;
        int a = 10, b;
        b = 100;
        //tốn 12 byte trong RAM
        System.out.println("age: " + age);
        
        int yob = 2001;
        age = 2026 - yob;
        System.out.println("age again: " + age);
        
        System.out.println("age by using transitive tech: " + (2026 - yob));
        
        System.out.printf("age printed by using %% as in C: %d\n", (2026 - yob));
    }

}
