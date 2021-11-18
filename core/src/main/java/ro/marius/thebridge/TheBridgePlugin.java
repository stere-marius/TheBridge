package ro.marius.thebridge;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import ro.marius.thebridge.utils.Utils;
import ro.marius.thebridge.listeners.TNTExplode;

public class TheBridgePlugin extends JavaPlugin {

    public static TheBridgePlugin INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;
        Bukkit.getServer().getPluginManager().registerEvents(new TNTExplode(), this);
        Bukkit.getConsoleSender().sendMessage(Utils.translate("&a---------------------------------------"));
        Bukkit.getConsoleSender().sendMessage(Utils.translate("&aTheBridge plugin by Marius"));
        Bukkit.getConsoleSender().sendMessage(Utils.translate("&a---------------------------------------"));
    }
}
