package com.example.demo.exeption;

import com.example.demo.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.io.NotActiveException;

/**
 * - @RestControllerAdvice là một Annotation gắn trên Class.
 * Có tác dụng xen vào quá trình xử lý của các @RestController
 */
@RestControllerAdvice
public class ApiExceptionHandler {

    /**
     * Tất cả các exeption không được khai báo riêng sẽ xử lý ở đây
     *  => @ExceptionHandler(Exception.class)
     * - @RestControllerAdvice thường được kết hợp với @ExceptionHandler
     *  để cắt ngang quá trình xử lý của Controller, và xử lý các ngoại lệ xảy ra.
     *  - @ResponseStatus là một cách định nghĩa Http Status trả về cho người dùng khi không muốn dùng ResponseEntity
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage handleAllException(Exception e, WebRequest request) {
        e.printStackTrace();
        return new ErrorMessage(1509, e.getMessage());
    }

    /**
     * IndexOutOfBoundsException sẽ xử lý ở đây
     *  => @ExceptionHandler(IndexOutOfBoundsException.class)
     *  param có thể là IndexOutOfBoundsException hay Exception đều được
     */
    @ExceptionHandler(IndexOutOfBoundsException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorMessage handleIndexOutOfBoundsException(IndexOutOfBoundsException e, WebRequest request) {
        return new ErrorMessage(9415, "User không tồn tại");
    }

    /**
     * Có thể bắt nhiều loại exception
     */
    @ExceptionHandler({NotActiveException.class, NullPointerException.class})
    public ErrorMessage handleMultipartException(Exception e) {
        return new ErrorMessage(111, "Hehe bắt mấy lỗi liền đó");
    }
}
