package com.example.demo.dto;

import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class TodoDTO {
    @NotEmpty
    private String title;
    private String detail;
}
