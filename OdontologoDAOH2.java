package dao.implementacion;



import MODELADO.Odontologo;
import dao.BD;
import dao.IDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import org.apache.log4j.Logger;

public class OdontologoDAOH2 implements IDao<Odontologo> {
    private static final Logger LOGGER = Logger.getLogger(OdontologoDAOH2.class);


    @Override
    public void guardar(Odontologo odontologo) {
        LOGGER.info("Estamos persistiendo un odontologo");

        Connection connection = null;

        try {
            connection = BD.getConnection();

            //insertar los valores(crear sentencia)
            PreparedStatement psInsert = connection.prepareStatement("INSERT INTO ODONTOLOGOS (MATRICULA, NOMBRE, APELLIDO) VALUES (?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            psInsert.setString(1, odontologo.getMatricula());
            psInsert.setString(2, odontologo.getNombre());
            psInsert.setString(3, odontologo.getApellido());
//ejecutar sentencia
            psInsert.execute();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

    @Override
    public Odontologo buscar(Long id) {
        return null;
    }

    @Override
    public void eliminar(long id) {

    }

    @Override
    public List<Odontologo> buscarTodos() {
        return null;
    }
}

