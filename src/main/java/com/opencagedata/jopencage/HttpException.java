package com.opencagedata.jopencage;

/**
 * HttpException
 *
 * @author Arnaud
 * @since 3.0
 */
public abstract class HttpException extends Exception {

    public HttpException() {
        super();
    }
    public HttpException(String message) {
        super(message);
    }
}
