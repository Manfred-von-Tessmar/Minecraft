
package net.mcreator.prokekt.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.FishingRodItem;

import net.mcreator.prokekt.ProkektModElements;

@ProkektModElements.ModElement.Tag
public class WaffeItem extends ProkektModElements.ModElement {
	@ObjectHolder("prokekt:waffe")
	public static final Item block = null;
	public WaffeItem(ProkektModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
		}.setRegistryName("waffe"));
	}
	private static class ItemToolCustom extends FishingRodItem {
		protected ItemToolCustom() {
			super(new Item.Properties().group(ItemGroup.TOOLS).maxDamage(100));
		}

		@Override
		public int getItemEnchantability() {
			return 2;
		}
	}
}
