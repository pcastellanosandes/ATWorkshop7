package co.edu.uniandes.Workshop7.Library;

import co.edu.uniandes.Workshop7.Library.Entities.Author;
import co.edu.uniandes.Workshop7.Library.Entities.Book;
import co.edu.uniandes.Workshop7.Library.Services.AuthorServices;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import java.util.Date;

@RunWith(JUnit4.class)
public class AuthorTest  extends TestCase {

    protected void setUp() {
    }
    protected void tearDown() {
    }

    @Test
    public void addNewUserTest() {
        AuthorServices services = new AuthorServices();

        //Crea la fabrica para la construcción de los POJOs
        PodamFactory podamFactory = new PodamFactoryImpl();
        Author author = null;
        Book book = null;

        //Crea una instancia de author, con las propiedades que tengan definido el SET
        Author newAuthor = podamFactory.manufacturePojo(Author.class);
        int idAuthor = newAuthor.getId();

        services.save(newAuthor);
        author = services.get(idAuthor);

        Assert.assertEquals(newAuthor.getName(), author.getName());
        Assert.assertEquals(newAuthor.getBooks().size(), author.getBooks().size());

        Date currentDate = new Date();

        for (Book newBook:newAuthor.getBooks()) {
            book = services.getBook(idAuthor, newBook.getName());
            Assert.assertEquals(newBook.getId(), book.getId());
            Assert.assertEquals(newBook.getName(), book.getName());
            Assert.assertEquals(newBook.getCode(), book.getCode());
            Assert.assertEquals(newBook.getType(), book.getType());
            //Assert.assertNotNull(book.getPublicationDate());
        }
    }

}
