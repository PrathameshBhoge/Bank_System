package com.bootcoding.Exception;

public class InvalidDateException extends Throwable {
    public InvalidDateException(String iNvalid_date_entered) {
        super(iNvalid_date_entered);
    }
}
