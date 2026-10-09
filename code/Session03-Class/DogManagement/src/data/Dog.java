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
}

//code bên ngoài giống Khuôn bị thủng
