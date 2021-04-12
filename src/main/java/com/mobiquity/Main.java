package com.mobiquity;

import com.mobiquity.exception.APIException;
import com.mobiquity.packer.Packer;

/**
 * This class is the start point of the application, and will process the passed parameters.
 *
 * @author Elchin Valiyev (evaliyev@gmail.com)
 */

public class Main {

    public static void main(String[] args) {
        // Actual file path for input is required. Provide a file path
        try {
            System.out.println(Packer.pack("C:\\Users\\User\\Desktop\\file.txt"));
        } catch (APIException ex) {
            System.out.print(ex.getMessage());
        }
    }
}
