/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker_schedule;

import java.io.IOException;

/**
 *
 * @author KyawMin
 */
public class WorkerSchedule {
    
    private static String filePath = System.getProperty("user.dir").replace("\\", "/") + "/src/TextFile/" ;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        FileReader myFile = new FileReader(filePath + "sampleData.txt");
    }
    
}
