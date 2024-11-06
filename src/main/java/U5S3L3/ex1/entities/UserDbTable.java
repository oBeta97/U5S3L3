package U5S3L3.ex1.entities;

import U5S3L3.ex1.interfaces.DataSource;

public class UserDbTable {

    public boolean correctData(DataSource ds){
        return ds.getEta() > 30 && !ds.getNomeCompleto().isEmpty();
    }

}
