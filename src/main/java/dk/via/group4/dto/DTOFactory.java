package dk.via.group4.dto;

import java.util.ArrayList;


import dk.via.group4.domain.*;

import java.util.ArrayList;
import java.util.List;

public class DTOFactory {


  public static DTOAnimal createDTOAnimal(Animal animal) {
    return DTOAnimal.newBuilder()
        .setRegistrationNumber(animal.getRegistrationNumber())
        .setWeight(animal.getWeight())
        .build();
  }

  public static Animal createAnimal(DTOAnimal dto) {
    return new Animal(dto.getRegistrationNumber(), dto.getWeight());
  }

  public static DTOProduct createDTOProduct(Product product) {
    return DTOProduct.newBuilder()
        .setId(product.getId())
        .setName(product.getName())
        .setDescription(product.getDescription())
        .build();
  }

  public static Product createProduct(DTOProduct dto) {
    return new Product(dto.getId(), dto.getName(), dto.getDescription());
  }

  public static ProductIdRequest createProductIdRequest(long productId) {
    return ProductIdRequest.newBuilder()
        .setProductId(productId)
        .build();
  }

  public static AnimalRegResponse createAnimalRegResponse(Animal[] animals) {
    List<String> regNumbers = new ArrayList<>();
    for (Animal a : animals) {
      regNumbers.add(a.getRegistrationNumber());
    }
    return AnimalRegResponse.newBuilder().addAllRegistrationNumbers(regNumbers).build();
  }

  public static AnimalRegRequest createAnimalRegRequest(String regNo) {
    return AnimalRegRequest.newBuilder()
        .setRegistrationNumber(regNo)
        .build();
  }

  public static ProductsResponse createProductsResponse(Product[] products) {
    List<ProductInfo> list = new ArrayList<>();
    for (Product p : products) {
      list.add(ProductInfo.newBuilder()
          .setProductId(p.getId())
          .setName(p.getName())
          .setDescription(p.getDescription())
          .build());
    }
    return ProductsResponse.newBuilder().addAllProducts(list).build();
  }

  public static Animal[] createAnimals(AnimalRegResponse r) {
    Animal[] res = new Animal[r.getRegistrationNumbersCount()];
    for (int i = 0; i < res.length; ++i) {
      String reg = r.getRegistrationNumbers(i);
      res[i] = new Animal(reg, 0.0); // weight unknown here
    }
    return res;
  }

  public static Product[] createProducts(ProductsResponse r) {
    Product[] res = new Product[r.getProductsCount()];
    for (int i = 0; i < res.length; ++i) {
      ProductInfo dto = r.getProducts(i);
      res[i] = new Product(dto.getProductId(), dto.getName(), dto.getDescription());
    }
    return res;
  }
}
