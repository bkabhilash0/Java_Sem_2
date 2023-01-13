public class CString {
    private String word;

    public CString() {
        this.word = "";
    }

    public CString(String word) {
        this.word = word;
    }

    void display(){
        System.out.println(word);
    }

    boolean compare(String w){
        int res = word.compareTo(w);
        return res==0;
    }

    String concat(String w){
        return this.word.concat(w);
    }

}