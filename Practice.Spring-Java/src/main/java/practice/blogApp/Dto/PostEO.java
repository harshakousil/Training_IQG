package practice.blogApp.Dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Document("Posts")
public class PostEO {

    @Id
    private String title;
    private String author;
    private String content;
    private String datePublished;
    private List<String> categories;
    private List<String> tags;
    private List<String> comments;

    public PostEO(String title, String author, String content, String datePublished) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.datePublished = datePublished;
        this.categories = new ArrayList<>();
        this.tags = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

public  PostEO()
{

}

    public void addCategory(String category) {
        categories.add(category);
    }

    public void addTag(String tag) {
        tags.add(tag);
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    // Getters and setters for the fields

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public List<String> getCategories() {
        return categories;
    }

    public List<String> getTags() {
        return tags;
    }

    public List<String> getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "PostEO{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", datePublished='" + datePublished + '\'' +
                ", categories=" + categories +
                ", tags=" + tags +
                ", comments=" + comments +
                '}';
    }
}
