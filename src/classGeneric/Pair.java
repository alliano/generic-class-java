package classGeneric;

public class Pair<T,U> {
    private T firs;
    private U second;
    public Pair(T firs, U second) {
        this.firs = firs;
        this.second = second;
    }
    public T getFirs() {
        return firs;
    }
    public void setFirs(T firs) {
        this.firs = firs;
    }
    public U getSecond() {
        return second;
    }
    public void setSecond(U second) {
        this.second = second;
    }
    

    
}
