import java.util.Date;

/**
 * Created by sushilmainali on 20/02/2018.
 */
public class MountainGoat extends Goat {

    private Date dateOfBirth;

    public MountainGoat(Date dob)
    {
        super();
        this.dateOfBirth = dob;
    }

    @Override
    public AnimalType getAnimalType() {
        return AnimalType.WILDTYPE;
    }

    @Override
    public Date getDateOfBirth() {
        return null;
    }
}
