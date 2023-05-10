package com.example.quanlyhangkhong.exception;

import org.springframework.http.HttpStatus;

public class DemoException {
    private static final String NHANVIEN_NOT_FOUND_MSG_KEY = "NhanVienNotExisted";
    private static final String NHANVIEN_NOT_FOUND_MSG = "Nhanvien Not Found";
    private static final String NHANVIEN_BAD_REQUEST = "Bad Request";
    private static final String NHANVIEN_INTERNAL_ERROR = "Internal Request";
    public static ResponseException notFound(String messageKey, String message) {
        return new ResponseException(messageKey, message, HttpStatus.NOT_FOUND);
    }

    public static ResponseException badRequest(String messageKey, String message) {
        return new ResponseException(messageKey, message, HttpStatus.BAD_REQUEST);
    }

    public static ResponseException internalServerError(String messageKey, String message) {
        return new ResponseException(messageKey, message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static ResponseException DepartmentNotFound() {
        return notFound(NHANVIEN_NOT_FOUND_MSG_KEY, NHANVIEN_NOT_FOUND_MSG);
    }

    public static ResponseException DepartmentBadRequest(String messageKey, String message) {
        return badRequest(NHANVIEN_NOT_FOUND_MSG_KEY, NHANVIEN_BAD_REQUEST);
    }

    public static ResponseException DepartmentInternalServerError(String messageKey, String message) {
        return internalServerError(NHANVIEN_NOT_FOUND_MSG_KEY, NHANVIEN_INTERNAL_ERROR);
    }
}
