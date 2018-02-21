/**
 * Created by sushilmainali on 20/02/2018.
 */
public  enum AnimalType {

    DOMESTIC(1),
    WILDTYPE(2);

    private final Integer animalTypeCode;

    private AnimalType(int type)
    {
        this.animalTypeCode = type;
    }

    public Integer getAnimalTypeCode()
    {
        return this.animalTypeCode;
    }
}
