import classGeneric.Mydata;

public class Covariant {
    public static void main(String[] args) {
        Mydata<String> name = new Mydata<String>("alliano");
        process(name);

        //ini ERROR jga
        // Mydata<? extends Object> mydata1 = new Mydata<Object>("data1");
        // Mydata<String> mydata2 = mydata1;

        //ini boleh gpp
        Mydata<String> data1 = new Mydata<String>("alliano2");
        Mydata<? extends Object> data2 = data1;
        System.out.println(data2.getData()
        );
    }
    public static void process(Mydata<? extends Object> arg){
            System.out.println(arg.getData());

            // arg.setDat(arg.setData("skbjkd"); => ini error karna data covarian hanya read only
    }
}
