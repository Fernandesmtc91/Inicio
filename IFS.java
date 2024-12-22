package Controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaVacinas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos meses voce tem?");
        int meses = entrada.nextInt();
        entrada.nextLine(); // Limpar buffer

        // Lista para armazenar vacinas
        List<String> vacinas = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            System.out.printf("Qual a %da vacina? (Digite 'n' se nao tomou)%n", i);
            String vacina = entrada.nextLine().toLowerCase();
            if (!vacina.equals("n")) {
                vacinas.add(vacina);
            }
        }

        // Verificar vacinas por idade
        verificarVacinas(meses, vacinas);

        entrada.close();
    }

    private static void verificarVacinas(int meses, List<String> vacinas) {
        if (meses == 3 && vacinas.contains("meningo")) {
            System.out.println("Voce tomou a vacina de 3 meses.");
        } else if (meses == 5 && vacinas.contains("meningo")) {
            System.out.println("Voce tomou a vacina de 5 meses.");
        } else if (meses == 2 && vacinas.containsAll(List.of("penta", "vip", "pneumo", "rotavirus"))) {
            System.out.println("Voce tomou a vacina de 2 meses.");
        } else if (meses == 4 && vacinas.containsAll(List.of("penta", "vip", "pneumo", "rotavirus"))) {
            System.out.println("Voce tomou a vacina de 4 meses.");
        } else if (meses == 6 && vacinas.containsAll(List.of("penta", "vip", "scr"))) {
            System.out.println("Voce tomou a vacina de 6 meses.");
        } else if (meses == 9 && vacinas.contains("febre amarela")) {
            System.out.println("Voce tomou a vacina de 9 meses.");
        } else if (meses == 12 && vacinas.containsAll(List.of("pneumo", "meningo", "scr"))) {
            System.out.println("Voce tomou a vacina de 12 meses.");
        } else if (meses == 15 && vacinas.containsAll(List.of("dtp", "vop", "hepatite a", "tetra viral"))) {
            System.out.println("Voce tomou a vacina de 15 meses.");
        } else if (meses > 15 && vacinas.containsAll(List.of("dtp", "vop", "varicela"))) {
            System.out.println("Voce tomou a vacina de 4 anos.");
        } else {
            System.out.println("Nenhuma combinacao de vacinas corresponde à sua idade.");
        }
    }
}
