package withoutsync;

class BankAccount {
    int bal=10000;
    public void withDraw(int amount) {
        if(amount<=bal)
        {
            System.out.println(Thread.currentThread().getName()+" is going to withdraw Rs."+amount+" total balance "+bal);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("interrupted error");
            }
            bal=bal-amount;
            System.out.println(Thread.currentThread().getName()+" completed withdraw remaining balance is :Rs."+bal);
            System.out.println();
        }
        else
        {
            System.out.println(Thread.currentThread().getName()+" you do not have enough money");
        }
    }
}
class person extends Thread
{
    BankAccount account;
    person(String name,BankAccount account)
    {
        super(name);
        this.account=account;
    }

    @Override
    public void run() {
        account.withDraw(5000);
    }
}
public class WithOutSyncDemo
{
    static void main() {
        BankAccount account=new BankAccount();

        person pati=new person("pati",account);
        person patni=new person("patni",account);
        person child=new person("child",account);

        pati.start();
        patni.start();
        child.start();
    }
}
