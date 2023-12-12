package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        
        if (Player.countPlayers == 6) {
            return;
        }

        Player.countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return Player.countPlayers;
    }

    public void run() {
        if (stamina > 1) {
            stamina --;
        } else if (stamina == 1) {
            stamina--;
            Player.countPlayers -= 1;
        }
    }

    public static void info() {
        if (Player.countPlayers < 6) {
            System.out.println("Команды неполные. На поле ещё есть "+(6-Player.countPlayers)+" свободных мест");
        } else  {
            System.out.println("На поле нет свободных мест");
        }
    }
}
