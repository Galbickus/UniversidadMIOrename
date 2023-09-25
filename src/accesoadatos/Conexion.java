package accesoadatos;

import java.sql.*;
import javax.swing.JOptionPane;

/*
 * @author Veronica
 */
//vamos a agregar métodos estáticos porque los vamos acceder desde un medio estático
//y un atibuto de tipo Connection que es el que usarán nuestras clases data
//para realizar el Prepare Statement y poder enviar
//sentencias SQL a la bd
public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "universidad";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;

    /*el constructor es privado porque quiero un patrón singleton 
    controlando la cantidad de instancias el constrictor
    es PRIVADO esto hace que no se pueda instanciar de afuera*/
    private Conexion() {
    }

    /*Como el constructor es privado los mátodos 
    son estateicos, la funcion de este método es
    darle al extrior la conexion
    el metodo devuelve un objeto CONNECTION
    OJO no es un objeto CONEXION como el nombre de nuesta clase*/
    public static Connection getConnection() {                //SINGLETON

        if (connection == null) {

            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);
                JOptionPane.showMessageDialog(null, "Conexión exitosa");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers. " + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión a la BD. " + ex.getMessage());
            }

        }
        return connection;
    }

}
