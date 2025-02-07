package models;

public class NewArticleData {

    private String title;
    private String descriptions;
    private String body;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    private String tags;

    public NewArticleData(String title, String descriptions, String body, String tags) {
        this.title = title;
        this.descriptions = descriptions;
        this.body = body;
        this.tags = tags;
    }
}
