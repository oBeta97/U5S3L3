package U5S3L3.ex1.entities;

import U5S3L3.ex1.interfaces.DataSource;

public class UserData {
    private String nomeCompleto;
    private int eta;
    
    public void getData(DataSource ds){
        this.nomeCompleto = ds.getNomeCompleto();
        this.eta = ds.getEta();
    }


    public String getNomeCompleto() {
        return this.nomeCompleto;
    }


    public int getEta() {
        return this.eta;
    }

    public UserData(String nomeCompleto, int eta) {
        this.nomeCompleto = nomeCompleto;
        this.eta = eta;
    }

    public UserData() {
    }

    @Override
    public String toString() {
        return "UserData{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", eta=" + eta +
                '}';
    }
}
