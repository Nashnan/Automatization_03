package exceptions;

public class MessageExceptions extends Error {

    public MessageExceptions (String message, Throwable throwable){
        super(message,throwable);
    }

}
