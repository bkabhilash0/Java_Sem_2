public class S11_Prg_002 {

    public <T> void getData(T[] data){
        for(T i: data){
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("Size of the Array is "+data.length);
    }
    public static void main(String[] args) {
        S11_Prg_002 numbers = new S11_Prg_002();
        Integer[] d = new Integer[]{1,2,3};
        numbers.getData(d);
        S11_Prg_002 names = new S11_Prg_002();
        String[] n = new String[]{"A","B"};
        names.getData(n);

    }
}
