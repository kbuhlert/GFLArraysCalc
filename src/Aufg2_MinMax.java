import java.util.Arrays;

public class Aufg2_MinMax {
    public static void main(String[] args) {
        int[]array1 = new int[]{19,27,6,47,201,3};
        int[]minMax = minMax(array1);
        System.out.println(Arrays.toString(minMax) + " --> Wert1 = kleinster Arraywert / Wert2 = größter Arraywert");

    }
    public static int[] minMax (int[] array1){      //Methode minMax berechnet Minimum und Max für einen Array und gibt die Beiden werte als neuen Array zurück
        int minimum=array1[0];      //der erste Wert des Arrays wird zum Start als aktueller Min festgelegt
        int maximum=array1[0];       //der erste Wert des Arrays wird zum Start als aktueller Max festgelegt

        for (int element1:array1) {     //jedes Arrayelement wird ausgelesen
            if (element1>maximum){      //bei jedem Element wird getestet ob dies größer als der letzte max ist
                maximum=element1; }     //wenn element größer als letzter max, dann ist dies neues max
        }

        for (int element2:array1){
            if (element2<minimum){
                minimum=element2;
            }
        }
        return new int[]{minimum,maximum};  //die variablen min und max werden als neuer array gemeinsam zurückgegeben
    }
}
