package U5S3L3.ex2;

import U5S3L3.ex1.entities.Info;
import U5S3L3.ex1.entities.UserData;
import U5S3L3.ex1.entities.UserDataAdapter;
import U5S3L3.ex1.entities.UserDbTable;
import U5S3L3.ex1.interfaces.DataSource;
import U5S3L3.ex2.entities.Pagina;
import U5S3L3.ex2.interfaces.ParteLibro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        List<ParteLibro> test = new ArrayList<>();

        test.add(new Pagina("contenuto"));



    }
}
