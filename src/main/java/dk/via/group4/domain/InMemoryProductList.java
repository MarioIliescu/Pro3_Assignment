package dk.via.group4.domain;

import java.util.ArrayList;
import java.util.List;

public class InMemoryProductList implements ProductListInterface {
  private final List<Product> products = new ArrayList<>();

  public InMemoryProductList() {

  }

  @Override
  public Product[] getAllProducts() {
    return products.toArray(new Product[0]);
  }

  @Override
  public Product findProduct(long productId) {
    return products.stream()
        .filter(p -> p.getId() == productId)
        .findFirst()
        .orElse(null);
  }

  @Override
  public Product[] findProductsForAnimal(String regNo) {

    return products.toArray(new Product[0]);
  }
}

