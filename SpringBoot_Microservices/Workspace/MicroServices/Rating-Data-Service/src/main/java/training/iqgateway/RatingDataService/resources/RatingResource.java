package training.iqgateway.RatingDataService.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import training.iqgateway.RatingDataService.model.Rating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {
	
	@RequestMapping("/{userId}")
	public Rating getRating(@PathVariable("userId")String userId)
{
	return new Rating(userId, 4);
}

}
