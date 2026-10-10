//Khuôn phải có chỗ để, nơi để, không gian để đặt
//Tạo được cái khuôn - dùng cho muôn đời
//Package như cái ngăn tủ/nơi để cất cái khuôn, phân biệt với các loại ngăn tủ, khuôn khác
package data;

/**
 *
 * @author bakuonbn
 */

//Khuôn dùng để đúc ra các object, đối tượng cần lưu trữ info
//Khuôn phải kín, có phễu để chế/rót/hứng/đổ vào cái data, nguyên liệu
public class Dog {
    //chứa đặc điểm, chi tiết mà cái Khuôn, object tương lai sẽ có
    //Khuôn design ra sao, mai mốt object có thế
    private String name;
    private int yob;
    private double weight;
    //...
    //~~ CMND, Thẻ căn cước,... khác value đổ vào, Template
    
    //Có Khuôn thì phải có phễu/miệng loe để hứng vật liệu đi vào
    //phễu dùng để nhận vật liệu đúc ra, tạo ra, construct cái object
    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }
    //phễu còn gọi là constructor, hàm khởi tạo, hàm đúc, hàm tạo dựng
    //ra object vì thông qua nó như cái phễu vật liệu chảy vào trong Khuôn
    //vật liệu khô ra object/bức tượng, CMND của ai, hồ sơ được tạo ra
    //CONSTRUCTOR, PHỄU LÀ HÀM CỰC KÌ ĐẶC BIỆT, VÌ NÓ DÙNG ĐỂ TẠO RA OBJECT
    //CỨ MỖI LẦN DÙNG NÓ, TỨC LÀ PHẢI ĐƯA VẬT LIỆU VÀO, TỨC LÀ CÓ 1 OBJECT MỚI
    //PHỄU LÀ HÀM ĐẶC BIỆT KHÔNG GIÁ TRỊ TRẢ VỀ, KHÔNG VOID LUÔN
    //ÓI VỀ NGUYÊN BỨC TƯỢNG ĐANG ĐÚC
    //TÊN 100% GIỐNG TÊN CLASS
    
    //viết các hàm xử lí data, ví dụ như giao tiếp hỏi năm sinh
    //mày hỏi tao trả lời, vì ba má đã fill yob = 2001
    //object thì gọi là hành động, behaviour, xử lí tính toán trên
    //biến được đổ value từ lúc đúc ra
    
    //hàm gọi n lần tương đương các hành động mà obj nào đó lặp đi lặp lại
    public void bark() {
        //System.out.println("Gogogo...my name is: " + name);
        //System.out.println("Gogogo...my yob is: " + yob);
        //...
        System.out.printf("|%-10s|%4d|%4.1f|\n", name, yob, weight);
    }
    
    //mình đi xăm mình, nhuộm tóc
    //thay đổi info ba ma đã từng cho lúc ba má new/đúc ra mình
    public void setNewWeight(double newWeight) {
        weight = newWeight;
    }
}

//code bên ngoài giống Khuôn bị thủng
