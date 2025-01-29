package com.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pms.model.ProductDTO;
import com.pms.service.IProductService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/products") // Base URL for APIs
@Tag(name = "Product Controller", description = "APIs for managing products")
public class ProductRestController {

    @Autowired
    private IProductService service;

    @Operation(summary = "Fetch all products", description = "Fetches the details of all products from the database")
    @GetMapping(produces = "application/json")
    public ResponseEntity<List<ProductDTO>> findAllProducts() {
        List<ProductDTO> productDTOList = service.searchAllProducts();
        return ResponseEntity.ok(productDTOList);
    }

    @Operation(summary = "Fetch product by ID", description = "Fetches the details of a specific product from the database by given ID")
    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<ProductDTO> findProductById(@PathVariable Integer id) {
        ProductDTO product = service.searchProductById(id);
        return (product != null) ? ResponseEntity.ok(product) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @Operation(summary = "Fetch products by manufacturer", description = "Fetches products from the database by manufacturer")
    @GetMapping(value = "/manufacturer/{manufacturer}", produces = "application/json")
    public ResponseEntity<List<ProductDTO>> findProductsByManufacturer(@PathVariable String manufacturer) {
        List<ProductDTO> products = service.searchProductByManufacturer(manufacturer);
        return (!products.isEmpty()) ? ResponseEntity.ok(products) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @Operation(summary = "Add a new product", description = "Adds a new product to the database")
    @PostMapping(consumes = "application/json")
    public ResponseEntity<String> addProduct(@RequestBody ProductDTO productDTO) {
        String response = service.addProduct(productDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @Operation(summary = "Update a product", description = "Updates an existing product in the database")
    @PutMapping(consumes = "application/json")
    public ResponseEntity<String> updateProduct(@RequestBody ProductDTO productDTO) {
        ProductDTO updatedProduct = service.updateProduct(productDTO);
        return (updatedProduct != null) 
            ? ResponseEntity.ok("Product updated successfully") 
            : ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product doesn't exist");
    }

    @Operation(summary = "Delete a product", description = "Deletes a product from the database by ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProductById(@PathVariable Integer id) {
        String response = service.DeleteProductById(id);
        return response.equals("Product deleted") 
            ? ResponseEntity.ok(response) 
            : ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");
    }
}
