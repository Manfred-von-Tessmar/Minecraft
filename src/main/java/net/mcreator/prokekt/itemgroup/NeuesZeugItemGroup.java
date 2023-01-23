
package net.mcreator.prokekt.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.prokekt.item.SkyItem;
import net.mcreator.prokekt.ProkektModElements;

@ProkektModElements.ModElement.Tag
public class NeuesZeugItemGroup extends ProkektModElements.ModElement {
	public NeuesZeugItemGroup(ProkektModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabneues_zeug") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SkyItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
