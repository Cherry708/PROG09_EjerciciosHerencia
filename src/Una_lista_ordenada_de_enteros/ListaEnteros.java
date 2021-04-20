package Una_lista_ordenada_de_enteros;

import java.util.Arrays;

public class ListaEnteros {
    //Atributos
    protected int[] lista;
    protected int numeroElementos = 0;

    //Métodos
    public ListaEnteros(int tamaño) {
        lista = new int[tamaño];
    }

    public void añadir(int valor) throws Exception {
        if (numeroElementos == lista.length)
            throw new Exception ("No se pueden añadir más elementos, la lista está llena");
        else {
        lista[numeroElementos] = valor;
        numeroElementos++;
        }
    }

    @Override
    public String toString() {
        return "ListaEnteros{" +
                "lista=" + Arrays.toString(lista) +
                '}';
    }
}
