package training.iqgateway.MovieInfoService.resources;




import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import training.iqgateway.MovieInfoService.model.Movie;
 

@RestController
@RequestMapping("/movies")
public class MovieResource {

 

     @RequestMapping("/{movieId}")
        public Movie getInfo(@PathVariable("movieId") String movieId){

 

            return new Movie(movieId, "KGF Chapter-1");
        }
}