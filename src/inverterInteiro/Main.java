package inverterInteiro;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(15485448);
        numeros.add(2195498);
        numeros.add(12);
        numeros.add(98716549);
        numeros.add(1654891);

        double d= 9999998999d;
        for(Integer inteiro: numeros) {
            System.out.println(inteiro + "-->" + inverte(inteiro));
        }
        System.out.println(d + "-->" + inverte(d));



    }

    public static int inverte(int numero){
        String inverte= Integer.toString(numero);
        StringBuilder stringBuilder= new StringBuilder(inverte);
        inverte= stringBuilder.reverse().toString();
        return Integer.parseInt(inverte);
    }

    public static String inverte(double numero){
        String inverte= Double.toString(numero);
        StringBuilder stringBuilder= new StringBuilder(inverte);
        //inverte a string e remove o . e o E e o numero após a ele
        inverte= stringBuilder.reverse().toString().replace(".", "").substring(2);
        return inverte;
    }
}
