package uk.stuqad.sendboatfixer;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import uk.stuqad.sendboatfixer.listeners.TeleportListener;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new TeleportListener(), this);

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
