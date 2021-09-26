package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;

import net.mcreator.thewetsmp.block.YellowRedstoneLampBlock;
import net.mcreator.thewetsmp.block.WhiteRedstoneLampBlock;
import net.mcreator.thewetsmp.block.SepiaRedstoneLampBlock;
import net.mcreator.thewetsmp.block.RedRedstoneLampBlock;
import net.mcreator.thewetsmp.block.PurpleRedstoneLampBlock;
import net.mcreator.thewetsmp.block.PinkRedstoneLampBlock;
import net.mcreator.thewetsmp.block.OrangeRedstoneLampBlock;
import net.mcreator.thewetsmp.block.MagentaRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitYellowRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitWhiteRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitSepiaRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitRedRestoneLampBlock;
import net.mcreator.thewetsmp.block.LitPurpleRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitPinkRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitOrangeRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitMagentaRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitLimeRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitLightGreyRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitLightBlueRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitGreyRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitGreenRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitCyanRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitBrownRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitBlueRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LitBlackRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LimeRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LightGreyRedstoneLampBlock;
import net.mcreator.thewetsmp.block.LightBlueRedstoneLampBlock;
import net.mcreator.thewetsmp.block.GreyRedstoneLampBlock;
import net.mcreator.thewetsmp.block.GreenRedstoneLampBlock;
import net.mcreator.thewetsmp.block.CyanRedstoneLampBlock;
import net.mcreator.thewetsmp.block.BrownRedstoneLampBlock;
import net.mcreator.thewetsmp.block.BlueRedstoneLampBlock;
import net.mcreator.thewetsmp.block.BlackRedstoneLampBlock;
import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

import java.util.Map;

public class CustomLampCheckProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("blockstate") == null) {
			if (!dependencies.containsKey("blockstate"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency blockstate for procedure CustomLampCheck!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency x for procedure CustomLampCheck!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency y for procedure CustomLampCheck!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency z for procedure CustomLampCheck!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency world for procedure CustomLampCheck!");
			return;
		}
		BlockState blockstate = (BlockState) dependencies.get("blockstate");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world instanceof World) ? ((World) world).isBlockPowered(new BlockPos((int) x, (int) y, (int) z)) : false)) {
			if ((blockstate.getBlock() == RedRedstoneLampBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LitRedRestoneLampBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((blockstate.getBlock() == OrangeRedstoneLampBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LitOrangeRedstoneLampBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((blockstate.getBlock() == YellowRedstoneLampBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LitYellowRedstoneLampBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((blockstate.getBlock() == LimeRedstoneLampBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LitLimeRedstoneLampBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((blockstate.getBlock() == GreenRedstoneLampBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LitGreenRedstoneLampBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((blockstate.getBlock() == LightBlueRedstoneLampBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LitLightBlueRedstoneLampBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((blockstate.getBlock() == CyanRedstoneLampBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LitCyanRedstoneLampBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((blockstate.getBlock() == BlueRedstoneLampBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LitBlueRedstoneLampBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((blockstate.getBlock() == PurpleRedstoneLampBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LitPurpleRedstoneLampBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((blockstate.getBlock() == MagentaRedstoneLampBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LitMagentaRedstoneLampBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((blockstate.getBlock() == PinkRedstoneLampBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LitPinkRedstoneLampBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((blockstate.getBlock() == WhiteRedstoneLampBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LitWhiteRedstoneLampBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((blockstate.getBlock() == LightGreyRedstoneLampBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LitLightGreyRedstoneLampBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((blockstate.getBlock() == GreyRedstoneLampBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LitGreyRedstoneLampBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((blockstate.getBlock() == BlackRedstoneLampBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LitBlackRedstoneLampBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((blockstate.getBlock() == BrownRedstoneLampBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LitBrownRedstoneLampBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((blockstate.getBlock() == SepiaRedstoneLampBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = LitSepiaRedstoneLampBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			}
		} else {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private IWorld world;
				public void start(IWorld world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if ((blockstate.getBlock() == LitRedRestoneLampBlock.block)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = RedRedstoneLampBlock.block.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else if ((blockstate.getBlock() == LitOrangeRedstoneLampBlock.block)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = OrangeRedstoneLampBlock.block.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else if ((blockstate.getBlock() == LitYellowRedstoneLampBlock.block)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = YellowRedstoneLampBlock.block.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else if ((blockstate.getBlock() == LitLimeRedstoneLampBlock.block)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = LimeRedstoneLampBlock.block.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else if ((blockstate.getBlock() == LitGreenRedstoneLampBlock.block)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = GreenRedstoneLampBlock.block.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else if ((blockstate.getBlock() == LitLightBlueRedstoneLampBlock.block)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = LightBlueRedstoneLampBlock.block.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else if ((blockstate.getBlock() == LitCyanRedstoneLampBlock.block)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = CyanRedstoneLampBlock.block.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else if ((blockstate.getBlock() == LitBlueRedstoneLampBlock.block)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = BlueRedstoneLampBlock.block.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else if ((blockstate.getBlock() == LitPurpleRedstoneLampBlock.block)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = PurpleRedstoneLampBlock.block.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else if ((blockstate.getBlock() == LitMagentaRedstoneLampBlock.block)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = MagentaRedstoneLampBlock.block.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else if ((blockstate.getBlock() == LitPinkRedstoneLampBlock.block)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = PinkRedstoneLampBlock.block.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else if ((blockstate.getBlock() == LitWhiteRedstoneLampBlock.block)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = WhiteRedstoneLampBlock.block.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else if ((blockstate.getBlock() == LitLightGreyRedstoneLampBlock.block)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = LightGreyRedstoneLampBlock.block.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else if ((blockstate.getBlock() == LitGreyRedstoneLampBlock.block)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = GreyRedstoneLampBlock.block.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else if ((blockstate.getBlock() == LitBlackRedstoneLampBlock.block)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = BlackRedstoneLampBlock.block.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else if ((blockstate.getBlock() == LitBrownRedstoneLampBlock.block)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = BrownRedstoneLampBlock.block.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else if ((blockstate.getBlock() == LitSepiaRedstoneLampBlock.block)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = SepiaRedstoneLampBlock.block.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 4);
		}
	}
}
