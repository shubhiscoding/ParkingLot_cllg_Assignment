public class Electric implements Service {

    @Override
    public int getPricePerMinute() {
        return 5;
    }

    @Override
    public String getName() {
        return "Electric Charging";
    }
}
