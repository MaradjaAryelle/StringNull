public class Main {
    public static void main(String[] args) {
        try{
            String texto = null;
            System.out.println(texto.length());}
        catch(NullPointerException e) {
            System.err.println(e);
        }
    }
}