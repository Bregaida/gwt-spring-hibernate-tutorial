package de.chieukam.tutorial.server;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import de.chieukam.tutorial.shared.BookDTO;

@Component
@Scope(value=WebApplicationContext.SCOPE_SESSION, proxyMode=ScopedProxyMode.TARGET_CLASS)
public class ShoppingCart {

    private List<BookDTO> books = new ArrayList<BookDTO>();
    
    public ShoppingCart() {}

    public void addBook(BookDTO book) {
	books.add(book);
    }

    public List<BookDTO> getBooks() {
	return books;
    }
}
