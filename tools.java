import java.util.Scanner;

public class tools{
    //Scanner input=new Scanner(System.in);

    /**print a line on the screen
    * @param num_line Number of characters to print in each line
    * @param str What character do you want to print
    */
    public static void printLine(int num_line, String str){
        for(int i = 0; i < num_line; i++){
            System.out.print(str);
        }
    System.out.println("");
    }

    /**print a line on the screen
    * @param num_line How large the square do you want
    * @param str The character do you want to print
    */
    public static void printSquare(int num_line,String str) {
        for(int i = 0; i < num_line;i++){
            printLine(num_line, str);
        }
    }
    
    /**print a line on the screen
    * @param num_line Number of characters to print in each line
    * @param num_column Rows do you want to print
    * @param str The character do you want to print
    */
    public static void printRectangle(int num_column,int num_line,String str){
        for(int j = 0; j < num_column; j++){
            printLine(num_line,str);
        }
    }


    public static void printNumRectangle(int num_rectangle,int num_column,int num_line,String str ){
        for(int i = 0; i <num_rectangle; i++){
            printRectangle(num_column,num_line,str);
            System.out.println();
                for(int j = 0; j< num_line; j++){
                    System.out.print("=");
                }
            System.out.println();
        }
    }
    //Getting inputs from user

    public static int getLine(String str){
        System.out.println(str);
        Scanner in = new Scanner(System.in);
        int num_line = in.nextInt();
        return num_line;
    }

    public static int getColumn(){
        Scanner in = new Scanner(System.in);
        System.out.println("How long do you want to print:");
        int num_column = in.nextInt();
        return num_column;
    }

    public static String getchar(){
        Scanner in = new Scanner(System.in);
        System.out.println("What character do you want to print out:");
        String character = in.nextLine();
        return character;
    }

    public static int getNum(){
        Scanner in = new Scanner(System.in);
        System.out.println("How many rectangles do you want to print out:");
        int num_rec = in.nextInt();
        return num_rec;
    }
}