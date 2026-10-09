import java.net.InetAddress;

public class NetworkUtils {

    // Vérifie si c'est une IP privée de type 192.168.x.x
    public static void verifierIP(String ip) {
        if (ip.startsWith("192.168.")) {
            System.out.println("✅ " + ip + " est une IP locale (comme en salle de classe)");
        } else if (ip.startsWith("10.") || ip.startsWith("172.")) {
            System.out.println("✅ " + ip + " est une IP privée");
        } else {
            System.out.println("🌐 " + ip + " est une IP publique (Internet)");
        }
    }

    // Simule un ping
    public static void pingAdresse(String adresse) {
        try {
            System.out.println("Ping vers " + adresse + " en cours...");
            InetAddress inet = InetAddress.getByName(adresse);
            boolean reachable = inet.isReachable(3000); // 3 secondes
            
            if (reachable) {
                System.out.println("✅ Réponse de " + adresse + " : OK ! Connexion réussie.");
            } else {
                System.out.println("❌ Délai d'attente dépassé. " + adresse + " ne répond pas.");
            }
        } catch (Exception e) {
            System.out.println("❌ Erreur : adresse invalide");
        }
    }
              }
          
