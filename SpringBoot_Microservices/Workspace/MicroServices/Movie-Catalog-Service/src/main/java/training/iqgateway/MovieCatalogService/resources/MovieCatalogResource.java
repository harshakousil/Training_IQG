package training.iqgateway.MovieCatalogService.resources;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import training.iqgateway.MovieCatalogService.models.CatalogItem;
import training.iqgateway.MovieCatalogService.models.Movie;
import training.iqgateway.MovieCatalogService.models.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	
	@Autowired
	 RestTemplate restTemplate;
	
          @RequestMapping("/{id}")
         public List<CatalogItem> getCatalog(@PathVariable ("id")String id){
        	  ResponseEntity<List<Rating>> response = restTemplate.exchange(

        	                      "http://Rating-data-service/ratingsdata/" + id,

        	                      HttpMethod.GET,

        	                      null,

        	                      new ParameterizedTypeReference<List<Rating>>() {}

        	                  );


        	   List<Rating> ratings = response.getBody();
        	 return ratings.stream().map(rating -> 
        	 { Movie movie=restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieId(), Movie.class);
        		return new CatalogItem(movie.getName(), "Awesome",rating.getRating());
        		 })
        			 .collect(Collectors.toList());  

         }
}
	