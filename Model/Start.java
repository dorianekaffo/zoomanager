package Model;

// import com.mysql.jdbc.Statement;

import java.sql.SQLException;

public class Start {
    public static void main(String arg[]) {

        DBInteraction query = new DBInteraction();

        try {
            String[][] data = query.selAllPreNomPersonne();
            for (String[] s : data) {
                for (String s2 : s) {
                    System.out.print(s2 + " ");
                }
                System.out.println();
            }
        } catch (ExceptionDataBase e) {
            System.out.println(e.getMsg());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        try {
            int nb = query.nombrePersonne();
            System.out.println(nb);
        } catch (ExceptionDataBase e) {
            System.out.println(e.getMsg());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


        try {
            String typeEvenement = query.selTypeEvenement(2);
            System.out.println(typeEvenement);
        } catch (ExceptionDataBase e) {
            System.out.println(e.getMsg());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n_> Programme terminé ... \n");
    }


}