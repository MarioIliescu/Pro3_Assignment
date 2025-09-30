package dk.via.group4.domain;

public interface ProductListInterface
{
  Product[] getAllProducts();
  Product findProduct(long productId);
  Product[] findProductsForAnimal(String regNo);
}
