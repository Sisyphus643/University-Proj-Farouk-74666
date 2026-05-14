package com.farouk.task2p.support;

import com.farouk.task2p.api.request.ProductRequest;
import com.farouk.task2p.api.request.UpdateProductRequest;
import com.farouk.task2p.api.response.ProductResponse;
import com.farouk.task2p.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest request) {
        Product product = new Product();
        product.setName(request.getName());
        product.setPrice(request.getPrice());
        return product;
    }

    public ProductResponse toResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName(), product.getPrice());
    }

    public void updateProduct(Product product, UpdateProductRequest request) {
        product.setName(request.getName());
        product.setPrice(request.getPrice());
    }
}
