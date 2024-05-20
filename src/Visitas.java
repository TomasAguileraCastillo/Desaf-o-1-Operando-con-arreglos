public class Visitas {

    public static void main(String[] args) {
        System.out.println("Para la entrada anterior, el resultado es " + promedio(args));
    }

    static int promedio(String[] visitas){
        int suma = 0;
        int promedio = 0;
        int contador = 0;
        for (int i = 0; i < visitas.length; i++) {
                suma = suma + Integer.parseInt(visitas[i]);
                contador++;
        }
        promedio = suma / contador;
        return promedio;
    }

}