/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spielername.plugin;
  import org.bukkit.Location;
  import org.bukkit.event.player.PlayerChatEvent;
  import org.bukkit.event.*;
  import org.bukkit.entity.Player;
  import org.bukkit.event.EventHandler;
  import org.bukkit.block.Chest;
  import org.bukkit.event.player.PlayerDropItemEvent;
  import org.bukkit.entity.Item;
 /**
 *
 * @author Athlon
 */
public class PlayerMainEvent implements Listener {
    SpielernamePlugin  plugin;
  
  public PlayerMainEvent(SpielernamePlugin  aPlugin) {
        plugin = aPlugin;
  }
  
  @EventHandler
  public void onPlayerDropItemEvent( PlayerDropItemEvent evt) {
      String eventName = evt.getEventName();
      Item dropedItem = evt.getItemDrop();
      Player eventPlayer = evt.getPlayer();
      eventPlayer.sendMessage(eventName);
      eventPlayer.sendMessage('1' + dropedItem.getType().getName());
      eventPlayer.sendMessage('2' + dropedItem.getType().name());
      eventPlayer.sendMessage('3' + dropedItem.getType().toString());
      eventPlayer.sendMessage('3' + evt.getItemDrop().getType().toString());
            
      // ** Monsterspawn
      //Location loc = evt.getPlayer().getEyeLocation();
      //loc.setY(loc.getY() + 2);
      //OwnSpider le_Spider = loc.getWorld().spawn(loc, OwnSpider.class);
      //eventPlayer.sendMessage("getMaxHealth: " + le_Spider.getOwn());
      
      //p.getServer().broadcastMessage("getMaxHealth: " + le_Spider.getMaxHealth() );
      //p.getServer().broadcastMessage("getHealth: " + le_Spider.getHealth());
      //le_Spider.setMaxHealth(100);
      //loc.getWorld().spawnCreature(loc, le_Spider);
    }
  /*
  @EventHandler
  public void EntityDeathEvent(LivingEntity entity, List<ItemStack> drops) {
      Player p = entity.getKiller();
      p.getServer().broadcastMessage("Du hast mich gekillt!");
  }
          
  
  public void onPlayerMove(PlayerMoveEvent evt) {
  	Location loc = evt.getPlayer().getLocation();
    	//World w = loc.getWorld();
    	loc.setY(loc.getY() + 2);
    	Block b = loc.getBlock();
        loc.getWorld().spawn(loc, Pig.class);
    	//b.setTypeId(15);
    }*/
}
