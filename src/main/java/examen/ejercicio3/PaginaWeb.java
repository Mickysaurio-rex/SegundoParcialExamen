package examen.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class PaginaWeb implements ICanal{


    private List<Elemento> elementosASubir = new ArrayList<>();
    private List<IUser> usuarios = new ArrayList<>();


    public void subirElemento(Elemento elemento){
        elementosASubir.add(elemento);
        notifyObserver(elemento);
    }

    @Override
    public void suscribirse(IUser observer) {
        usuarios.add(observer);
    }

    @Override
    public void detach(IUser observer) {
        usuarios.remove(observer);
    }

    @Override
    public void notifyObserver(Elemento elemento) {
        for (IUser u1 : usuarios) {
            if (elemento.getCategoria().equals("Video")) {

                    u1.update("Nuevo videooo!", elemento);

            } else {
                if (!(u1.getPreferenciaCategoria().equals("Video"))) {
                    u1.update("Nuevo elemento agregado", elemento);
                }
            }
        }
    }
}
