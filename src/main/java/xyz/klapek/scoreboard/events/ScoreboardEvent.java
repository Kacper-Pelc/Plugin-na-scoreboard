package xyz.klapek.scoreboard.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.*;
import xyz.klapek.scoreboard.Scoreboard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ScoreboardEvent implements Listener {
    Scoreboard plugin;

    public ScoreboardEvent(Scoreboard plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {

            Player player = event.getPlayer();

            List<String>line = new ArrayList<>();
            int i = 0;
            ScoreboardManager manager = Bukkit.getScoreboardManager();
            org.bukkit.scoreboard.Scoreboard scoreboard = manager.getNewScoreboard();
            Objective lists = scoreboard.registerNewObjective("jebacdisa", "dummy", ChatColor.AQUA + "TeenageCoders.eu", RenderType.INTEGER);
            lists.setDisplaySlot(DisplaySlot.SIDEBAR);
            line.add("chuj");
            line.add("cipa");
            Collections.reverse(line);
            for(String a:line) {
                i++;
                Score score = lists.getScore(a);
                score.setScore(i);

            }
            player.setScoreboard(scoreboard);
        },20,0);
    }
}
