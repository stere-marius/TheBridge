package ro.marius.thebridge;

import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface ISubCommand {

    void onCommand(CommandSender sender, String[] args);

    List<String> tabComplete(@NotNull CommandSender sender, @NotNull String[] args);

}
