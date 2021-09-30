
package net.mcreator.thewetsmp.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thewetsmp.procedures.PistonBootsJumpProcedure;
import net.mcreator.thewetsmp.TheWetSmpRehydratedModElements;

import java.util.Map;
import java.util.HashMap;

@TheWetSmpRehydratedModElements.ModElement.Tag
public class ChainmailPistonBootsItem extends TheWetSmpRehydratedModElements.ModElement {
	@ObjectHolder("the_wet_smp_rehydrated:chainmail_piston_helmet")
	public static final Item helmet = null;
	@ObjectHolder("the_wet_smp_rehydrated:chainmail_piston_chestplate")
	public static final Item body = null;
	@ObjectHolder("the_wet_smp_rehydrated:chainmail_piston_leggings")
	public static final Item legs = null;
	@ObjectHolder("the_wet_smp_rehydrated:chainmail_piston_boots")
	public static final Item boots = null;
	public ChainmailPistonBootsItem(TheWetSmpRehydratedModElements instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_chain"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.IRON_INGOT));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "chainmail_piston";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.TRANSPORTATION)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "the_wet_smp_rehydrated:textures/models/armor/chainmail_piston_boots_armour__layer_"
						+ (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					PistonBootsJumpProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("chainmail_piston_boots"));
	}
}
