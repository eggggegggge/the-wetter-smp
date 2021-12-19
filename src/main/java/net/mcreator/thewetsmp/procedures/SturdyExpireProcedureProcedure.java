package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.entity.Entity;

public class SturdyExpireProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"/attribute @p minecraft:generic.knockback_resistance base set 0");
		}
	}
}
