package com.farouk.task2p.service;

import com.farouk.task2p.api.request.ProductRequest;
import com.farouk.task2p.api.request.UpdateProductRequest;
import com.farouk.task2p.api.response.ProductResponse;
import com.farouk.task2p.domain.Product;
import com.farouk.task2p.repository.ProductRepository;
import com.farouk.task2p.support.ProductMapper;
import com.farouk.task2p.support.exception.ProductNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    public ProductService(ProductRepository repository, ProductMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ProductResponse create(ProductRequest request) {
        Product product = mapper.toProduct(request);
        Product savedProduct = repository.save(product);
        return mapper.toResponse(savedProduct);
    }

    public ProductResponse findById(Long id) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
        return mapper.toResponse(product);
    }

    public List<ProductResponse> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    public List<ProductResponse> searchByName(String name) {
        return repository.findByNameContainingIgnoreCase(name)
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    public ProductResponse update(Long id, UpdateProductRequest request) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));

        mapper.updateProduct(product, request);
        Product updatedProduct = repository.save(product);
        return mapper.toResponse(updatedProduct);
    }

    public void delete(Long id) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
        repository.delete(product);
    }
}
