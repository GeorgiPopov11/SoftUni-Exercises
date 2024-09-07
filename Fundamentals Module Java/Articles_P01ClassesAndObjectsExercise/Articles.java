package Articles_P01ClassesAndObjectsExercise;

public class Articles {
    private String title;
    private String content;
    private String author;

    public Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }
    public String getContent() {
        return this.content;
    }
    public String getAuthor() {
        return this.author;
    }

    public void setTitle (String newTitle) {
        this.title = newTitle;
    }
    public void setContent (String newContent) {
        this.content = newContent;
    }
    public void setAuthor (String newAuthor) {
        this.author = newAuthor;
    }
    @Override
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }

}
