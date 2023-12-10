public class Wrapper<T> {
    private T obj;

    public Wrapper(T obj) {
        this.obj = obj;
    };

    public T getobj() {
        return this.obj;
    };

    public void setobj(T obj) {
        this.obj = obj;
    };

    public void swap(Wrapper<T> other) {
        T temp = this.obj;
        obj = other.obj;
        other.obj = temp;
    };
};