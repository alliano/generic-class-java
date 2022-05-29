/**
 * untuk memebatasi tipe4 data yang boleh di gunakan di generic parameter type
 * kita bisa menambahkan constrain di generic parameter type dengan menytebutkan 
 * tipe data parameter yang di perbolehkan
 * secara otomatis tipe data yg boleh di gunakan adalah tipe data y ang kita sebutkab berserta 
 * tutunan tipe data yang kita sebutkan
 * contoh jika kita meng set constrain nya Number makan kita bisa menggunakan 
 * tipe data turunan integger seperti doouble long dll
 * Secara default constrain type untuk generic adalah Object sehinga semua tipe data bisa di gunakan
 * 
 * 
 */

public class ConstraintEx {
    public static void main(String[] args) {
        //Integer dan dooble adalah class turunan dari Number
        NumberData<Integer> dataInt = new NumberData<Integer>(1000);
        NumberData<Double> dataDouble = new NumberData<Double>(10.00);
        System.out.println(dataInt.getData());
        System.out.println(dataDouble.getData());
        //ini ERROR karna String bukan subchild dari Integer
        // NumberData<String> dataStr = new NumberData<String>("data salah");
    }

    public static class NumberData<T extends Number> {
        private T data;
    public NumberData(T data) {
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
