package basicarray;

/**
 *
 * @author bakuonbn
 */
public class BasicArray {

    public static void main(String[] args) {
        playWithPrimitiveArrayV2();
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
