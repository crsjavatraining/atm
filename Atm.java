/**
 * Írjon egy Bankautomata nevű osztályt az alábbi két konstruktorral:
Public Bankautomata()
Public Bankautomata(int kezdoosszeg)
Ezáltal a Bankautomata() egy üres automatát hoz létre és Bankautomata(osszeg)
egy automatát  aminek az ”osszeg”-e elérhető számunkra.
 
A „Public void feltoltes (int osszeg) „ nevű metódussal meg tudjuk tolteni az automatát azáltal hogy  az automatában elérhető „osszeg”-et növeljük.
 
A „Public int osszegmutatas()” metódussal le tudjuk kérni mennyi pénzünk van a bankban és a „Public int felvetel(int osszeg)” metódussal pénzt tudunk felvenni azaz csökken a az elérhető „osszeg” de csak akkor ha az elérhető összegnél kevesebbet vagy egyenlő mennyiséget veszünk fel.
 */
public class Atm
{
    private int balance;
    
    public Atm() {
        this.balance = 0;
    }
    
    public Atm(int balance) {
        this.balance = balance;
    }
    
    public void deposit(int amount) {
        balance = balance + amount;
    }
    
    //TODO: throw IllegalStateException in case balance is lower then the amount to withdraw
    /**
     * Function to withdraw amount from ATM's balance.
     * Returns true if withdrawal was successfull else false (in case ATM's balance is insufficient)
     */
    public boolean withdrawal(int amount) {
        if (balance < amount) {
            return false;
        } else {
            balance = balance - amount;
            return true;
        }
    }
    
    public int showBalance() {
        return balance;
    }
}
