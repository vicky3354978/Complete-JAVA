public class Payment implements FullAbstraction {
    @Override
    public void pay() {
        System.out.println("payment is done ");
    }

    @Override
    public void invoice() {
        System.out.println("Bill is generated ");
    }
}
