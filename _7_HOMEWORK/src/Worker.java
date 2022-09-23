public class Worker implements Nameable {
    String W="Worker";

    @Override
    public void name() {
        System.out.println("Название должности "+W);
    }
}
