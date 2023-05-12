package technifutur.Rental_Management.exception;

public class RessourceNotFoundException extends RuntimeException{
    public RessourceNotFoundException(){
        super("the requested resource was not found");
    }

    public RessourceNotFoundException(Throwable cause){
        super("the requested resource was not found",cause);
    }
}
