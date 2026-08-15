package lk.ijse.vehicleservice.service;

import lk.ijse.vehicleservice.entity.Vehicle;

import java.util.List;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/15/2026 6:02 PM
 * Project: SPMS
 * --------------------------------------------
 */
public interface VehicleService {
    Vehicle saveVehicle(Vehicle vehicle);
    List<Vehicle> getAllVehicles();
    Vehicle getVehicleById(Long id);
    void deleteVehicleById(Long id);
}
