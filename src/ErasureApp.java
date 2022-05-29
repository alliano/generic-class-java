import javax.print.DocFlavor.STRING;

import classGeneric.Mydata;

/**
 * type erasure adalah proses pengecekan generic pada saat compile time (saat source code di compile)
 * type ensure menjadika informasi generic type yang kita buat akan menghilang ketika kode program kita
 * telah di compile menjadi binary file
 * compiler akan mengubah generic parameter type menjadi tipe Object di java
 */
public class ErasureApp {
    
    public static void main(String[] args) {
        /**
         * ketia kita mng instansiasi Object tapmpa kita devinisikan tipe datanya ini jalan
         * tapi jikalau kita konversi datanya menjadi tipe data apapun itu tidak akan error saat 
         * kompilasi tapi saat kita runing maka akan terjadi error
         * ager langsung error saat menulis kode maka harus kita tentukan tipe type generic nya
         */
        Mydata data = new Mydata("mugen sukoyomi"); //==> ini tipe parameter nya string
        System.out.println(data.getData());
        Mydata<Integer> iMydata = (Mydata<Integer>) data; // ==> disini di konversi ke Integer dan tidak terjadi err
        Integer dataInt = iMydata.getData(); //==> sat kita simpan ke dalam variabel pun tidak err
        System.out.println(dataInt);

        //AGAR ERROR SAAT MENULIS KODE
        // Mydata<String> data2 = new Mydata<String>("abis ini belajar graphql apolo");
        // Mydata<Integer> dataInteger = data2;

        
        
    }


}
