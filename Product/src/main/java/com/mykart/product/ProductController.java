package com.mykart.product;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("v1/getProduct/{id}")
    public ResponseEntity<String> getProductById(@PathVariable("id") String id){
        return ResponseEntity.ok("Product is found");
    }
}
