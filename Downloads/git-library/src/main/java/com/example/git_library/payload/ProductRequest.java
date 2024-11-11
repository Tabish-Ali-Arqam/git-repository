package com.example.git_library.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {
    private int id;
    private String name;
    private String description;
    private Double price;
    private Integer quantity;
}
