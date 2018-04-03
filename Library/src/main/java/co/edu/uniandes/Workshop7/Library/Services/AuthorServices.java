package co.edu.uniandes.Workshop7.Library.Services;

import co.edu.uniandes.Workshop7.Library.Entities.Author;
import co.edu.uniandes.Workshop7.Library.Entities.Book;
import co.edu.uniandes.Workshop7.Library.Repository.AuthorRepository;

import java.util.List;

public class AuthorServices {
    private AuthorRepository repository;

    public AuthorServices(){
        repository = new AuthorRepository();
    }

    public void save(Author author)
    {
        repository.add(author);
    }

    public void addBook(int idAuthor, Book book){
        repository.addBook(idAuthor,book);
    }

    public Author get(int id){
        return repository.get(id);
    }

    public Book getBook(int idAuthor, String name ){
        return repository.getBook(idAuthor, name);
    }

    public void delete(int id){
        repository.delete(id);
    }

    public List<Author> getAll(){
        return repository.getAll();
    }

    public void update(int id, Author author){
        repository.update(id,author);
    }
}
