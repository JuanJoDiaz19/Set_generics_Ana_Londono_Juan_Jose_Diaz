public interface IConjunto<T> {
    public void agregarElemento(T elemento);
    public boolean perteneceAlConjunto(T elemento);
    public int cardinalidadDelConjunto();
    public Conjunto<T> diferenciaDeConjuntos(Conjunto<T> conjDif);
    public Conjunto<T> unionDeConjuntos(Conjunto<T> conjUnion);
}
