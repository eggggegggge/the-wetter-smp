package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.entity.Entity;

public class PushbackExpirationProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"attribute @s minecraft:generic.attack_knockback base set 0");
		}
	}
}
