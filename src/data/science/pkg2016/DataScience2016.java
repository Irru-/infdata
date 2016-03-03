/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.science.pkg2016;
import java.util.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author nick
 */
public class DataScience2016 {

    /**
     * @param args the command line arguments
     */
    
    static String path;
    
    public static void main(String[] args) throws IOException {
        TreeMap tm = buildTreeMap();
        
        for(int i = 1; i <= tm.size(); i++){
            System.out.println("Ratings for user " + (i));
            System.out.println(tm.get(i));
        }
    }
    
    public static TreeMap buildTreeMap() throws IOException {
        TreeMap tm = new TreeMap();        
        List<String> lines = Files.readAllLines(
                Paths.get("/home/nick/DataScience", 
                "userItem.data"));   
        
        for (String line : lines) {
            String[] values = line.split(",");
            int user = Integer.parseInt(values[0]);
            int item = Integer.parseInt(values[1]);
            double rating = Double.parseDouble(values[2]);
            if (tm.get(user) == null) {
                TreeMap up = new TreeMap();
                up.put(item, rating);
                tm.put(user, up);
            } else {
                TreeMap up = (TreeMap) tm.get(user);
                up.put(item, rating);
            }
        }
        
        return tm;
    }    
}
