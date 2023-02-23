// Random Access File Handling

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class S11_Prg_001 {
    static Scanner sc = new Scanner(System.in);
    static void menu(){
        System.out.println("Random Access File Handling");
        System.out.println("1. Create a File");
        System.out.println("2. Delete a File");
        System.out.println("3. Write a File");
        System.out.println("4. Append to File");
        System.out.println("5. Read File");
        System.out.println("6. Exit");
        System.out.print("Enter your Choice: ");
    }

    RandomAccessFile rf;
    String fileName;

    S11_Prg_001(String fileName){
        try{
            this.fileName = fileName;
            rf = new RandomAccessFile(this.fileName,"rw");
        }catch (FileNotFoundException fnf){
            this.create();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }

    }

    void create(){
        try{
            System.out.println("Cresting file "+this.fileName);
            File f = new File(this.fileName);
            if(f.exists()){
                System.out.println("File with the Name Already Exists!");
            }else{
                if(f.createNewFile()){
                    System.out.println("File Created Successfully!");
                }else{
                    throw new Exception("Error Creating File!");
                }
            }
        }catch(Exception e){
            System.out.println("Error Creating File...");
            System.out.println("Error: "+e.getMessage());
        }
    }

    void delete(){
        try{
            File f = new File(this.fileName);
            rf.close();
            if(f.delete()){
                System.out.println("File Deleted Successfully!");
            }
        }catch (Exception e){
            System.out.println("Something went Wrong");
            System.out.println(e.getMessage());
        }
    }

    void write(){
        System.out.println("Enter the Content to write:");
        sc.nextLine();
        String content = sc.nextLine();
        try{
            this.rf.write(content.getBytes());
            System.out.println("Successfully wrote to File!");
        }catch(Exception e){
            System.out.println("Error Writing file");
            System.out.println(e.getMessage());
        }

    }

    void append(){
        System.out.println("Enter the Contents to Append into File: ");
        sc.nextLine();
        String message = sc.nextLine();
        try{
            long length = rf.length();
            rf.seek(length);
            rf.write(message.getBytes());
            System.out.println("Append Successful!");
        }catch(Exception e){
            System.out.println("Error Appending File!");
            System.out.println(e.getMessage());
        }
    }

    void read(){
        try{
            String message = rf.readLine();
            System.out.println("Contents of the file are: ");
            System.out.println(message);
        }catch(Exception e){
            System.out.println("Error Reading File!");
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the Name of the file: ");
        String fileName;
        fileName = sc.nextLine();
        S11_Prg_001 obj = new S11_Prg_001(fileName);
        int ch;
        boolean isRunning = true;

        while(isRunning){
            menu();
            ch = sc.nextInt();
            switch(ch){
                case 1 -> obj.create();
                case 2 -> obj.delete();
                case 3 -> obj.write();
                case 4 -> obj.append();
                case 5 -> obj.read();
                case 6 -> isRunning = false;
                default -> System.out.println("Enter a Valid Choice");
            }
        }
    }
}
