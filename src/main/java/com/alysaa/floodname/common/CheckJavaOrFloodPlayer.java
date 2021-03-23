package com.alysaa.floodname.common;

import com.alysaa.floodname.FloodNamer;
import org.geysermc.connector.GeyserConnector;
import org.geysermc.floodgate.FloodgateAPI;

import java.util.UUID;

public class CheckJavaOrFloodPlayer {
    /**
     * Determines if a player is from Bedrock
     * @param uuid the UUID to determine
     * @return true if the player is from Bedrock
     */
    public static boolean isBedrockPlayer(UUID uuid) {
        if (!FloodNamer.plugin.getConfig().getBoolean("Enable-NickNames")){
            return GeyserConnector.getInstance().getPlayerByUuid(uuid) != null;
        } else {
            return FloodgateAPI.isBedrockPlayer(uuid);
        }
    }
}
