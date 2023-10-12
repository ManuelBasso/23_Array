//Scrivi un programma che contenga un metodo che crea un array e lo riempie con dei caratteri.
// Questo metodo dovrà poi stampare tutte le occorrenze del carattere 'a' o 0 in caso non ce ne siano.

public class Main {
    public static void main(String args[]) {
        printChar();
    }
    public static void printChar(){
        char [] arrChar = {'s', 'e', 'r', '3'};
        boolean check = false;
        for (char i : arrChar){
            if (i == 'a'){
                System.out.println(i);
                check = true;
            }
        }
        if (check == false){
            System.out.println("0");
        }
    }

}