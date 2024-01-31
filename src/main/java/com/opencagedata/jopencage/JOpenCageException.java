package com.opencagedata.jopencage;

/**
 * JOpenCageException
 *
 * @author Arnaud
 * @since 3.0
 */
public abstract class JOpenCageException extends Exception {

    public JOpenCageException() {
        super();
    }
    public JOpenCageException(String message) {
        super(message);
    }
    public JOpenCageException(String message, Throwable cause) {
        super(message, cause);
    }
}
