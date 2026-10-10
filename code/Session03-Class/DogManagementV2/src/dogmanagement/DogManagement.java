package dogmanagement;

import data.Dog;

/**
 *
 * @author bakuonbn
 */
public class DogManagement {

    public static void main(String[] args) {
        //lấy Khuôn Dog ra để bắt đầu đổ info
        //y chang làm thẻ căn cước: lấy thông tin, in lên thẻ, đổ mực
        //sau khi chờ khô, ta được object thuộc Nhóm vừa đúc
        //đặt tên gọi tắt cho object để dễ dàng nói chuyện, tham chiếu đến
        
        Dog chiHu = new Dog("CHI HU HU", 2021, 0.5);
        //có object thì object sẽ biết làm gì đó, cờ hó biết sủa
        chiHu.bark();
        
        Dog ngaoDa = new Dog("NGAO DA", 2020, 50.0);
        ngaoDa.bark();
        
        //tại 1 thời điểm biến chỉ lưu được 1 value
        //int yob = 2001;
        //System.out.println("Yob: " + yob);
        //yob = 2002;
        //System.out.println("Yob again: " + yob);
        
        //chiHu sủa trở lại
        //new có nghĩa xin vùng ram mới đủ chứa info của 1 bạn Dog sẽ được đúc, được đổ data
        //tương tự với việc cái khuôn sau khi có bức tượng sẽ bỏ tượng ra và tiếp tục đổ nguyên liệu vào
        //nên ngaoDa không đè lên data của chiHu
        //việc ai người đấy làm
        System.out.println("Chi Hu Hu barks again");
        chiHu.bark();
        
        //bark(); ??? đứa nào sủa vậy??? không biết
        //HÀNH ĐỘNG PHẢI GẮN VỚI OBJECT, THÔNG QUA CHẤM
        
        System.out.println("After overweight");
        chiHu.setWeight(5);
        chiHu.bark();
        
        int chYob = chiHu.getYob();
        System.out.println("CH YOB: " + chYob);
        
        System.out.println("ND YOB: " + ngaoDa.getYob());

    }
    
    //ENCAPSULATION: TÍNH ĐÓNG GÓI CỦA THÔNG TIN VÀ HÀNH ĐỘNG
    //HÀM & BIẾN ĐI KÈM VỚI NHAU ĐẠI DIỆN, MÔ TẢ CHO 1 OBJECT, THỰC THỂ (SỐNG)
    //ENCAPSULATION LÀ KHÁI NIỆM GÓI MỌI THỨ VÀO TRONG 1 CLASS, TỪ CLASS NHÂN BẢN RA OBJECT
    //OBJECT NÀO HÀNH ĐỘNG TRONG KHUÔN KHỔ NHÀ OBJECT ĐÓ
    
}
