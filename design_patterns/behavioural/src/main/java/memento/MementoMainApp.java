package memento;

public class MementoMainApp {
    public static void main(String[] args) {
        Article article = new Article(1, "My Article");
        article.setContent("ABC");    //original content
        System.out.println(article);

        // persist the article object's last successful state
        // lets save the article current state
        // created immutable memento
        Article.ArticleMemento memento = article.createMemento();

        article.setContent("123");    //changed content
        System.out.println(article);

        // restore to last saved state
        article.restore(memento);   //UNDO change
        System.out.println(article);  //original content
    }
}
