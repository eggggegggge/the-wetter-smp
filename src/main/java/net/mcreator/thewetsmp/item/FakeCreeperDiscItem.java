
package net.mcreator.thewetsmp.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModSounds;

public class FakeCreeperDiscItem extends RecordItem {
	public FakeCreeperDiscItem() {
		super(0, TheWetSmpRehydratedModSounds.REGISTRY.get(new ResourceLocation("the_wet_smp_rehydrated:disc.troll")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("fake_creeper_disc");
	}
}
