package uk.stuqad.sendboatfixer.Listeners;

import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityTeleportEvent;

public class OnEntityTeleportEvent {
    @EventHandler
    public void onEntityTeleportEvent(EntityTeleportEvent event) {
        if (event.getEntity().getWorld().getEnvironment().equals(World.Environment.THE_END) && !event.getEntity().isEmpty()) {
            event.setCancelled(true);
        }

    }
}
