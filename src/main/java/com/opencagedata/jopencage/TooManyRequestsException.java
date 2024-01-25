package com.opencagedata.jopencage;
/**
 * HttpTooManyRequestException
 *
 * @author Arnaud
 * @since 3.0
 */

public class TooManyRequestsException extends JOpenCageException {
    /**
     * Creates a new HttpTooManyRequestException with a <tt>null</tt> detail message.
     */
    public TooManyRequestsException() {
        super();
    }

    /**
     * Creates a new HttpTooManyRequestException with the specified detail message.
     *
     * @param message The error message
     */
    public TooManyRequestsException(String message) {
        super(message);
    }
}
