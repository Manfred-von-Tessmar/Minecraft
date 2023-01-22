
package net.mcreator.prokekt.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.prokekt.block.PokeboalblockBlock;
import net.mcreator.prokekt.ProkektModElements;

@ProkektModElements.ModElement.Tag
public class SchwammspitzhackeItem extends ProkektModElements.ModElement {
	@ObjectHolder("prokekt:schwammspitzhacke")
	public static final Item block = null;
	public SchwammspitzhackeItem(ProkektModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PokeboalblockBlock.block));
			}
		}, 1, 1f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("schwammspitzhacke"));
	}
}
