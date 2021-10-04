package data;

/**
 * TODO: Change class description
 *
 * @author dmitriy.lakhno (dlakhno)
 * @since 0.18.0
 */
public class Bike {

    private String name;
    private String model;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
