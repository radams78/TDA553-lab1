public class VehicleModelFactory {
    

    public static VehicleModel makeDefaultController() {
        VehicleModel model = new VehicleModel();
        model.addVehicle(VehicleFactory.makeSaab95());
        model.addVehicle(VehicleFactory.makeVolvo());
        model.addVehicle(VehicleFactory.makeScania());
        return model;
    }

}