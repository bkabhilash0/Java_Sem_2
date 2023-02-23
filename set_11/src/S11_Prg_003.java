public class S11_Prg_003<T> {
    T data;

    public void setData(T data) {
        this.data = data;
    }

    void displayType(){
        System.out.println(data.getClass().getName());
    }

    public static void main(String[] args) {
        S11_Prg_003<Integer> num = new S11_Prg_003<>();
        num.setData(10);
        num.displayType();
        S11_Prg_003<String> name = new S11_Prg_003<>();
        name.setData("Hello");
        name.displayType();
    }
}
