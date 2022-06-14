package examen.ejercicio3;

public class UserPagina implements IUser{
    String categoria;
    Persona persona;

    public UserPagina(String categoria, Persona persona) {
        this.categoria = categoria;
        this.persona = persona;
    }


    @Override
    public void update(String msg, Elemento elemento) {
        System.out.println("*********NOTIFICACION*********");
        System.out.println("Nombre :" + persona.getNombre() );
        System.out.println("Preferencia: " + categoria);

    }

    @Override
    public String getPreferenciaCategoria() {
        return categoria;
    }

    public Persona getPersona() {
        return persona;
    }
}
