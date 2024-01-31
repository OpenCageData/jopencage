package com.opencagedata.jopencage;

/**
 * TimeOutException
 *
 * @author Arnaud
 * @since 3.0
 */

public class TimeOutException extends JOpenCageException {
    /**
     * Creates a new TimeOutException with a <code>null</code> detail message.
     */
    public TimeOutException() {
        super();
    }

    /**
     * Creates a new TimeOutException with the specified detail message.
     *
     * @param message The error message
     */
    public TimeOutException(String message) {
        super(message);
    }
}
