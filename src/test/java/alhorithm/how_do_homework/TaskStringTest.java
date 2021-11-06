package alhorithm.how_do_homework;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TaskStringTest {

    @Test
    void readLength() throws IOException {

        File fileIn = new File("src/test/resources/String/test.0.in");
        File file = new File("src/test/resources/String/test.0.out");
        Scanner scanner = new Scanner(file);

        assertEquals(scanner.nextInt(), fileIn.length());
    }
}