public class Book {
    private String name;
    private String pageNum;
    private String authorName;
    private String publishDate;

    public Book(String name, String pageNum, String authorName, String publishDate) {
        this.name = name;
        this.pageNum = pageNum;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String toString() {
        return String.format("Name: %s, Author: %s, Page Number: %s, Publish Date: %s",
                this.name, this.authorName, this.pageNum, this.publishDate);
    }
}
