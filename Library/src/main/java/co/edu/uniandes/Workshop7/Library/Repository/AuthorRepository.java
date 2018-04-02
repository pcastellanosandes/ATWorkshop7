package co.edu.uniandes.Workshop7.Library.Repository;

import co.edu.uniandes.Workshop7.Library.Entities.Author;


import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class AuthorRepository {
    private List<Author> authors;

    public AuthorRepository(){
        authors = new LinkedList<Author>();
    }

    public void Add(Author author){
        authors.add(author);
    }

    public void delete(int id) {
        Predicate<Author> authorPredicate = a-> a.getId() == id;
        authors.removeIf(authorPredicate);
    }

    public List<Author> getAll(){
        return authors;
    }

    public Author get(int id){
        Author authorResult = null;
        for (Author author: authors) {
            if (author.getId() == id) {
                authorResult = author;
                break;
            }
        }
        return authorResult;
    }

    public void update(int id, Author authorNew){
        Author author = this.get(id);
        if(author!=null){
            author.setName(authorNew.getName());

        }
    }
}
