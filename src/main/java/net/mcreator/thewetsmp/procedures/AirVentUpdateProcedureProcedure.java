package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModParticles;
import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModBlocks;

import java.util.Map;

public class AirVentUpdateProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TheWetSmpRehydratedModBlocks.HOT_AIR_VENT) {
			if ((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getBlock() == Blocks.MAGMA_BLOCK
					&& (world instanceof Level _lvl_isPow ? _lvl_isPow.hasNeighborSignal(new BlockPos((int) x, (int) y, (int) z)) : false)) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(TheWetSmpRehydratedModParticles.HOT_AIR, (x + 0.5), y, (z + 0.5), 10, 0.2, 0.8, 0.2, 0);
			} else {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TheWetSmpRehydratedModBlocks.AIR_VENT.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TheWetSmpRehydratedModBlocks.COLD_AIR_VENT) {
			if ((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getBlock() == Blocks.ICE
					&& (world instanceof Level _lvl_isPow ? _lvl_isPow.hasNeighborSignal(new BlockPos((int) x, (int) y, (int) z)) : false)) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(TheWetSmpRehydratedModParticles.HOT_AIR, (x + 0.5), y, (z + 0.5), 10, 0.2, 0.8, 0.2, 0);
			} else {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TheWetSmpRehydratedModBlocks.AIR_VENT.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
	}
}
