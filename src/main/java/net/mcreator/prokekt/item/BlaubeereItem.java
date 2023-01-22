
package net.mcreator.prokekt.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.prokekt.ProkektModElements;

@ProkektModElements.ModElement.Tag
public class BlaubeereItem extends ProkektModElements.ModElement {
	@ObjectHolder("prokekt:blaubeere")
	public static final Item block = null;
	public BlaubeereItem(ProkektModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(16).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(1f).build()));
			setRegistryName("blaubeere");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
