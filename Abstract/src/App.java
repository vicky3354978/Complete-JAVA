public class App {
    static void main() {
       // Payment p=new Payment();
        //because abstract method ka object na hi ban ta
        Payment p1=new CardPayment();
        p1.invoice();
        p1.pay();

        Payment p2=new InternetBanking();
        p2.invoice();
        p2.pay();
    }
}
