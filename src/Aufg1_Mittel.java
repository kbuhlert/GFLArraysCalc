import java.util.Arrays;

public class Aufg1_Mittel {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,5,7,8,12,45};
        int[] ergebnisse = summeUndMittel(array1);
        System.out.println(Arrays.toString(ergebnisse) + " Wert1 = Summe / Wert2 = Arithmetisches Mittel (gerundet) ");
    }
    public static int[] summeUndMittel (int[]array1){
        int summe = 0;
        int mittel = 0;             // Berechnung des Mittels mit int führt zu Ausgabe des gerundeten Wertes, wenn nicht als Ganzzahl teilbar
        for (int element:array1) {
            summe = summe+element;
        }
        mittel=summe/array1.length;
        return new int[]{summe,mittel};
    }
}
