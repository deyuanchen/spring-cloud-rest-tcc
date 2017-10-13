package com.github.prontera.exception;

/**
 * @author 陈德元
 */
public class PartialConfirmException extends RuntimeException {

    private static final long serialVersionUID = -736692887311988416L;

    public PartialConfirmException(String message) {
        super(message);
    }

    public PartialConfirmException(String message, Throwable cause) {
        super(message, cause);
    }

    public PartialConfirmException(Throwable cause) {
        super(cause);
    }

    protected PartialConfirmException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
