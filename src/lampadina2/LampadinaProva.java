package lampadina2;

public class LampadinaProva {

    public static void main(String[] args) {

        Lampadina l1 = new Lampadina("pupone", "r", 24, 6, false);
        Lampadina l2 = new Lampadina("marzone", "r", 24, 6, false);
        Lampadina l3 = new Lampadina("philip", "r", 24, 8, false);

        int nAcc1 = l1.getnVolteAccesa();
        int nAcc2 = l2.getnVolteAccesa();
        int nAcc3 = l3.getnVolteAccesa();

        if (nAcc1 > nAcc2 && nAcc1 > nAcc3) {
            System.out.println("Lampadina 1");
        } else {
            if (nAcc1 == nAcc2 || nAcc1 == nAcc3) {
                System.out.println("Due o tre lampadine uguali");}
else {
//n2 > n3 o n3 > n2 o n2 = n3
if (nAcc2 > nAcc3) {
    System.out.println("Lampadina 2");
        } else {
// n2 <= n3
            if (nAcc3 > nAcc2) {
                System.out.println("Lampadina 3");
                    } else {
                        System.out.println("Due lampadine uguali");}
                }
            }
        }
    }
}