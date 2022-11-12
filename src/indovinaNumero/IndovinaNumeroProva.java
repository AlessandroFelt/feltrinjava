package indovinaNumero;

public class IndovinaNumeroProva {

    public static void main(String[] args) {
        int n = 7;
        
        String testoDaStampare;
        
        IndovinaNumero n1 = new IndovinaNumero(n);
        
        testoDaStampare = n1.stampa();
        
        System.out.println(n1.pensa());
        System.out.println(testoDaStampare);
        
        
    }
    
}
