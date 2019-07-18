package pyh.entry;


public class FilmPo {

    private String title;
    private String description;
    private Integer language_id;
    private Double rental_rate;
    private Double replacement_cost;
    private String last_update;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }

    public Double getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(Double rental_rate) {
        this.rental_rate = rental_rate;
    }

    public Double getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(Double replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }

    @Override
    public String toString() {
        return "FilmPo{" +
                "title='" + title + '\'' +
                ", language_id=" + language_id +
                ", rental_rate=" + rental_rate +
                ", replacement_cost=" + replacement_cost +
                ", last_update='" + last_update + '\'' +
                '}';
    }
}
