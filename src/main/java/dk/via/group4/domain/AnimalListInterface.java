package dk.via.group4.domain;

public interface AnimalListInterface
{
  Animal[] getAllAnimals();
  Animal findAnimal(String regNo);
  Animal[] findAnimalsForProduct(long productId);
}
