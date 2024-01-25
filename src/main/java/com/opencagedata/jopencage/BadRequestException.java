package com.opencagedata.jopencage;
/**
 * BadRequestException
 *
 * @author Arnaud
 * @since 3.0
 */

public class BadRequestException extends JOpenCageException {
    /**
     * Creates a new BadRequestException with a <tt>null</tt> detail message.
     */
    public BadRequestException() {
        super();
    }

    /**
     * Creates a new BadRequestException with the specified detail message.
     *
     * @param message The error message
     */
    public BadRequestException(String message) {
        super(message);
    }
}
