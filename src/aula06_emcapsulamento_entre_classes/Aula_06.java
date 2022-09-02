package aula06_emcapsulamento_entre_classes;

public class Aula_06 {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Italo", "França", 31, 1.75f, 68.9f,
                11, 2, 1);
        l[1] = new Lutador("Gustavo", "Brasil", 29, 1.68f, 57.8f,
                14, 2, 1);
        l[2] = new Lutador("Guanabara", "EUA", 35, 1.65f, 80.9f,
                12, 2, 1);
        l[3] = new Lutador("Neymar", "Brasil", 27, 1.7f, 81.3f,
                10, 2, 4);
        l[4] = new Lutador("Messi", "Brasil", 37, 1.70f, 119.3f,
                5, 4, 3);
        l[5] = new Lutador("Mc Donalds", "EUA", 30, 1.81f, 105.7f,
                12, 2, 4);

        Luta EFC01 = new Luta();
        EFC01.marcarLuta(l[2], l[3]);
        EFC01.lutar();


    }
}
