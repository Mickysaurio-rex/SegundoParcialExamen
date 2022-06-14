package examen.ejercicio2;

import javax.print.Doc;

public class Client {
    public static void main(String []args){
        ChatDelJuego dicord = new ChatDelJuego();

        Estudiantes j1 = new Estudiantes(dicord);
        j1.setNombre("Jose");
        j1.setAlias("Maquinator");
        j1.setRanking("Top 100");


        Estudiantes j2 = new Estudiantes(dicord);
        j2.setNombre("Nestor");
        j2.setAlias("Skipper");
        j2.setRanking("Top 100");



        Estudiantes j3 = new Estudiantes(dicord);
        j3.setNombre("Daniel");
        j3.setAlias("DanDa");
        j3.setRanking("Top 100");


        Docentes j4 = new Docentes(dicord);
        j4.setNombre("Hugo");
        j4.setAlias("Huguito");
        j4.setRanking("Top 100");


        Docentes j5 = new Docentes(dicord);
        j5.setNombre("Raul");
        j5.setAlias("Lalo");
        j5.setRanking("Top 100");


        dicord.agregarJugadores(j1).agregarJugadores(j2).agregarJugadores(j3).
                agregarJugadores(j4).agregarJugadores(j5);


        System.out.println("***************NUEVO MENSAJE***************");
        j5.send("Hola", "Todos");
        System.out.println("***************NUEVO MENSAJE***************");
        j4.send("Vamoooooos", "Mi equipo");
    }
}
