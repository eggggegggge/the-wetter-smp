package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModItems;

public class PistonBootsJumpProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == TheWetSmpRehydratedModItems.LEATHER_PISTON_BOOTS
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == TheWetSmpRehydratedModItems.NETHERITE_PISTON_BOOTS
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == TheWetSmpRehydratedModItems.IRON_PISTON_BOOTS
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == TheWetSmpRehydratedModItems.GOLDEN_PISTON_BOOTS
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == TheWetSmpRehydratedModItems.DIAMOND_PISTON_BOOTS
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == TheWetSmpRehydratedModItems.CHAINMAIL_PISTON_BOOTS) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 1, 1, (false), (false)));
		}
	}
}
