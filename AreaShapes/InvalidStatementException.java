// Custom exception class

import java.lang.Exception;

public class InvalidStatementException extends Exception {
    public InvalidStatementException(String message) {
        // Calling the constructor of parent Exception  
        super(message); 
    }
}