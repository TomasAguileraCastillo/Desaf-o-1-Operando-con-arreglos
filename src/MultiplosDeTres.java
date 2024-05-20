public class MultiplosDeTres {
    public static void main(String[] args) {
        suma(args);
        promedio(args);
    }
    static  void suma(String[] sumaMultiplos){
        int numero = 0 ;
        int sumatoria = 0;
        for (int i = 0; i < sumaMultiplos.length ; i++) {
            numero = Integer.parseInt(sumaMultiplos[i]);
            if ( numero%3 ==  0) {
                sumatoria = sumatoria + numero;
            }
        }
        System.out.println(sumatoria);
    }
    static  void  promedio(String [] promedioMultiplos){
        int numero = 0 ;
        int sumatoria = 0;
        int promedio = 0 ;
        int contador = 0 ;
        for (int i = 0; i < promedioMultiplos.length ; i++) {
            numero = Integer.parseInt(promedioMultiplos[i]);
            if ( numero%3 ==  0) {
                sumatoria = sumatoria + numero;
                contador++;
            }
        }
        promedio = sumatoria / contador;
        System.out.println(promedio);
    }

}
