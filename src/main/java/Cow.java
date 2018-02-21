import java.util.Date;

/**
 * Created by sushilmainali on 20/02/2018.
 */
public class Cow implements Animal {

    private String name;

    private String color;

    private Date dob;


    public Cow(String givenName, Date dob)
    {
        this.name = givenName;
        this.dob = dob;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isHerbivorus() {
        return true;
    }

    public boolean isCarnivorus() {
        return false;
    }

    @Override
    public Date getDateOfBirth() {
        return this.dob;
    }
}
