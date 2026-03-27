package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Producto p = new Producto("Arroz", 2.0);
        Perecedero per = new Perecedero("Leche", 1.5, 2);
        NoPerecedero np = new NoPerecedero("Lata", 3.0, "Conserva");

        System.out.println(p);
        System.out.println("Total: " + p.calcular(5));

        System.out.println(per);
        System.out.println("Total: " + per.calcular(5));

        System.out.println(np);
        System.out.println("Total: " + np.calcular(5));
    }
}
