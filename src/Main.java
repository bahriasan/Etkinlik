import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        System.out.println("Hava Sıcaklığını Giriniz");
        Scanner input = new Scanner(System.in);
        heat = input.nextInt();

        if(heat<5){
            System.out.println("Kayağa Git");
        }else if(heat<15){
            System.out.println("Sinemaya Git");
        }else if(heat<25){
            System.out.println("Pikniğe Git");
        }else{
            System.out.println("Yüzmeye Git");
        }
    }
}
