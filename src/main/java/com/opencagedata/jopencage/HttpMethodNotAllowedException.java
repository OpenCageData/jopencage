package com.opencagedata.jopencage;
/**
 * HttpMethodNotAllowedException
 *
 * @author Arnaud
 * @since 3.0
 */

public class HttpMethodNotAllowedException extends JOpenCageException {
    /**
     * Creates a new HttpMethodNotAllowedException with a <tt>null</tt> detail message.
     */
    public HttpMethodNotAllowedException() {
        super();
    }

    /**
     * Creates a new HttpMethodNotAllowedException with the specified detail message.
     *
     * @param message The error message
     */
    public HttpMethodNotAllowedException(String message) {
        super(message);
    }
}
