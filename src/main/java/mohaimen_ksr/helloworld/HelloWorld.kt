package mohaimen_ksr.helloworld

import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin

class HelloWorld : JavaPlugin() {
    var mec = "くさい"
    override fun onEnable() {
        // Plugin startup logic
        println("MECえろい")
        getCommand("h")?.setExecutor(hcommand)
    }

    override fun onDisable() {
        // Plugin shutdown logic
        println("MEC$mec")
    }
}