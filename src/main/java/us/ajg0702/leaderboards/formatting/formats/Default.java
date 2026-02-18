package us.ajg0702.leaderboards.formatting.formats;

import us.ajg0702.leaderboards.LeaderboardPlugin;
import us.ajg0702.leaderboards.formatting.Format;

import static us.ajg0702.leaderboards.boards.StatEntry.addCommas;

public class Default extends Format {
    private final LeaderboardPlugin plugin;

    public Default(LeaderboardPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean matches(String output, String placeholder) {
        return true;
    }

    @Override
    public double toDouble(String input) {
        return Double.parseDouble(input);
    }

    @Override
    public String toFormat(double input) {
        double e = Math.pow(10, input);
        return addCommas(Math.round(input * e) / e);
    }

    @Override
    public String getName() {
        return "Default";
    }
}
