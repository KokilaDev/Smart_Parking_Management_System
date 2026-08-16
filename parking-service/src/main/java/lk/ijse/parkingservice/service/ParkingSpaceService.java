package lk.ijse.parkingservice.service;

import lk.ijse.parkingservice.dtos.*;
import lk.ijse.parkingservice.entity.ParkingSpaceStatus;

import java.util.List;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/17/2026 12:49 AM
 * Project: SPMS
 * --------------------------------------------
 */

public interface ParkingSpaceService {

    ParkingSpaceResponse createParkingSpace(ParkingSpaceCreateRequest request);

    ParkingSpaceResponse getParkingSpaceById(Long id);

    ParkingSpaceResponse getParkingSpaceByNumber(String spaceNumber);

    List<ParkingSpaceResponse> getAllParkingSpaces();

    List<ParkingSpaceResponse> searchParkingSpaces(String city, String zone, ParkingSpaceStatus status, Long ownerId);

    ParkingSpaceResponse updateParkingSpace(Long id, ParkingSpaceUpdateRequest request);

    void deleteParkingSpace(Long id);

    ReservationResponse reserveParkingSpace(Long id, ReserveSpaceRequest request);

    ParkingSpaceResponse releaseParkingSpace(Long id, ReleaseSpaceRequest request);

    ParkingSpaceResponse markOccupied(Long id, OccupySpaceRequest request);

    ParkingSpaceResponse markAvailable(Long id, VacateSpaceRequest request);

    ParkingSpaceResponse updateStatus(Long id, StatusUpdateRequest request);

    ParkingSpaceResponse processIoTSensorUpdate(IoTSensorUpdateRequest request);

    List<ReservationResponse> getReservationsBySpaceId(Long spaceId);

    List<ReservationResponse> getReservationsByUserId(Long userId);
}