/**
 * Created by sushilmainali on 20/02/2018.
 * http://webdev.jhuep.com/~jcs/ejava-javaee/coursedocs/605-784-site/docs/content/html/jpa-entityex-entity.html
 */
public abstract class Goat  implements Animal{

    public AnimalType goatType;
    public Integer weight;
    public Integer height;
    public Integer age;
    public String name;




    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getColor() {
        return null;
    }

    public boolean isHerbivorus() {
        return false;
    }

    public boolean isCarnivorus() {
        return false;
    }

    public abstract AnimalType getAnimalType();
}
