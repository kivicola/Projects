import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

//    long R = 255 << 16;
//    long G = 192 << 8;
//    long B = 203;
//    long RGB = (R + G + B);

    long liczba = 8388564;


    long R = liczba >> 16;
    long G = liczba >> 15 ;
    long B = liczba - (R << 16) - (G << 8);

    System.out.println(R);
    System.out.println(G);
    System.out.println(B);

}








