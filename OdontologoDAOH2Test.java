package dao.implementacion;

import MODELADO.Odontologo;
import dao.BD;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoDAOH2Test {

    @Test

    public void testTodosLosDentistas(){
        BD.createTable();

        OdontologoDAOH2 odontologoDAOH2 = new OdontologoDAOH2();
        Odontologo odontologo1 = new Odontologo("J2255","Paula","Almirante");
        Odontologo odontologo2 = new Odontologo("J2247", "Hernan","Cespedes");
        Odontologo odontologo3 = new Odontologo("J2235","Eugenia","Manrique");
        odontologoDAOH2.guardar(odontologo1);
        odontologoDAOH2.guardar(odontologo2);
        odontologoDAOH2.guardar(odontologo3);

        List<Odontologo> odontologos = odontologoDAOH2.buscarTodos();
        assertEquals(3,odontologos.size());
        assertTrue(odontologos.contains(odontologo1));
        assertTrue(odontologos.contains(odontologo2));
        assertTrue(odontologos.contains(odontologo3));

    }


}