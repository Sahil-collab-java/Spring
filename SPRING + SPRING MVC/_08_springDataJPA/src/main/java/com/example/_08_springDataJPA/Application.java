package com.example._08_springDataJPA;

import com.example._08_springDataJPA.Model.Book;
import com.example._08_springDataJPA.Repo.BookRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

	BookRepo repo =   applicationContext.getBean(BookRepo.class);

/*
		Book book = new Book();

		book.setBookID(103);
		book.setBookName("C");
		book.setBookPrice(3000.00);*/





		//System.out.println("Data Saves Successfully...................");

		//List<Book> books =  repo.getAllBooksHibernate();

//		Optional<Book> books = repo.findById(101);
//
//		System.out.println(books.get());

//		for (Book book :books){
//			System.out.println(book);
//		}

//		Sort sort = Sort.by("bookName").ascending();
//
//		List<Book> result = repo.findAll(sort);

//		Integer pageNo = 1;
//		PageRequest pageRequest = PageRequest.of(pageNo-1,1);
//
//		Page<Book> page = repo.findAll(pageRequest);
//
//		List<Book> result = page.getContent();


		//Example Querry

//		Book book = new Book();
//		book.setBookName("Spring");
//
//		Example<Book> bookExample = Example.of(book);
//
//		List<Book> result = repo.findAll(bookExample);


		//Custom update querry

//	repo.updatethroughBookId("Spring Boot",101);
//
//		System.out.println("Update SucessFully.............");


		// Custom Delete Querry

//		repo.deleteThroughBookId(101);
//
//		System.out.println("Deleted.............");
//
//		//Custom Insert Querry

		repo.insertThroughBookId(104,"Spring ",102.023);

		System.out.println("Insert SucessFully.............");


//				for (Book obj :result){
//			System.out.println(obj);
		//}




	}

}
