package com.gestion;

public class AddFile {

    public static void main(String[] args){
        try {
            final String separator = ",";

            String myText = "esr,987,/;,u8g,N,908,*$!";

            String tabText[] = myText.split(separator);

            for (int i = 0; i<=myText.length(); i++){
                if (tabText[i] == null){
                    System.out.println("Empty File");

                } else {
                    try {
                        int a = Integer.parseInt(tabText[i]);
                        System.out.println("Entier [" + i + "]: "  + a);
                    } catch (NumberFormatException exception){
                        System.out.println("String [" + i + "]: "  + tabText[i]);
                    }
                }
            }
/*
            File file = new File("C:\\Users\\SYB\\Desktop\\File.txt");
            FileWriter files = new FileWriter(myText);
            if (file.createNewFile()) {
                System.out.println("File created");

            }else if (file.exists()){
                System.out.println("File exists");
            }else {
                System.out.println("File does not created");
            }

 */
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

