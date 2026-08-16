package lk.ijse.vehicleservice.service;

import lk.ijse.vehicleservice.dtos.VehicleCreateRequest;
import lk.ijse.vehicleservice.dtos.VehicleResponse;
import lk.ijse.vehicleservice.dtos.VehicleUpdateRequest;
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
    VehicleResponse saveVehicle(VehicleCreateRequest request);
    VehicleResponse updateVehicle(Long id, VehicleUpdateRequest request);
    void deleteVehicle(Long id);
    VehicleResponse getVehicle(Long id);
    List<VehicleResponse> getAllVehicles();
    List<VehicleResponse> getVehiclesByOwner(Long ownerId);
}
