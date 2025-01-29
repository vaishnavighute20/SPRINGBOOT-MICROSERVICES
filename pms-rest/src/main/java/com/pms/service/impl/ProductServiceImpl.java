package com.pms.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.entity.Product;
import com.pms.model.ProductDTO;
import com.pms.repository.ProductRepository;
import com.pms.service.IProductService;

import jakarta.transaction.Transactional;

@Service
public class ProductServiceImpl implements IProductService {
    
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDTO> searchAllProducts() {
        List<Product> productList = productRepository.findAll();
        List<ProductDTO> productDTOList = new ArrayList<>();
        
        productList.forEach(product -> {
            ProductDTO productDTO = new ProductDTO();
            BeanUtils.copyProperties(product, productDTO);
            productDTOList.add(productDTO);
        });

        return productDTOList;
    }

    @Override
    public ProductDTO searchProductById(Integer id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            ProductDTO productDTO = new ProductDTO();
            BeanUtils.copyProperties(optionalProduct.get(), productDTO);
            return productDTO;
        }
        return null; // Or throw an exception (NotFound)
    }

    @Override
    public List<ProductDTO> searchProductByManufacturer(String manufacturer) {
        List<Product> productList = productRepository.findByManufacturer(manufacturer);
        List<ProductDTO> productDTOList = new ArrayList<>();

        productList.forEach(product -> {
            ProductDTO productDTO = new ProductDTO();
            BeanUtils.copyProperties(product, productDTO);
            productDTOList.add(productDTO);
        });

        return productDTOList;
    }

    @Override
    @Transactional
    public String addProduct(ProductDTO productDTO) {
        Product product = new Product();
        BeanUtils.copyProperties(productDTO, product);
        productRepository.save(product);
        return "Product added successfully!";
    }

    @Override
    @Transactional
    public ProductDTO updateProduct(ProductDTO productDTO) {
        Optional<Product> optionalProduct = productRepository.findById(productDTO.getProductId());
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            BeanUtils.copyProperties(productDTO, product);
            productRepository.save(product);
            return productDTO;
        }
        return null;
    }

    @Override
    @Transactional
    public String DeleteProductById(Integer id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return "Product deleted successfully!";
        }
        return "Product not found!";
    }
}
