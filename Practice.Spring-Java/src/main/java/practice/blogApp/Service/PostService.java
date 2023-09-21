package practice.blogApp.Service;

import practice.blogApp.Dto.PostEO;

public interface PostService {

    public PostEO addPost();

    public PostEO deletePost(String Title);

}
