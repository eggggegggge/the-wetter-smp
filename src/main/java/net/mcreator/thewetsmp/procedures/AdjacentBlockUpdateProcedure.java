package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.state.Property;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.thewetsmp.block.SepiaConcretePowderBlock;
import net.mcreator.thewetsmp.block.SepiaConcreteBlock;
import net.mcreator.thewetsmp.block.SepiaCarpetBlock;
import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

import java.util.Map;

public class AdjacentBlockUpdateProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("blockstate") == null) {
			if (!dependencies.containsKey("blockstate"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency blockstate for procedure AdjacentBlockUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency x for procedure AdjacentBlockUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency y for procedure AdjacentBlockUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency z for procedure AdjacentBlockUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency world for procedure AdjacentBlockUpdate!");
			return;
		}
		BlockState blockstate = (BlockState) dependencies.get("blockstate");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((blockstate.getBlock() == SepiaCarpetBlock.block)) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR)
					|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.VOID_AIR)
							|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.CAVE_AIR)))) {
				if (world instanceof ServerWorld) {
					((World) world).getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
							"setblock ~ ~ ~ air destroy");
				}
			}
		} else if ((blockstate.getBlock() == SepiaConcretePowderBlock.block)) {
			if (((((world.getFluidState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlockState()).getBlock() == Blocks.WATER)
					|| ((world.getFluidState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlockState()).getBlock() == Blocks.WATER))
					|| ((((world.getFluidState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlockState()).getBlock() == Blocks.WATER)
							|| ((world.getFluidState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlockState()).getBlock() == Blocks.WATER))
							|| (((world.getFluidState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlockState()).getBlock() == Blocks.WATER)
									|| ((world.getFluidState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlockState())
											.getBlock() == Blocks.WATER))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = SepiaConcreteBlock.block.getDefaultState();
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
