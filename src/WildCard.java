import classGeneric.Mydata;

/**
 * whildCard tidak peduli dengan generic parameter type pada object nya
 * jika kita ingin meng print data T tapi tidak peduli dengan tipe datanya
 * jika kita memiliki kasus seperti ini cocok sekali kita menggunakan whilchard 
 * untuk membuat whildchard kita bisa mengguanakn ? sebagai generic type nya
 * exp <?>
 */
public class WildCard {
    public static void main(String[] args) {
        //kita bisa masukan parameter bebas type nya
        print(new Mydata<String>("jibakutense"));//tipe string
        print(new Mydata<Number>(1000));//tipe integer/number
        print(new Mydata<MultipleConstraint.Manager>(new MultipleConstraint.Manager()));//tipe object
    }

    //parameternya bebas mau type apa aja
    public static void print(Mydata<?> data) {
        Object object = data.getData();
        System.out.println(object);
    }

}
