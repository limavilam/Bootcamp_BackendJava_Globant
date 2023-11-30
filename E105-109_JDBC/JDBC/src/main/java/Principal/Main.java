package Principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//public class Main {
//        public static void main(String[] args) {
//
//        try {
//            Connection connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/mascotas",
//                    "root",
//                    "2124Lina"
//            );
//
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM PERROS");
//
//            while (resultSet.next()){  //Mientras hayan registros en la consola
//                System.out.println(resultSet.getString("perros")); //El nombre de la columna que quiero tener
//            }
//
//            //Se cierra para ahorrar recursos, desconectar base de datos
//            connection.close();
//            statement.close();
//            resultSet.close();
//
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//}