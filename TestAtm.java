public class TestAtm
{
    public static void main(String args[]) {
        TestAtm testAtm = new TestAtm();
        testAtm.shouldReturn0ForEmptyAtm();
    }
    
    public void shouldReturn0ForEmptyAtm() {
        Atm atm = new Atm();
        int atmBalance = atm.showBalance();
        if (atmBalance == 0) {
            System.out.println("shouldReturn0ForEmptyAtm test passed");
        } else {
            System.out.println("shouldReturn0ForEmptyAtm test failed. Test returned: " + atmBalance);
        }
    }
}
