package com.sparta.b2b.product.dto.response;

import com.sparta.impostor.commerce.backend.domain.product.entity.Product;
import com.sparta.impostor.commerce.backend.domain.product.enums.Category;
import com.sparta.impostor.commerce.backend.domain.product.enums.ProductStatus;

import java.time.LocalDateTime;

public record ProductSearchResponse(
	Long id,
	String name,
	String description,
	int stockQuantity,
	int price,
	ProductStatus status,
	Category category,
	Category.SubCategory subCategory,
	LocalDateTime createdAt,
	LocalDateTime modifiedAt
) {
	public static ProductSearchResponse from(Product save) {
		return new ProductSearchResponse(
			save.getId(),
			save.getName(),
			save.getDescription(),
			save.getStockQuantity(),
			save.getPrice(),
			save.getStatus(),
			save.getCategory(),
			save.getSubCategory(),
			save.getCreatedAt(),
			save.getModifiedAt()
		);
	}
}
