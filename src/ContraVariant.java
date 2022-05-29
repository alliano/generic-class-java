import classGeneric.Mydata;

/**
 * contravariant artinya kita bisa melakukan subsitusi supertype(parent) dengan subtype
 * (child) 
 * untuk membuiat contravarian adalah dengan menambahkan sintax ( <? super subClass> ) contoh 
 * Mydata<? super String> myData
 *  
 */
public class ContraVariant {
    public static void main(String[] args) {
        Mydata<Object> objMydata = new Mydata<Object>("alliano");

        Mydata<? super String> myData = objMydata;
        System.out.println(myData.getData());
        process(myData);
    }

    public static void process(Mydata<? super String> mydata){
        mydata.setData("hemmm..kamu bgsd");
        // String value = mydata.getData(); //ERROR karna contravarian klo untuk read data berbahaya jikalau ttp mau read data maka harus di konversi cnth
        String value2 = (String) mydata.getData(); //tapi ini tidak disarankan
        System.out.println(value2);
        
    }
}
