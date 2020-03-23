public class Aufg3_DoppelteWerte {
    public static void main(String[] args) {
        int[]array1 = new int[]{1,4,4,5,7,1,11,13,4};
        System.out.println(mehrfachwert(array1));
    }

    public static String mehrfachwert (int[]array1){
        String doppelString = "Kein Doppelwert";
        for(int erstwert = 0; erstwert<array1.length; erstwert++){
            int doppeltwert= array1[erstwert];
            for(int i=1; i<array1.length-1;i++){
                int vergleichswert=array1[i];
            if(vergleichswert==doppeltwert){
                doppelString = Integer.toString(doppeltwert)+" kommt mehrfach vor";
                }
            }
        }
        return doppelString;
    }
}
