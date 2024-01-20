package com.opencagedata.jopencage;
/**
 * HttpUpgradeRequiredException
 *
 * @author Arnaud
 * @since 3.0
 */

public class HttpUpgradeRequiredException extends HttpException {
    /**
     * Creates a new HttpUpgradeRequiredException with a <tt>null</tt> detail message.
     */
    public HttpUpgradeRequiredException() {
        super();
    }

    /**
     * Creates a new HttpUpgradeRequiredException with the specified detail message.
     *
     * @param message The error message
     */
    public HttpUpgradeRequiredException(String message) {
        super(message);
    }
}
