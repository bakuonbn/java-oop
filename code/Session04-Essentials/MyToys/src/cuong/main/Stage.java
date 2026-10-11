package cuong.main;

import cuong.util.MyToys;

/**
 *
 * @author bakuonbn
 */
public class Stage {
    public static void main(String[] args) {
        System.out.println(MyToys.PI);
        //MyToys.PI = 4.0;
        
        //int n = MyToys.getAnInteger();
        //System.out.println("n: " + n);
        
        int choice = MyToys.getAnChoice("Input your choice (1...7): ");
        System.out.println("Your choice: " + choice);
    }
}
