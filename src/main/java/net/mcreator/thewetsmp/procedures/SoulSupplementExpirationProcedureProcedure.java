package net.mcreator.thewetsmp.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thewetsmp.potion.SoulSubductionPotionEffect;
import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

import java.util.Map;
import java.util.Collection;

public class SoulSupplementExpirationProcedureProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency entity for procedure SoulSupplementExpirationProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == SoulSubductionPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"attribute @s minecraft:generic.max_health base set 16");
				}
			}
		} else {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"attribute @s minecraft:generic.max_health base set 20");
				}
			}
		}
	}
}
