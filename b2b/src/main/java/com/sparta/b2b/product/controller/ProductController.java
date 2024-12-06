package com.sparta.b2b.product.controller;

import com.sparta.b2b.product.dto.response.ProductResponse;
import com.sparta.b2b.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("")
public class ProductController {

	private final ProductService productService;

	public ResponseEntity<ProductResponse> createProduct() {

		return ResponseEntity
			.status(HttpStatus.CREATED)
			.body(productService.createProduct());
	}

}
