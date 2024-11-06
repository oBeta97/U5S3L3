package U5S3L3.ex2.entities;


import U5S3L3.ex2.interfaces.ParteLibro;

public class Pagina implements ParteLibro {
    private String contenuto;


    @Override
    public String getContenuto() {
        return this.contenuto;
    }

    @Override
    public int getNPagine() {
        return 1;
    }

    public Pagina(String contenuto) {
        this.contenuto = contenuto;
    }
}
