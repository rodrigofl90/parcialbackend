package SERVICE;

import MODELADO.Odontologo;
import dao.IDao;
import dao.implementacion.OdontologoDAOH2;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class OdontologoService {

 private  List<Odontologo> odontologos = new ArrayList<>();

 private static final Logger logger = Logger.getLogger(OdontologoService.class);



    public void guardar(Odontologo odontologo){
        odontologos.add(odontologo);
        logger.info("Odontologo guardado: " + odontologo);
    }

    public List<Odontologo> getOdontologos() {
        return odontologos;
    }
}


