public class Main {
    public static void main(String[] args) {

        int result = functionTres(2, 6, 8);
        Coche miCoche = new Coche();
        miCoche.AdicionarPuerta();
        System.out.println(result);
        System.out.println(miCoche.puertas);
    }

    public static int functionTres(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    static class Coche {
        public int puertas = 2;

        public void AdicionarPuerta() {
            this.puertas++;
        }
    }
}

