
package org.flames.bukkit.flatearth;

import java.util.logging.Logger;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.World;

public class MyPlayerListener extends PlayerListener {
	private final BedrockGapInsurance plugin;
	protected static final Logger log = Logger.getLogger("Minecraft");
	
	public MyPlayerListener(BedrockGapInsurance instance) {
		plugin = instance;
	}
	
	public void onPlayerMove(PlayerMoveEvent event) {
            Player player = event.getPlayer();
            World world = player.getWorld();

            int x = player.getLocation().getBlockX();
            int z = player.getLocation().getBlockZ();

            for (int i = x - BedrockGapInsurance.CheckRadius; i < x + BedrockGapInsurance.CheckRadius + 1; i++) {
              for (int j = z - BedrockGapInsurance.CheckRadius - 1; j < z + BedrockGapInsurance.CheckRadius; j++) {
            	  if (world.getBlockAt(i, 0, j).getTypeId() != 7) world.getBlockAt(i, 0, j).setTypeId(7);

                  if (world.getBlockAt(i, 1, j).getTypeId() == 7) world.getBlockAt(i, 1, j).setTypeId(1);
                  if (world.getBlockAt(i, 2, j).getTypeId() == 7) world.getBlockAt(i, 2, j).setTypeId(1);
                  if (world.getBlockAt(i, 3, j).getTypeId() == 7) world.getBlockAt(i, 3, j).setTypeId(1);
                  if (world.getBlockAt(i, 4, j).getTypeId() == 7) world.getBlockAt(i, 4, j).setTypeId(1);
              }
            }
        
    }
}