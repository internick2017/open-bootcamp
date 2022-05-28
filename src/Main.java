public class Main {
    public static void main(String[] args) {
        //        Ejercicios tema 3
        int result = functionTres(2, 8, -20);
        Coche miCoche = new Coche();
        miCoche.AdicionarPuerta();
        System.out.println(result);
        System.out.println(miCoche.puertas);
//        Final Ejercicio tema 3
        //        Ejercicios tema 4
        String resultado;
        if (result > 0) {
            resultado = "positivo";
            System.out.println(resultado);

        } else {
            resultado = "negativo";
            System.out.println(resultado);
        }
        int number_while = 0;
        while (number_while < 3) {
            number_while++;
            System.out.println(number_while);
        }

        do {
            System.out.println(number_while);
            break;
        } while (number_while == 3);


        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        String estacion = "verano";
        switch (estacion){

            case "verano":
                    System.out.println("Ir a la playa");
                    break;
            case "invierno":
                System.out.println("No bañarse");
                break;
            case "otoño":
                System.out.println("Salir a pasear");
                break;
            case "primavera":
                System.out.println("Trabajar");
                break;
            default:
                System.out.println("Dormir");
                break;
        }

    }

    // Inicio  Ejercicios tema 3
    public static int functionTres(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    static class Coche {
        public int puertas = 2;

        public void AdicionarPuerta() {
            this.puertas++;
        }
    }
    //    Final Ejercicio tema 3
}

