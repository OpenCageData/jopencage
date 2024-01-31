package com.opencagedata.jopencage;
/**
 * QuotaExceededException
 *
 * @author Arnaud
 * @since 3.0
 */

public class QuotaExceededException extends JOpenCageException {
    /**
     * Creates a new QuotaExceededException with a <tt>null</tt> detail message.
     */
    public QuotaExceededException() {
        super();
    }

    /**
     * Creates a new QuotaExceededException with the specified detail message.
     *
     * @param message The error message
     */
    public QuotaExceededException(String message) {
        super(message);
    }
}
