package dk.via.group4.server;

/*
 * 01.10.2025 Original version
 */
import dk.via.group4.domain.Animal;
import dk.via.group4.domain.AnimalListInterface;
import dk.via.group4.domain.Product;
import dk.via.group4.domain.ProductListInterface;
import dk.via.group4.dto.animal.AnimalRegResponse;

import java.util.ArrayList;

public class SlaughterhouseServiceImpl
{
  private final AnimalListInterface animalList;
  private final ProductListInterface productList;

  public SlaughterhouseServiceImpl(AnimalListInterface animals, ProductListInterface products)
  {
    this.animalList = animals;
    this.productList = products;
  }

  @Override
  public void getAnimalsForProduct(ProductIdRequest request,
      StreamObserver<AnimalRegResponse> responseObserver) {
    Animal[] animals = animalList.findAnimalsForProduct(request.getProductId());

    AnimalRegResponse response = DTOFactory.createAnimalRegResponse(animals);

    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void getProductsForAnimal(AnimalRegRequest request,
      StreamObserver<ProductsResponse> responseObserver) {
    // Domain call
    ArrayList<Product> products = productList.findProductsForAnimal(request.getRegistrationNumber());

    // Map domain → DTO
    ProductsResponse response = DTOFactory.createProductsResponse(products);

    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}

