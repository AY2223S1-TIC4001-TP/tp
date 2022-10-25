package seedu.duke.book;

import org.junit.jupiter.api.Test;
import seedu.duke.storage.Storage;
import java.nio.file.Path;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testToString() {
        Path directory = java.nio.file.Paths.get(System.getProperty("user.home"), "Duke");
        Path pathFile = java.nio.file.Paths.get(System.getProperty("user.home"), "Duke", "test" + ".txt");
        ArrayList<Book> bookList = new ArrayList<>();;

        String s = "Title: Clean Code | Author: Robert C. Martin | Edition: 2nd edition | Published: 2012 | On-shelf: 2 of 3 | Category: Software Engineering";

        Storage storage = new Storage(directory, pathFile, bookList);
        storage.loadBookFromFile(s);

        assertEquals(" Title: Clean Code\n       Author: Robert C. Martin\n       Edition: 2nd edition\n       Published: 2012\n       On-shelf: 2 of 3\n       Category: Software Engineering\n", bookList.get(0).toString());
    }
}