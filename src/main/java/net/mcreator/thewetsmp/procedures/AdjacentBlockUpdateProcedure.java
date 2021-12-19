package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModBlocks;

import java.util.Map;

public class AdjacentBlockUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.SEPIA_CARPET || blockstate.getBlock() == TheWetSmpRehydratedModBlocks.SEA_URCHIN) {
			if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR
					|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.VOID_AIR
					|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.CAVE_AIR) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level,
							4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ air destroy");
			}
		} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.SEPIA_CONCRETE_POWDER) {
			if ((world.getFluidState(new BlockPos((int) x, (int) y, (int) (z + 1))).createLegacyBlock()).getBlock() == Blocks.WATER
					|| (world.getFluidState(new BlockPos((int) x, (int) y, (int) (z - 1))).createLegacyBlock()).getBlock() == Blocks.WATER
					|| (world.getFluidState(new BlockPos((int) (x + 1), (int) y, (int) z)).createLegacyBlock()).getBlock() == Blocks.WATER
					|| (world.getFluidState(new BlockPos((int) (x - 1), (int) y, (int) z)).createLegacyBlock()).getBlock() == Blocks.WATER
					|| (world.getFluidState(new BlockPos((int) x, (int) (y + 1), (int) z)).createLegacyBlock()).getBlock() == Blocks.WATER
					|| (world.getFluidState(new BlockPos((int) x, (int) (y - 1), (int) z)).createLegacyBlock()).getBlock() == Blocks.WATER) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TheWetSmpRehydratedModBlocks.SEPIA_CONCRETE.defaultBlockState();
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
