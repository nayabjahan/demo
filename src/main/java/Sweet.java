public class Sweet<T>{
    T name;

    public Sweet(T name) {
        this.name = name;
    }
    public void print(){
        System.out.println(name);
    }
}