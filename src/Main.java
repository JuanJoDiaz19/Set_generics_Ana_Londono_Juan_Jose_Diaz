public class Main {
    public static void main(String[] args) {
        System.out.println("Esto es una prueba para saber si funcinó :)\n");

        //Metodo constructor de la clase
        Conjunto<Integer> conjuntoEnteros1 = new Conjunto<Integer>();

        //Agrega varios elementos:
        conjuntoEnteros1.agregarElemento(56);
        conjuntoEnteros1.agregarElemento(1);
        conjuntoEnteros1.agregarElemento(5);
        conjuntoEnteros1.agregarElemento(6);
        conjuntoEnteros1.agregarElemento(18);

        //Miramos si los añadió correctamente
        System.out.println("Los elementos del conjunto #1 son:\n" + conjuntoEnteros1.showElements());

        //Miramos si el elemento 6 esta en el conjunto
        if (conjuntoEnteros1.perteneceAlConjunto(6)){
            System.out.println("El elemento 6 existe en el conjunto #1");
        }else{
            System.out.println("El elemento 6 no exite en el conjunto #1");
        }
        //Miramos si el elemento 8 esta en el conjunto

        if (conjuntoEnteros1.perteneceAlConjunto(8)){
            System.out.println("El elemento 8 existe en el conjunto #1");
        }else{
            System.out.println("El elemento 8 no exite en el conjunto #1");
        }
        //Miramos la cardinalidad de un conjunto
        System.out.println("La cardinalidad del conjunto #1 es: "+conjuntoEnteros1.cardinalidadDelConjunto());


        //Creamos un nuevo conjunto para hacer la diferencia de conjuntos
        Conjunto<Integer> conjuntoEnteros2 = new Conjunto<Integer>();
        conjuntoEnteros2.agregarElemento(1);
        conjuntoEnteros2.agregarElemento(2);
        conjuntoEnteros2.agregarElemento(3);
        conjuntoEnteros2.agregarElemento(4);
        conjuntoEnteros2.agregarElemento(5);
        conjuntoEnteros2.agregarElemento(6);

        Conjunto <Integer> conjuntoEnteros3 = conjuntoEnteros1.diferenciaDeConjuntos(conjuntoEnteros2);
        System.out.println("Los elementos del conjunto #2 son:\n"+conjuntoEnteros2.showElements());
        System.out.println("La diferencia del conjunto #1 - conjunto #2 es: \n" + conjuntoEnteros3.showElements());

        //Vemos la union de dos conjuntos
        System.out.println("Esta es la union del conjunto #1 con el conjunto #2:\n" + conjuntoEnteros1.unionDeConjuntos(conjuntoEnteros2).showElements());
    }
}
