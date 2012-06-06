/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spielername.plugin;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;


/**
 *
 * @author Athlon
 */
public class OwnSpider implements Spider {
     protected OwnSpider plugin;
     private int lmaxHealth;
    
    public OwnSpider (OwnSpider aPlugin) {
        plugin = aPlugin;
    }

    @Override
    public void setTarget(LivingEntity le) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public LivingEntity getTarget() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getHealth() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setHealth(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxHealth() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public int getOwn() {
        lmaxHealth = 56;
        return lmaxHealth;
    }

    @Override
    public double getEyeHeight() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getEyeHeight(boolean bln) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Location getEyeLocation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Block> getLineOfSight(HashSet<Byte> hs, int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Block getTargetBlock(HashSet<Byte> hs, int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Block> getLastTwoTargetBlocks(HashSet<Byte> hs, int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Egg throwEgg() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Snowball throwSnowball() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Arrow shootArrow() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T extends Projectile> T launchProjectile(Class<? extends T> type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getRemainingAir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setRemainingAir(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaximumAir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setMaximumAir(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void damage(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void damage(int i, Entity entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaximumNoDamageTicks() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setMaximumNoDamageTicks(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getLastDamage() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setLastDamage(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getNoDamageTicks() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setNoDamageTicks(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Player getKiller() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addPotionEffect(PotionEffect pe) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addPotionEffect(PotionEffect pe, boolean bln) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addPotionEffects(Collection<PotionEffect> clctn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean hasPotionEffect(PotionEffectType pet) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removePotionEffect(PotionEffectType pet) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<PotionEffect> getActivePotionEffects() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Location getLocation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setVelocity(Vector vector) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Vector getVelocity() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public World getWorld() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean teleport(Location lctn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean teleport(Location lctn, TeleportCause tc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean teleport(Entity entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean teleport(Entity entity, TeleportCause tc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Entity> getNearbyEntities(double d, double d1, double d2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getEntityId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getFireTicks() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxFireTicks() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setFireTicks(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isDead() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Server getServer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Entity getPassenger() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean setPassenger(Entity entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean eject() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public float getFallDistance() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setFallDistance(float f) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setLastDamageCause(EntityDamageEvent ede) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public EntityDamageEvent getLastDamageCause() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public UUID getUniqueId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getTicksLived() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setTicksLived(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void playEffect(EntityEffect ee) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public EntityType getType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isInsideVehicle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean leaveVehicle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Entity getVehicle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setMetadata(String string, MetadataValue mv) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<MetadataValue> getMetadata(String string) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean hasMetadata(String string) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeMetadata(String string, Plugin plugin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
  
}