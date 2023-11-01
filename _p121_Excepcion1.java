public class _p121_Excepcion1 {
    public static void main(String[] args) {
        
        int a = 100;
        int b = 0;
        
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("No se puede dividir entre cero");
        } finally {
            System.out.println("Aqui llegamos se produzca el error o no");
        }
        
    }

}
