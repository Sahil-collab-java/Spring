package com.example._08_springDataJPA.Repo;

import com.example._08_springDataJPA.Model.Book;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepo extends JpaRepository<Book,Integer> {

    @Query(value = "select *from book", nativeQuery = true)
    public List<Book> getAllBooks();

    @Query(value = "FROM Book")
    public  List<Book> getAllBooksHibernate();

    @Transactional
    @Modifying
    @Query(value = "UPDATE Book SET bookName = :bookName WHERE bookID = :bookId")
    public  void updatethroughBookId(String bookName,Integer bookId);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM Book WHERE bookID = :bookId")
    public  void deleteThroughBookId(Integer bookId);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO Book (bookID, bookName,bookPrice) VALUES (:bookId, :bookName,:bookPrice)")
    public  void insertThroughBookId(Integer bookId,String bookName ,Double bookPrice);





}
