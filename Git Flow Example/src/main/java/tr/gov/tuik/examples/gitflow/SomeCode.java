package tr.gov.tuik.examples.gitflow;

/**
 * Created by Hasan TEKGÜL
 * on 2/26/2016
 */
public class SomeCode {

    public Author neww() {
        return new Author("Sample", "Author");
    }

    public Author create(String name, String lastname) {
        return new Author(name, lastname);
    }
}
