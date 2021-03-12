public class TesterCaneta{

    public static void main(String[] args) {

        Caneta caneta = new Caneta();
        caneta.imprimir();

        caneta.setModelo("Escrita Fina");
        caneta.setCor("verde");
        caneta.imprimir();

        System.out.println( caneta.getModelo()  );

    
    }

}