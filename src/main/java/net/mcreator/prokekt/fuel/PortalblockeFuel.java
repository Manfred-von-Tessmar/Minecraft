
package net.mcreator.prokekt.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.prokekt.block.PortalblockBlock;

@Mod.EventBusSubscriber
public class PortalblockeFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == PortalblockBlock.block.asItem())
			event.setBurnTime(1600);
	}
}
