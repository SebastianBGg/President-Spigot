package Me.Sebbe.President.Commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class PresidentCommand implements CommandExecutor{
	public ArrayList<Player> election = new ArrayList<Player>();
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
	    if(command.getName().equalsIgnoreCase("president")) {
	        if (args.length == 1) {
	            Player target = Bukkit.getPlayer(args[0]);
	            if (target != null) {
	            	if(!election.contains(target)) {
		            	election.add(target);
		            	sender.sendMessage("Added player to election");
		            	return true;
	            	} else { 
	            		sender.sendMessage("Player already elected");
	            		return false;
	            	}
	                
	            } else {
	                sender.sendMessage("Player not found.");
	                return false;
	            }
	        } else {
	            sender.sendMessage("Usage: /president <player>");
	            return false;
	        }
	    }
	    return false;
	}
	
}
