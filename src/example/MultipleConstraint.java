package example;


public class MultipleConstraint {
    public static void main(String[] args) {
        
        Data<vicePrecident> vData = new Data<MultipleConstraint.vicePrecident>(new vicePrecident());
        System.out.print(vData);
    }
    public static interface CanSayHello {
        public void sayHello(String name);
    }

    public static abstract class Employee{
       
    }

    public static class Manager extends Employee {
        
      

    } 
    public static class vicePrecident extends Employee implements CanSayHello {
        @Override
        public void sayHello(String name){
            System.out.println(name);
        }
    }

    public static class Data<T extends Employee & CanSayHello> {
        private T data;

        public Data(T data) {
            this.data = data;
        }
        public void setData(T data) {
            this.data = data;
        }
        public void printToScreen(){
            System.out.println(this.data);
        }
        public T getData() {
            return data;
        }

        
    }
}