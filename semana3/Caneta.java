public class Caneta{

    private String modelo;
    private String cor;

    public Caneta()
    {
        System.out.println("Objeto caneta criado....");
        this.cor = "azul";
        this.modelo = "Escrita Grossa";
    }

    public void imprimir()
    {
        System.out.println("Cor= " + this.cor);
        System.out.println("Modelo= " + this.modelo);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

   

}

