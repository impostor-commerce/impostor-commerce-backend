package com.sparta.b2c.product.dto.response;


import com.sparta.impostor.commerce.backend.domain.product.entity.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public record PageProductResponse(
        List<ProductResponse> contents,
        int page,
        int size,
        int totalPage
) {
    public static PageProductResponse from(Page<Product> productPage) {
        return new PageProductResponse(
                productPage.getContent().stream().map(ProductResponse::from).toList(),
                productPage.getNumber() + 1,
                productPage.getSize(),
                productPage.getTotalPages()
        );
    }
}
