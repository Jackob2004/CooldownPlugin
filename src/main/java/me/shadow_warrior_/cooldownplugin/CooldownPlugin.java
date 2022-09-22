package me.shadow_warrior_.cooldownplugin;

import me.shadow_warrior_.cooldownplugin.commands.CoolCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class CooldownPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("cool").setExecutor(new CoolCommand());

    }


}
