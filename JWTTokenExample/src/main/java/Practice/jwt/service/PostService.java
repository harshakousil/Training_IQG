package Practice.jwt.service;

import Practice.jwt.dto.PostEO;


public interface PostService {

    public PostEO addPost();

    public PostEO deletePost(String Title);

}
