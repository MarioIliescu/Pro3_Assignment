package dk.via.group4.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryAnimalList implements AnimalListInterface {
  private final List<Animal> animals = new ArrayList<>();

  public InMemoryAnimalList() {

  }

  @Override
  public Animal[] getAllAnimals() {
    return animals.toArray(new Animal[0]);
  }

  @Override
  public Animal findAnimal(String regNo) {
    return animals.stream()
        .filter(a -> a.getRegNo().equals(regNo))
        .findFirst()
        .orElse(null);
  }

  @Override
  public Animal[] findAnimalsForProduct(long productId) {

    return animals.toArray(new Animal[0]);
  }
}

