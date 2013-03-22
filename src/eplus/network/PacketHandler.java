package eplus.network;

import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;
import eplus.EnchantingPlus;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;

/**
 * Enchanting Plus
 *
 * @user odininon
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class PacketHandler implements IPacketHandler
{
    {
        EnchantingPlus.log.info("Initializing Packet Handler.");
    }

    @Override
    public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player)
    {

    }
}
