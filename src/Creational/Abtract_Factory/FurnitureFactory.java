package Creational.Abtract_Factory;


import java.nio.file.attribute.UserPrincipalNotFoundException;

import static Creational.Abtract_Factory.MaterialType.Plastic;

public class FurnitureFactory {
    public FurnitureFactory() {

    }
    public static FurnitureAbstractFactory getInstance(MaterialType materialType) throws UserPrincipalNotFoundException {
        switch (materialType){
            case Plastic -> {
                return new PlasticFactory();
            }
            case Wood -> {
                return new WoodFactory();
            }
            case Polymer -> {
                return new PolymerFactory();
            }
            default -> {
                throw new UserPrincipalNotFoundException("Unsupported Yet");
            }
        }
    }
}
