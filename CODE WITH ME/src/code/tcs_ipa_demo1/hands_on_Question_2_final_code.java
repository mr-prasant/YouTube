import java.util.*;

class Player {
    private int id;
    private String name;
    private int runs;
    private String playerType;
    private String matchType;

    public Player() {
    }

    public Player(int id, String name, int runs, String playerType, String matchType) {
        this.id = id;
        this.name = name;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public int getId() {
        return id;
    }

    public int getRuns() {
        return runs;
    }

    public String getPlayerType() {
        return playerType;
    }

    public String getMatchType() {
        return matchType;
    }
}

class MyClass {
    static int leastRuns(Player[] players, String playerType) {
        int least = Integer.MAX_VALUE;

        for (Player p : players) {
            if (p.getPlayerType().equalsIgnoreCase(playerType)) {
                least = Math.min(least, p.getRuns());
            }
        }

        return least == Integer.MAX_VALUE ? 0 : least;
    }

    static List<Player> getList(Player[] players, String matchType) {
        List<Player> list = new ArrayList<>();

        for (Player player : players) {
            if (player.getMatchType().equalsIgnoreCase(matchType)) {
                list.add(player);
            }
        }

        if (list.isEmpty()) {
            return null;
        }

        list.sort((p1, p2) -> (p2.getId() - p1.getId()));
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 4;
        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            int id = Integer.parseInt(sc.nextLine().trim());
            String name = sc.nextLine().trim();
            int runs = Integer.parseInt(sc.nextLine().trim());
            String playerType = sc.nextLine().trim();
            String matchType = sc.nextLine().trim();

            players[i] = new Player(id, name, runs, playerType, matchType);
        }

        String playerType = sc.nextLine().trim(), matchType = sc.nextLine().trim();

        int runs = leastRuns(players, playerType);
        System.out.println(runs > 0 ? runs : "No such player");

        List<Player> list = getList(players, matchType);

        if (list == null) {
            System.out.println("No Player with given matchType");
        } else {
            for (Player p : list)
                System.out.println(p.getId());
        }
    }
}
