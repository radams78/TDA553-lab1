public class VehicleModelFactory {
    

    public static VehicleModel makeDefaultModel() {
        VehicleModel model = new VehicleModel();
        model.addVehicle(VehicleFactory.makeSaab95());
        model.addVehicle(VehicleFactory.makeScania());
        model.addVehicle(VehicleFactory.makeVolvo());
        return model;
    }

}
