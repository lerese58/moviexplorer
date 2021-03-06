package app.entities;

public class Review {

    private final Long authorID;
    private String text;
    private final Long filmID;
    private int likes;
    private int dislikes;
    private int rate;

    public Review(Long authorID, String text, Long filmID, int rate) {
        this.authorID = authorID;
        this.text = text;
        this.filmID = filmID;
        this.likes = 0;
        this.dislikes = 0;
        this.rate = rate;
    }

    public Long getAuthorID() {
        return authorID;
    }

    public String getText() {
        return text;
    }

    public Long getFilmID() {
        return filmID;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public int getRate() {
        return rate;
    }

    public void likeThis() {
        likes++;
    }

    public void dislikeThis() {
        dislikes++;
    }
}
