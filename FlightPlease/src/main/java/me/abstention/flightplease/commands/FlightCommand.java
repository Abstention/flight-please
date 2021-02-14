package me.abstention.flightplease.commands;

import me.abstention.flightplease.FlightPlease;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class FlightCommand implements CommandExecutor {

    Plugin plugin = FlightPlease.getPlugin(FlightPlease.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.hasPermission("flightplease.fly")){
                if(player.getAllowFlight()) {
                    player.setAllowFlight(false);
                    String FlightDisableMessage = plugin.getConfig().getString("FlightDisableMessage");
                    assert FlightDisableMessage != null;
                    player.sendMessage(FlightDisableMessage);
                }
                else {
                    player.setAllowFlight(true);
                    String FlightEnableMessage = plugin.getConfig().getString("FlightEnableMessage");
                    assert FlightEnableMessage != null;
                    player.sendMessage(FlightEnableMessage);
                }
            }else{
                player.sendMessage(ChatColor.RED + "You do not have the required permissions.");
            }
        }
        else {
            System.out.println("Only players can do this command!");
        }
        return false;
    }
}
