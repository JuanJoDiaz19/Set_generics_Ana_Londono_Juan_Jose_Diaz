import java.util.ArrayList;
public class Conjunto<T> implements IConjunto<T> {
    private ArrayList<T> elementos;
    public Conjunto() {
        elementos = new ArrayList<T>();
    }
    @Override
    public void agregarElemento(T elemento) {
        if(!elementos.contains(elemento)) {
            elementos.add(elemento);
        }
    }
    @Override
    public boolean perteneceAlConjunto(T elemento) {
        return elementos.contains(elemento);
    }
    @Override
    public int cardinalidadDelConjunto() {
        return elementos.size();
    }
    @Override
    public Conjunto<T> diferenciaDeConjuntos(Conjunto<T> conjDif) {
        Conjunto<T> newConj = new Conjunto<T>();
        for (int i = 0; i < elementos.size(); i++) {
            if (!conjDif.perteneceAlConjunto(elementos.get(i))) {
                newConj.agregarElemento(elementos.get(i));
            }
        }
        return newConj;
    }
    @Override
    public Conjunto<T> unionDeConjuntos(Conjunto<T> conjUnion) {
        Conjunto<T> newConj = new Conjunto<T>();
        for (int i = 0; i < elementos.size() ; i++) {
            newConj.agregarElemento(elementos.get(i));
        }
        for (int i = 0; i < conjUnion.cardinalidadDelConjunto(); i++) {
            if(!newConj.perteneceAlConjunto(conjUnion.getElementos().get(i))){
                newConj.agregarElemento(conjUnion.getElementos().get(i));
            }
        }
        return newConj;
    }
    public ArrayList<T> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<T> elementos) {
        this.elementos = elementos;
    }

    public String showElements() {
        String ans = "";
        for (int i = 0; i < elementos.size(); i++) {
            ans += elementos.get(i).toString()+" ";
        }
        return ans;
    }
}
