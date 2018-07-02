package itk.myoganugraha.aplikasisederhana;

public class DataModel {
    private int thumbnail, userIcon;
    private String username, news;

    public DataModel(int thumbnail, int userIcon, String username, String news) {
        this.thumbnail = thumbnail;
        this.userIcon = userIcon;
        this.username = username;
        this.news = news;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public int getUserIcon() {
        return userIcon;
    }

    public String getUsername() {
        return username;
    }

    public String getNews() {
        return news;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setUserIcon(int userIcon) {
        this.userIcon = userIcon;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
