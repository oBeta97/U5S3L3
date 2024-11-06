package U5S3L3.ex1;

import U5S3L3.ex1.entities.Info;
import U5S3L3.ex1.entities.UserData;
import U5S3L3.ex1.entities.UserDataAdapter;
import U5S3L3.ex1.entities.UserDbTable;
import U5S3L3.ex1.interfaces.DataSource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Info persona1 = new Info("Mario", "Rossi", new Date(90, 4, 15)); // 15 maggio 1990
        Info persona2 = new Info("Luisa", "Verdi", new Date(85, 11, 30)); // 30 dicembre 1985
        Info persona3 = new Info("Giulia", "Bianchi", new Date(100, 2, 20));

        UserData utente1 = new UserData("Alessandro Neri", 30);
        UserData utente2 = new UserData("Martina Rossi", 25);
        UserData utente3 = new UserData("Luca Bianchi", 40);


        UserDataAdapter uda1 = new UserDataAdapter(persona1);
        UserDataAdapter uda2 = new UserDataAdapter(persona2);
        UserDataAdapter uda3 = new UserDataAdapter(persona3);

        List<DataSource> dList = new ArrayList<>();
        dList.add(utente1);
        dList.add(utente2);
        dList.add(utente3);
        dList.add(uda1);
        dList.add(uda2);
        dList.add(uda3);

        UserDbTable udt = new UserDbTable();


        for(DataSource d : dList){

            System.out.println(d.toString());

            if(udt.correctData(d))
                System.out.println(d.getNomeCompleto() + " può entrare!");
            else
                System.out.println(d.getNomeCompleto() + " non può entrare!");
        }



    }
}
