package AgilProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListaCelulares {
    private ArrayList<Celular> listaCelulares;
    ListaMenuDesplegable listaMenuDesplegable;

    public ListaCelulares() {
        this.listaCelulares = new ArrayList<Celular>();
        listaMenuDesplegable = new ListaMenuDesplegable();
    }

    public ArrayList<Celular> getListaCelulares() {
        return listaCelulares;
    }

    public void setListaCelulares(ArrayList<Celular> listaCelulares) {
        this.listaCelulares = listaCelulares;
    }

    public Celular get(int i) {
        return listaCelulares.get(i);
    }

    public void aniadirCelular(Celular celular) {
        this.listaCelulares.add(celular);
    }

    public void ordenarPorModelo() {
        Collections.sort(listaCelulares, new ComparadorCelulares());
    }

    public void imprimirPorConsolaElementos() {
        Iterator<Celular> iteradorDeCelular = listaCelulares.iterator();
        while (iteradorDeCelular.hasNext()) {
            System.out.println(iteradorDeCelular.next());
        }
    }

    public void imprimirPorConsolaElementosListaDeMenu() {
        listaMenuDesplegable.imprimirListaDesplegable();
    }

    public int buscarPorModelo(Celular celular) {
        ordenarPorModelo();
        return Collections.binarySearch(listaCelulares, celular, new ComparadorCelulares());
    }

    public void crearArrayListDeModelos() {
        ordenarPorModelo();
        Iterator<Celular> iteradorDeCelular = listaCelulares.iterator();
        MenuDeplegable menuDeplegable;
        String modelo = "";
        int cantidad = 0;
        float precioPorUnidad = 0;
        Celular celularAuxiliar;
        while (iteradorDeCelular.hasNext()) {
            celularAuxiliar = iteradorDeCelular.next();
            if (verificarCelularesDisponibles(celularAuxiliar)) {
                modelo = celularAuxiliar.getModelo();
                precioPorUnidad = celularAuxiliar.getPrecio();
                menuDeplegable = new MenuDeplegable(modelo, cantidad, precioPorUnidad);
                if (listaMenuDesplegable.estaVacio()) {
                    listaMenuDesplegable.aniadirNuevoElementoDesplegable(menuDeplegable);
                } else if (listaMenuDesplegable.buscarPorModelo(menuDeplegable) <= -1) {
                    listaMenuDesplegable.aniadirNuevoElementoDesplegable(menuDeplegable);
                }
            }
        }
        listaMenuDesplegable.delegarLaCantidadPorModelo(listaMenuDesplegable, this);


    }

    public boolean verificarCelularesDisponibles(Celular celular){
        return celular.getEstado().equalsIgnoreCase("Disponible");
    }

    public int contarPorModelo(String modelo) {
        int cantidad = 0;
        for (int i = 0; i < listaCelulares.size(); i++) {
            if (listaCelulares.get(i).getModelo().equals(modelo) && listaCelulares.get(i).getEstado().equalsIgnoreCase("Disponible")) {
                cantidad++;
//                System.out.println(cantidad);
            }
        }
        return cantidad;

    }

    public boolean verificarExistenciaCelularesMenuDesplegable(String modelo) {
        MenuDeplegable md1 = new MenuDeplegable(modelo, 0, 0);
        return listaMenuDesplegable.buscarPorModelo(md1) >= 0;
    }

    public boolean verificarDisponibilidadMenuDesplegable(int cantidad, String modelo) {
        boolean estaDisponible = false;
        for (int i = 0; i < listaMenuDesplegable.tamanioDeLaLista(); i++) {
            if (listaMenuDesplegable.get(i).getModelo().equalsIgnoreCase(modelo)) {
//                System.out.println("Cantidad del modelo " + listaMenuDesplegable.get(i).getCantidad());

                estaDisponible = listaMenuDesplegable.get(i).getCantidad() >= cantidad;
            }
        }
        return estaDisponible;
    }

    public int tamanioLista() {
        return listaCelulares.size();
    }


}
