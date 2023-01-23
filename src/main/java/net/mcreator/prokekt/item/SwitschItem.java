
package net.mcreator.prokekt.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.prokekt.itemgroup.NeuesZeugItemGroup;
import net.mcreator.prokekt.ProkektModElements;

@ProkektModElements.ModElement.Tag
public class SwitschItem extends ProkektModElements.ModElement {
	@ObjectHolder("prokekt:switsch")
	public static final Item block = null;
	public SwitschItem(ProkektModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(NeuesZeugItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("switsch");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
