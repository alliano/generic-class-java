/**
 * untuk membatasi tipe data dengan beberapa jenis tipe data di generic 
 * parameter 
 * kita bisa menambahkan beberapa bounded tipe parameter dengan karakter & setelah bounded tipe 
 * pertama contoh <T extend Number & Calculate> --> tipe data yang ke 2 harus interface 
 * jika ingin menambkan lagi cukup tambahkan karakter & dan tipe interface yang mau di gunakan
 */

public class MultipleConstraint {
    public static void main(String[] args) {
        
        /**
         * ini error karna Managr tidak implement ke interface CanSayHello
         */
        // Data<Manager> managerData = new Data<MultipleConstraint.Manager>(new Manager());
        Data<vicePrecident> vicePrecidenData = new Data<MultipleConstraint.vicePrecident>(new vicePrecident());
        System.out.println(vicePrecidenData);
    }
    public static interface CanSayHello{
        void sayHello(String greet);
    }
    
    public static abstract class Employee {

    }

    public static class Manager extends Employee{

        // @Override
        // public void sayHello(String greet) {
        //     System.out.println(greet);
        // }
    }
    public static class vicePrecident extends Employee implements CanSayHello {

        @Override
        public void sayHello(String greet){
            System.out.println(greet);
        }
    }

    public static class Data<T extends Employee & CanSayHello > {
        private T data;
        
        public Data(T data){
            this.data = data;
        }

        public void setData(T data) {
            this.data = data;
        }
        public T getData() {
            return data;
        }
    }



}
