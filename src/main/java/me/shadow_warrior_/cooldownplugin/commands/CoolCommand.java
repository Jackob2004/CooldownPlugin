package me.shadow_warrior_.cooldownplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class CoolCommand implements CommandExecutor {
    private final HashMap<UUID, Long> cooldown;
    public CoolCommand(){
        this.cooldown = new HashMap<>();
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;

            if (!this.cooldown.containsKey(player.getUniqueId()) || System.currentTimeMillis() - cooldown.get(player.getUniqueId()) >= 10000 ){
                this.cooldown.put(player.getUniqueId(), System.currentTimeMillis());
                player.sendMessage("You are cool");
            }else   player.sendMessage("You have to wait: " + (10000 - (System.currentTimeMillis() - cooldown.get(player.getUniqueId()))) + " to use this command again");

            }

        return true;
    }
}
