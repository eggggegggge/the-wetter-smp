package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.state.Property;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.thewetsmp.particle.HotAirParticle;
import net.mcreator.thewetsmp.block.HotAirVentBlock;
import net.mcreator.thewetsmp.block.ColdAirVentBlock;
import net.mcreator.thewetsmp.block.AirVentBlock;
import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

import java.util.Map;

public class AirVentUpdateProcedureProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency x for procedure AirVentUpdateProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency y for procedure AirVentUpdateProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency z for procedure AirVentUpdateProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency world for procedure AirVentUpdateProcedure!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == HotAirVentBlock.block)) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getBlock() == Blocks.MAGMA_BLOCK)
					&& ((world instanceof World) ? ((World) world).isBlockPowered(new BlockPos((int) x, (int) y, (int) z)) : false))) {
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(HotAirParticle.particle, (x + 0.5), y, (z + 0.5), (int) 10, 0.2, 0.8, 0.2, 0);
				}
			} else {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = AirVentBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ColdAirVentBlock.block)) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getBlock() == Blocks.ICE)
					&& ((world instanceof World) ? ((World) world).isBlockPowered(new BlockPos((int) x, (int) y, (int) z)) : false))) {
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(HotAirParticle.particle, (x + 0.5), y, (z + 0.5), (int) 10, 0.2, 0.8, 0.2, 0);
				}
			} else {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = AirVentBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			}
		}
	}
}
