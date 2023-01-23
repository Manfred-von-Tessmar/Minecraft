
package net.mcreator.prokekt.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.prokekt.block.MorphXBlock;

@Mod.EventBusSubscriber
public class MorphxxFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == MorphXBlock.block.asItem())
			event.setBurnTime(1600);
	}
}
