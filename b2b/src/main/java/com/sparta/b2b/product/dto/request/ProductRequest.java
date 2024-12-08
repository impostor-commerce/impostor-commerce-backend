package com.sparta.b2b.product.dto.request;

import com.sparta.impostor.commerce.backend.domain.product.enums.Category;
import com.sparta.impostor.commerce.backend.domain.product.enums.ProductStatus;

public record ProductRequest(
	String name,
	String description,
	int stockQuantity,
	int price,
	Category category,
	Category.SubCategory subCategory

) {
}
