package encapsulation;

public class Test2 {
    public static void main(String[] args) {
        Account m=new Account();
        m.setAcc_no(1234670001);
        m.setName("IMRAN" );
        m.setEmail("md2bb2a2@yahoo.com");
        m.setAmount(1000);
        System.out.println(" name " + m.getName() + " account " + m.getAcc_no() + " email "  +m.getEmail() + " amount " + m.getAmount());
    }
}
