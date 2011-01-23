
package org.flames.bukkit.flatearth;

import java.io.File;

import java.util.logging.Logger;

import org.bukkit.event.Event;
import org.bukkit.event.Event.Priority;
import org.bukkit.Server;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginLoader;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.util.config.Configuration;

public class BedrockGapInsurance extends JavaPlugin {
	private final MyPlayerListener playerListener = new MyPlayerListener(this);
	//private final MyWorldListener worldListener = new MyWorldListener(this);
	
	public static int CheckRadius;
	protected static final Logger log = Logger.getLogger("Minecraft");
	PluginDescriptionFile pdfFile = this.getDescription();
	
	public BedrockGapInsurance(PluginLoader pluginLoader, Server instance, PluginDescriptionFile desc, File folder, File plugin, ClassLoader cLoader) {
        super(pluginLoader, instance, desc, folder, plugin, cLoader);
    }

	  public void onDisable() {
		  log.info( pdfFile.getName() + " version " + pdfFile.getVersion() + " is disabled!" );
	  }

	  public void onEnable() {
            log.info( pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled!" );

            PluginManager pm = getServer().getPluginManager();
            pm.registerEvent(Event.Type.PLAYER_MOVE, playerListener, Priority.Normal, this);
            //pm.registerEvent(Event.Type.CHUNK_LOADED, worldListener, Priority.Normal, this);
            
            Configuration configuration = new Configuration(new File(this.getDataFolder(), "configuration.yml"));
    		configuration.load();
            CheckRadius = configuration.getInt("radius", 8);
      }
}
