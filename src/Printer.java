public class Printer<T> {

    T value;

    public Printer(T value) {
        this.value = value;
    }

    public String toString(){
        return "{{{" + value + "}}}";
    }

    public T getValue(){
        return value;
    }

}
