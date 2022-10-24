import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите длину массива");
        Scanner in = new Scanner(System.in);
        int lengthOfArray = in.nextInt();
        int[] array = new int[lengthOfArray];
        System.out.println("Введите элементы массива");
        for(int i = 0; i < array.length; i++)
        {
            array [i] = in.nextInt();
        }
        int count = 1;
        for(int i = 0; i < array.length - 1; i++){
                if (array [i] == array [i+1]){
                    count ++;
                }else{
                    count = 1;
                }
            System.out.println(array [i] + " - " + count);
        }
        }
    }

