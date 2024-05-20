import java.util.ArrayList;

public class SmartWatch {
    public static ArrayList<Integer> filtrados = new ArrayList<Integer>();

    public static void main(String[] args) {
        clearSteps(args);
    }
    static void clearSteps(String[] steps){
        int numero=0;
        int sumatoria =0;
        int contador=0;
            for (int i = 0; i < steps.length; i++) {
                numero = Integer.parseInt(steps[i]);
                if (numero >= 200 && numero <= 100000) {
                    filtrados.add(i, numero);
                } else {
                    filtrados.add(i, 0);
                }
            }
            for (int j = 0; j < filtrados.size(); j++) {
                if (filtrados.get(j) == 0) {
                    filtrados.remove(j);
                }

            }
            for (int i = 0; i <filtrados.size() ; i++) {
                sumatoria = sumatoria + filtrados.get(i);
                contador++;
            }
            int promedio = sumatoria / contador;
            System.out.println(" el promedio de pasos diarios : " +promedio);
    }
}
