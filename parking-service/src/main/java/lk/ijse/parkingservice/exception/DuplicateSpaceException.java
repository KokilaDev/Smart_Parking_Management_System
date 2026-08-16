package lk.ijse.parkingservice.exception;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/17/2026 12:42 AM
 * Project: SPMS
 * --------------------------------------------
 */
public class DuplicateSpaceException extends RuntimeException{
    public DuplicateSpaceException(String message){
        super(message);
    }
}
