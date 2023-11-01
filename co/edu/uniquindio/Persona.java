package co.edu.uniquindio;
import static co.edu.uniquindio.poo.torneodeportivo

public class Persona {

    private final String nombre; 
    private final String apellido;
    private final String email;
    private final String celular;

    public Persona(String nombre, String apellido, String email, String celular){

        ASSERTION.assertion (nombre!=null && !nombre.isBlank(), "el nombre es requerido");


        this.nombre= nombre;
        this.apellido= apellido;
        this.celular= celular;
        this.email= email;

       

    }

    
    
}
