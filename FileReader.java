/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker_schedule;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author KyawMin
 */
public class FileReader {
    
    private int counter=0;
    
    public FileReader(String fileName) throws IOException {
        
        readFile(fileName);
    }
    
    
    /** Read the contents of the given file. */
    private void readFile(String fileName) throws IOException {
            try {
                    Scanner file = new Scanner(new File(fileName));
                    while (file.hasNextLine()) {
                        String data = file.nextLine().trim();
                        if (data.length() == 0)break;
                        
                        if(counter++ > 1){
                            String[] words = data.split("\\W+");
                            for(String word : words)
                                System.out.print(word + " ");

                        }
                        System.out.println();


                    }
                    file.close();
            } catch (IOException e) {
                    System.out.println("Error while loading the file!" + e.getMessage());
                    System.exit(0);
            }
    }
}
