package home_task_23_11_14.task_2.book;
/*. В противном случае создайте неизменяемый класс Book,
описывающий книгу с атрибутами, такими как название, автор и год издания.*/
public record Book(String title, String author, int publicationYear) {

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
