package lk.ijse.parkingservice.exception;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/17/2026 12:44 AM
 * Project: SPMS
 * --------------------------------------------
 */
public class SpaceUnavailableException extends RuntimeException {
    public SpaceUnavailableException(String message) {
        super(message);
    }
}
