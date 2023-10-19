package memento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Article {
    private long id;
    private String title;
    private String content;

    public Article(long id, String title) {
        super();
        this.id = id;
        this.title = title;
    }

    public Article(long id, String title, String content) {
        super();
        this.id = id;
        this.title = title;
        this.content = content;
    }

    //Setters and getters

    public ArticleMemento createMemento() {
        ArticleMemento m = new ArticleMemento(id, title, content);
        return m;
    }

    public void restore(ArticleMemento m) {
        this.id = m.getId();
        this.title = m.getTitle();
        this.content = m.getContent();
    }

    @Override
    public String toString() {
        return "Article [id=" + id + ", title=" + title + ", content=" + content + "]";
    }

    static final class ArticleMemento {
        private final long id;
        private final String title;
        private final String content;

        public ArticleMemento(long id, String title, String content) {
            super();
            this.id = id;
            this.title = title;
            this.content = content;
        }

        public long getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }
    }
}