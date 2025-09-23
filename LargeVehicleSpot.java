public class LargeVehicleSpot extends ParkingSpot {

    LargeVehicleSpot(int id) {
        super(id, VehicleType.LARGE_VEHICLE);
    }

    @Override
    int getPricePerMinute() {
        return 3;
    }
}
