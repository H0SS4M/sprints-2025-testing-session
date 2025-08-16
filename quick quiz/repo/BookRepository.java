public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthor(String author);
    Optional<Book> findByIsbn(String isbn);
}