package me.abstention.flightplease.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlightCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.hasPermission("flightplease.fly")){
                if(player.getAllowFlight()) {
                    player.setAllowFlight(false);
                    player.sendMessage(ChatColor.RED + "Flight has been disabled.");
                }
                else {
                    player.setAllowFlight(true);
                    player.sendMessage(ChatColor.GOLD + "Flight has been enabled.");
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
