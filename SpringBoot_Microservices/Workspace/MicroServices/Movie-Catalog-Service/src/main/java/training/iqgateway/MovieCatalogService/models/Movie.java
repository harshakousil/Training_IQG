package training.iqgateway.MovieCatalogService.models;

public class Movie {

    private String Id;

    private String name;

 

    public String getId() {
        return Id;
    }

 

    public void setId(String id) {
        Id = id;
    }

 

    public String getName() {
        return name;
    }

 

    public void setName(String name) {
        this.name = name;
    }

 

    public Movie() {
        super();
        // TODO Auto-generated constructor stub
    }

 

    public Movie(String id, String name) {
        super();
        Id = id;
        this.name = name;
    }


 

}
