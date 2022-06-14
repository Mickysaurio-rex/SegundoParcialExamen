package examen.ejercicio2;

public abstract class Persona {
    protected IChatDeJuegos chatDeJuegos;

    private String alias;

    private String nombre;

    private String ranking;


    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public Persona(IChatDeJuegos chatDeJuegos) {
        this.chatDeJuegos = chatDeJuegos;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona(String alias, String nombre, String equipo) {
        this.alias = alias;
        this.nombre = nombre;
    }

    public IChatDeJuegos getChatDeJuegos() {
        return chatDeJuegos;
    }

    public String getAlias() {
        return alias;
    }


    public void setChatDeJuegos(IChatDeJuegos chatDeJuegos) {
        this.chatDeJuegos = chatDeJuegos;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public abstract void send(String msg, String destino);
    public abstract void received(String msg);
}
