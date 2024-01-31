package com.opencagedata.jopencage;
/**
 * ForbiddenException
 *
 * @author Arnaud
 * @since 3.0
 */

public class ForbiddenException extends JOpenCageException {
    /**
     * Creates a new ForbiddenException with a <tt>null</tt> detail message.
     */
    public ForbiddenException() {
        super();
    }

    /**
     * Creates a new ForbiddenException with the specified detail message.
     *
     * @param message The error message
     */
    public ForbiddenException(String message) {
        super(message);
    }
}
