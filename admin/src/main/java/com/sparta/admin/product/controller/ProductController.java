package com.sparta.admin.product.controller;

import com.sparta.admin.product.dto.request.ProductRequest;
import com.sparta.admin.product.dto.response.PageProductResponse;
import com.sparta.admin.product.service.ProductService;
import com.sparta.impostor.commerce.backend.domain.product.enums.ProductStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/admin/products")
public class ProductController {

  private final ProductService productService;

  @GetMapping()
  public ResponseEntity<PageProductResponse> getProducts(
      @RequestParam(required = false) ProductStatus status,
      @RequestParam(required = false) int page,
      @RequestParam(required = false) int size,
      @RequestParam(required = false) String sortBy,
      @RequestParam(required = false) String orderBy) {

    ProductRequest reqDto = new ProductRequest(
        status, page, size, sortBy, orderBy
    );

    PageProductResponse resDto = productService.getAllProducts(reqDto);

    return ResponseEntity.status(HttpStatus.OK).body(resDto);
  }

}