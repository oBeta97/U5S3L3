package U5S3L3.ex2.entities;

import U5S3L3.ex2.interfaces.ParteLibro;

import java.util.HashSet;
import java.util.List;

public class Sezioni implements ParteLibro {
    private List<ParteLibro> parteLibros;

    @Override
    public String getContenuto() {
        String res = "";

        for (ParteLibro pl : this.parteLibros){
            res = res.concat(pl.getContenuto());
        }

        return res;

    }

    @Override
    public int getNPagine() {
        int sum = 0;

        for (ParteLibro pl : this.parteLibros){
            sum += pl.getNPagine();
        }

        return sum;
    }


}
