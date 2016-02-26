package tr.gov.tuik.examples.gitflow;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Hasan TEKGÜL
 * on 2/26/2016
 */
public class SomeCodeTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testNeww() throws Exception {
        Author author = new SomeCode().neww();
        assertTrue(author.getName().equals("Dummy"));
        assertTrue(author.getLastname().equals("Author"));
    }

    @Test
    public void testCreate() throws Exception {
        String name = "Hasan";
        String lastname = "Tekgül";
        Author author = new SomeCode().create(name, lastname);
        assertTrue(author.getName().equals(name));
        assertTrue(author.getLastname().equals(lastname));
    }
}