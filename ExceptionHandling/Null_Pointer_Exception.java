

public class Null_Pointer_Exception {
    public static void main(String[] args) {
        String s=null;
        try {
            System.out.print(s.length());
        } catch (Exception e) {
            System.out.println("Hi"+e );
        }
    }
}
