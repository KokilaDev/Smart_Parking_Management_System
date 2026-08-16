package lk.ijse.vehicleservice.service;

import lk.ijse.vehicleservice.dtos.*;

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

    VehicleResponse registerVehicle(VehicleRegisterRequest request);

    VehicleResponse getVehicleById(Long id);

    VehicleResponse getVehicleByRegistrationNumber(String registrationNumber);

    List<VehicleResponse> getAllVehicles();

    List<VehicleResponse> getVehiclesByUserId(Long userId);

    VehicleResponse updateVehicle(Long id, VehicleUpdateRequest request);

    void deleteVehicle(Long id);

    VehicleLogResponse simulateEntry(VehicleEntryRequest request);

    VehicleLogResponse simulateExit(VehicleExitRequest request);

    List<VehicleLogResponse> getLogsByVehicleId(Long vehicleId);

    List<VehicleLogResponse> getLogsByUserId(Long userId);

    List<VehicleLogResponse> getAllLogs();
}