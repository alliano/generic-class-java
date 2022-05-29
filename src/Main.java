import classGeneric.Mydata;
import classGeneric.Pair;
import util.ArrayHelper;

public class Main {
    public static void main(String[] args) {
        Mydata<String> dataString = new Mydata<String>("alliano");
        Mydata<Integer> dataInt = new Mydata<Integer>(200);
        Mydata<Boolean> dataBool = new Mydata<Boolean>(false);

        System.out.println(dataString.getData());
        System.out.println(dataInt.getData());
        System.out.println(dataBool.getData());

        Pair<String, Integer> pair1 = new Pair<String,Integer>("alliano", 300);
        Pair<Boolean,String> pair2 = new Pair<Boolean,String>(false, "data failed inserted");
        System.out.println(pair1.getFirs());
        System.out.println(pair1.getSecond());
        System.out.println(pair2.getFirs());
        System.out.println(pair2.getSecond());

        String[] name = {"Alliano","gatau","bahgsad"};
        Integer[] angka = {1,2,3,4,5};
        
        /**bisa gini */
        System.out.println(ArrayHelper.<String>count(name));
        System.out.println(ArrayHelper.<Integer>count(angka));
        /**bisa gini jga */
        System.out.println(ArrayHelper.count(name));
        System.out.println(ArrayHelper.count(angka));

        // ERROR
        // Mydata<String> data = new Mydata<String>("jin");
        // String data2 = (String) data;
        
        //ERROR
        /**
         * saat komplasi tiudak error tapi saat kita runing makan the error will occur
         */
        // String data = "data 1";
        // Mydata<String> data2 = new Mydata<String>(data);
        // System.out.println(data2);

        
    }
}
