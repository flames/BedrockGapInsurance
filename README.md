Plugin for bukkit & craftbukkit (Minecraft Server Mod). Fills in bedrock voids on level 0 and converts bedrock to stone on levels 1-4 (Flat bedrock)

download bedrockgapinsurance.jar, put into plugin folder of your craftbukkit server, enjoy!
no configuration needed, plugin is active by default.
this version reflects the old behaviour like with hmod, it flattens and closes holes in bedrock onPlayerMove in a specified radius. the default radius is 8 blocks.
if you want to change the value, set it in plugins/bedrockgapinsurance/configuration.yml to what ever value you like, but beware, dont set the radius too high!
i dont suggest to use values more than 16

disabled worldlistener/onchunkloaded until bukkit fixes the behaviour
toadd: as soon as bukkit supports loadedChunks flatting bedrock at server/plugin start will be added, in addition onChunkLoaded will ftlat bedrock on new chunks while playing
