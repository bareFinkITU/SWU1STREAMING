import controller.ContentController;

import javax.swing.*;
import java.io.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) throws IOException {
        ContentController test = new ContentController();

        test.initializeContent();
        test.searchByRating(8.0);



        /*StreamingViewver viewTest = new StreamingViewver();*/
    }
}