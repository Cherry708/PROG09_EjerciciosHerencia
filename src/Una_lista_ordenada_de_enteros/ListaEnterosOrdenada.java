package Una_lista_ordenada_de_enteros;

import java.util.Arrays;

public class ListaEnterosOrdenada extends ListaEnteros {

    //Métodos
    public ListaEnterosOrdenada(int tamaño) {
        super(tamaño);
    }

    @Override
    public void añadir(int valor) throws Exception{
        int elemento = 0;

        if (numeroElementos == lista.length)
            throw new Exception ("No se pueden añadir más elementos, la lista está llena");
        else {
            for (int contador = 0; contador < numeroElementos; contador++){
                if (lista[contador] > valor){
                    lista[contador] = lista[contador+1];
                    lista[contador] = valor;
                } else {

                }
            }

            lista[elemento] = valor;
            numeroElementos++;
        }
    }

    @Override
    public String toString() {
        return "ListaEnterosOrdenada{" +
                "lista=" + Arrays.toString(lista) +
                '}';
    }
}
