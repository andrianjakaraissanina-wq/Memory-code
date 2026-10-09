import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Mini Network Tools - par RAISSA ===");
        System.out.println("1. Vérifier une adresse IP");
        System.out.println("2. Tester une adresse (ping)");
        System.out.print("Choisis une option (1 ou 2) : ");
        
        int choix = scanner.nextInt();
        scanner.nextLine(); // vider le buffer

        if (choix == 1) {
            System.out.print("Entre une adresse IP (ex: 192.168.1.15) : ");
            String ip = scanner.nextLine();
            NetworkUtils.verifierIP(ip);
        } else if (choix == 2) {
            System.out.print("Entre une adresse à pinger (ex: 8.8.8.8) : ");
            String adresse = scanner.nextLine();
            NetworkUtils.pingAdresse(adresse);
        } else {
            System.out.println("Choix invalide !");
        }
        scanner.close();
    }
          }
