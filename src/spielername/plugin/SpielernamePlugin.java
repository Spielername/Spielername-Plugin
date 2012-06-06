/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spielername.plugin;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;
/**
 *
 * @author Athlon
 */
public class SpielernamePlugin extends JavaPlugin {
        
    public static Logger log;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public void onEnable() { 
      log = this.getLogger();
      log.info("Your plugin has been enabled!");
      this.getServer().getPluginManager().registerEvents(new WelcomeListener(), this);
      this.getServer().getPluginManager().registerEvents(new PlayerMainEvent(this),this);
    }
 
    @Override
    public void onDisable() { 
      log.info("Your plugin has been disabled.");
    }
}