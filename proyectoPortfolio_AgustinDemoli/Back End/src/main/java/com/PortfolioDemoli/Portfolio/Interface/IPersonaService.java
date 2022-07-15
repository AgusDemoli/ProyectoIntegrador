package com.PortfolioDemoli.Portfolio.Interface;

import com.PortfolioDemoli.Portfolio.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Para traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto buscando a partir de ID
    public void deletePersona(Long id);
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
}
