package com.opencagedata.jopencage;
/**
 * HttpNotFoundException
 *
 * @author Arnaud
 * @since 3.0
 */

public class HttpNotFoundException extends JOpenCageException {
    /**
     * Creates a new HttpNotFoundException with a <tt>null</tt> detail message.
     */
    public HttpNotFoundException() {
        super();
    }

    /**
     * Creates a new HttpNotFoundException with the specified detail message.
     *
     * @param message The error message
     */
    public HttpNotFoundException(String message) {
        super(message);
    }
}
