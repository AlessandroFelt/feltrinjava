package lampadina;
/**
 *
 * @author alessandro.feltrin
 */
public class Lampadina {
    private String  marca;
    private String  colore;
    private int     numeroAccensioni;
    private int     numeroVolte;
    private boolean stato;
    
    public Lampadina(String marca, String colore, int numeroVolte,
                                       int numeroAccensioni, boolean stato){
        this.marca = marca;
        this.colore = colore;
        this.numeroAccensioni = numeroAccensioni;
        this.numeroVolte = numeroVolte;
        this.stato = stato;       
    }
    
    public String getmarca() {
        return marca;
    }
    
    public void setmarca(String marca) {
        this.marca = marca;
    }
}
