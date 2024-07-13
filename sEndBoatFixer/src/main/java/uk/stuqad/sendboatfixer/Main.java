package uk.stuqad.sendboatfixer;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import uk.stuqad.sendboatfixer.Listeners.OnEntityTeleportEvent;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new OnEntityTeleportEvent(), this);

        System.out.println("==============================");
        System.out.println("[sEndBoatFixer] Plugin is on");
        System.out.println("==============================");
    }

    @Override
    public void onDisable() {
        System.out.println("==============================");
        System.out.println("[sEndBoatFixer] Plugin is off");
        System.out.println("==============================");
    }
}
