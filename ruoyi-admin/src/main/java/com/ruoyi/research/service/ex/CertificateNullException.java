package com.ruoyi.research.service.ex;

public class CertificateNullException extends ServiceException {

    private static final long serialVersionUID = 3599392878886461916L;

    public CertificateNullException() {}

    public CertificateNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public CertificateNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public CertificateNullException(String message) {
        super(message);
    }

    public CertificateNullException(Throwable cause) {
        super(cause);
    }

}
