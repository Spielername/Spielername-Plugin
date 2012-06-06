/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spielername.plugin;
  import java.text.SimpleDateFormat;
  import org.bukkit.entity.Player;
  import org.bukkit.entity.Spider;
  import org.bukkit.event.EventHandler;
  import org.bukkit.event.EventPriority;
  import org.bukkit.event.Listener;
  import org.bukkit.event.player.PlayerLoginEvent;
  import org.bukkit.event.player.PlayerJoinEvent;

/**
 *
 * @author Athlon
 */
public class WelcomeListener implements Listener{
  /*
    @EventHandler(priority = EventPriority.LOW)
    public void normalLogin(PlayerLoginEvent event) {
        Player p = event.getPlayer();
        p.getServer().broadcastMessage("Welcome " + p.getName());
    } 
  */
  @EventHandler(priority = EventPriority.LOW)
  
  public void playerJoin(PlayerJoinEvent event) {
      Player joinPlayer = event.getPlayer();
      double lastPlayed = joinPlayer.getLastPlayed();
      String lastPlayedformated = new SimpleDateFormat("dd.MM.yyyy hh:ss").format(lastPlayed);
      joinPlayer.getServer().broadcastMessage("Willkommen " + joinPlayer.getName() + " du warst am " + lastPlayedformated + " das letzte mal Online.");
  } 
  
  
}