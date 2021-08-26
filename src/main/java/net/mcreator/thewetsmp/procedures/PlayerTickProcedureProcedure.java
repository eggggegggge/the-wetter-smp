package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.thewetsmp.block.HotAirVentBlock;
import net.mcreator.thewetsmp.block.ColdAirVentBlock;
import net.mcreator.thewetsmp.TheWetSmpMod;

import java.util.Map;
import java.util.HashMap;

public class PlayerTickProcedureProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
				World world = entity.world;
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency entity for procedure PlayerTickProcedure!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency x for procedure PlayerTickProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency y for procedure PlayerTickProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency z for procedure PlayerTickProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency world for procedure PlayerTickProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		boolean bababooey = false;
		BlockState block = Blocks.AIR.getDefaultState();
		double checkVar = 0;
		double NS = 0;
		double EW = 0;
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).isElytraFlying() : false)) {
			if (((entity.getHorizontalFacing()) == Direction.SOUTH)) {
				NS = (double) 1;
				EW = (double) 0;
			} else if (((entity.getHorizontalFacing()) == Direction.NORTH)) {
				NS = (double) 1;
				EW = (double) 0;
			} else if (((entity.getHorizontalFacing()) == Direction.EAST)) {
				EW = (double) (-1);
				NS = (double) 0;
			} else if (((entity.getHorizontalFacing()) == Direction.WEST)) {
				EW = (double) (-1);
				NS = (double) 0;
			}
			checkVar = (double) (-1);
			bababooey = (boolean) (false);
			while ((bababooey == (false))) {
				if ((checkVar < 17)) {
					checkVar = (double) (checkVar + 1);
				} else {
					checkVar = (double) (-1);
					break;
				}
				if ((((world.getBlockState(new BlockPos((int) (x + NS), (int) (y - checkVar), (int) (z + EW)))).getBlock() == HotAirVentBlock.block)
						|| ((world.getBlockState(new BlockPos((int) (x + NS), (int) (y - checkVar), (int) (z + EW))))
								.getBlock() == ColdAirVentBlock.block))) {
					if (((world.getBlockState(new BlockPos((int) (x + NS), (int) (y - checkVar), (int) (z + EW))))
							.getBlock() == HotAirVentBlock.block)) {
						block = HotAirVentBlock.block.getDefaultState();
						entity.setMotion((entity.getMotion().getX()), 1, (entity.getMotion().getZ()));
						bababooey = (boolean) (true);
						break;
					} else {
						block = ColdAirVentBlock.block.getDefaultState();
						entity.setMotion((entity.getMotion().getX()), (-0.5), (entity.getMotion().getZ()));
						bababooey = (boolean) (true);
						break;
					}
				} else if (((world.getBlockState(new BlockPos((int) (x + NS), (int) (y - checkVar), (int) (z + EW)))).getBlock() == Blocks.AIR)) {
					continue;
				} else {
					break;
				}
			}
		}
	}
}
