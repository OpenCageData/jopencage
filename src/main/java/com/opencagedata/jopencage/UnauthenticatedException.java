package com.opencagedata.jopencage;

/**
 * UnauthenticatedException
 *
 * @author Arnaud
 * @since 3.0
 */

public class UnauthenticatedException extends JOpenCageException {
    /**
     * Creates a new UnauthenticatedException with a <code>null</code> detail
     * message.
     */
    public UnauthenticatedException() {
        super();
    }

    /**
     * Creates a new UnauthenticatedException with the specified detail message.
     *
     * @param message The error message
     */
    public UnauthenticatedException(String message) {
        super(message);
    }
}
