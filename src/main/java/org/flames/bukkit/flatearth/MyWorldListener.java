
/*package org.flames.bukkit.flatearth;

import java.util.logging.Logger;

import org.bukkit.World;
import org.bukkit.Chunk;
import org.bukkit.event.world.WorldListener;
import org.bukkit.event.world.ChunkLoadEvent;

public class MyWorldListener extends WorldListener {
	private final BedrockGapInsurance plugin;
	protected static final Logger log = Logger.getLogger("Minecraft");
	
	public MyWorldListener(BedrockGapInsurance instance) {
		plugin = instance;
	}
	
	public void onChunkLoaded(ChunkLoadEvent event) {
            Chunk chunk = event.getChunk(); //north-west / top-left
            World world = chunk.getWorld();

            for (int x = chunk.getX()*16; x < (chunk.getX()+1)*16; x++) {
            	for (int y = chunk.getX()*16; y < (chunk.getX()+1)*16; y++) {
            		if (world.getBlockAt(x, 0, y).getTypeId() != 7) world.getBlockAt(x, 0, y).setTypeId(7);

                    if (world.getBlockAt(x, 1, y).getTypeId() == 7) world.getBlockAt(x, 1, y).setTypeId(1);
                    if (world.getBlockAt(x, 2, y).getTypeId() == 7) world.getBlockAt(x, 2, y).setTypeId(1);
                    if (world.getBlockAt(x, 3, y).getTypeId() == 7) world.getBlockAt(x, 3, y).setTypeId(1);
                    if (world.getBlockAt(x, 4, y).getTypeId() == 7) world.getBlockAt(x, 4, y).setTypeId(1);
            	}
            }

    }
}*/