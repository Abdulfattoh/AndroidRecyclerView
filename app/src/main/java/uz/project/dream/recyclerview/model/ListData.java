package uz.project.dream.recyclerview.model;

/**
 * Created by Abdufattokh on 9/3/2018.
 */

public class ListData {

    private String name;
    private String description;

    public ListData(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
