package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException; // Import the File class



        public class Main {
            public static void main(String[] args) {
                try {
                    File quoteFile = new File("C:\\gomathi\\launchcode\\JavaProjects\\Counting Characters\\src\\test\\quoteFile");
                    Scanner myReader = new Scanner(quoteFile);
                    while (myReader.hasNextLine()) {
                        String userQuote = myReader.nextLine();
                        System.out.println(userQuote);

                //Scanner input = new Scanner(System.in);
               // System.out.println("Please enter a quote ");
                //String userQuote = input.nextLine();
                char[] charactersInString = userQuote.toLowerCase().toCharArray();
                HashMap<Character, Integer> quoteMap = new HashMap<>();
                for ( char i  : charactersInString)
                {
                    if(Character.isLetter(i)){
                        if(quoteMap.containsKey(i)){
                            int quoteCounter = quoteMap.get(i) + 1;
                            quoteMap.put(i, quoteCounter);
                        } else{
                            quoteMap.put(i,1);
                        }
                    }
                }

                for(Map.Entry<Character,Integer>entry:quoteMap.entrySet()){
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
                    }
                    //myReader.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }


        }
