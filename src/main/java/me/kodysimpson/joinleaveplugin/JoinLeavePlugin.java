package me.kodysimpson.joinleaveplugin;

import me.kodysimpson.joinleaveplugin.listeners.JoinLeaveListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class JoinLeavePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
    }

}
