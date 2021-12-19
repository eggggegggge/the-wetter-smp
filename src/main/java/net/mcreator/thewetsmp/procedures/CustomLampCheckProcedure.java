package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModBlocks;

public class CustomLampCheckProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (world instanceof Level _lvl_isPow ? _lvl_isPow.hasNeighborSignal(new BlockPos((int) x, (int) y, (int) z)) : false) {
			if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.RED_REDSTONE_LAMP) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TheWetSmpRehydratedModBlocks.LIT_RED_RESTONE_LAMP.defaultBlockState();
					world.setBlock(_bp, _bs, 3);
				}
			} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.ORANGE_REDSTONE_LAMP) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TheWetSmpRehydratedModBlocks.LIT_ORANGE_REDSTONE_LAMP.defaultBlockState();
					world.setBlock(_bp, _bs, 3);
				}
			} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.YELLOW_REDSTONE_LAMP) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TheWetSmpRehydratedModBlocks.LIT_YELLOW_REDSTONE_LAMP.defaultBlockState();
					world.setBlock(_bp, _bs, 3);
				}
			} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.LIME_REDSTONE_LAMP) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TheWetSmpRehydratedModBlocks.LIT_LIME_REDSTONE_LAMP.defaultBlockState();
					world.setBlock(_bp, _bs, 3);
				}
			} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.GREEN_REDSTONE_LAMP) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TheWetSmpRehydratedModBlocks.LIT_GREEN_REDSTONE_LAMP.defaultBlockState();
					world.setBlock(_bp, _bs, 3);
				}
			} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.LIGHT_BLUE_REDSTONE_LAMP) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TheWetSmpRehydratedModBlocks.LIT_LIGHT_BLUE_REDSTONE_LAMP.defaultBlockState();
					world.setBlock(_bp, _bs, 3);
				}
			} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.CYAN_REDSTONE_LAMP) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TheWetSmpRehydratedModBlocks.LIT_CYAN_REDSTONE_LAMP.defaultBlockState();
					world.setBlock(_bp, _bs, 3);
				}
			} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.BLUE_REDSTONE_LAMP) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TheWetSmpRehydratedModBlocks.LIT_BLUE_REDSTONE_LAMP.defaultBlockState();
					world.setBlock(_bp, _bs, 3);
				}
			} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.PURPLE_REDSTONE_LAMP) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TheWetSmpRehydratedModBlocks.LIT_PURPLE_REDSTONE_LAMP.defaultBlockState();
					world.setBlock(_bp, _bs, 3);
				}
			} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.MAGENTA_REDSTONE_LAMP) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TheWetSmpRehydratedModBlocks.LIT_MAGENTA_REDSTONE_LAMP.defaultBlockState();
					world.setBlock(_bp, _bs, 3);
				}
			} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.PINK_REDSTONE_LAMP) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TheWetSmpRehydratedModBlocks.LIT_PINK_REDSTONE_LAMP.defaultBlockState();
					world.setBlock(_bp, _bs, 3);
				}
			} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.WHITE_REDSTONE_LAMP) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TheWetSmpRehydratedModBlocks.LIT_WHITE_REDSTONE_LAMP.defaultBlockState();
					world.setBlock(_bp, _bs, 3);
				}
			} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.LIGHT_GREY_REDSTONE_LAMP) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TheWetSmpRehydratedModBlocks.LIT_LIGHT_GREY_REDSTONE_LAMP.defaultBlockState();
					world.setBlock(_bp, _bs, 3);
				}
			} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.GREY_REDSTONE_LAMP) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TheWetSmpRehydratedModBlocks.LIT_GREY_REDSTONE_LAMP.defaultBlockState();
					world.setBlock(_bp, _bs, 3);
				}
			} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.BLACK_REDSTONE_LAMP) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TheWetSmpRehydratedModBlocks.LIT_BLACK_REDSTONE_LAMP.defaultBlockState();
					world.setBlock(_bp, _bs, 3);
				}
			} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.BROWN_REDSTONE_LAMP) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TheWetSmpRehydratedModBlocks.LIT_BROWN_REDSTONE_LAMP.defaultBlockState();
					world.setBlock(_bp, _bs, 3);
				}
			} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.SEPIA_REDSTONE_LAMP) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TheWetSmpRehydratedModBlocks.LIT_SEPIA_REDSTONE_LAMP.defaultBlockState();
					world.setBlock(_bp, _bs, 3);
				}
			}
		} else {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
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
					if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.LIT_RED_RESTONE_LAMP) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = TheWetSmpRehydratedModBlocks.RED_REDSTONE_LAMP.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.LIT_ORANGE_REDSTONE_LAMP) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = TheWetSmpRehydratedModBlocks.ORANGE_REDSTONE_LAMP.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.LIT_YELLOW_REDSTONE_LAMP) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = TheWetSmpRehydratedModBlocks.YELLOW_REDSTONE_LAMP.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.LIT_LIME_REDSTONE_LAMP) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = TheWetSmpRehydratedModBlocks.LIME_REDSTONE_LAMP.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.LIT_GREEN_REDSTONE_LAMP) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = TheWetSmpRehydratedModBlocks.GREEN_REDSTONE_LAMP.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.LIT_LIGHT_BLUE_REDSTONE_LAMP) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = TheWetSmpRehydratedModBlocks.LIGHT_BLUE_REDSTONE_LAMP.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.LIT_CYAN_REDSTONE_LAMP) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = TheWetSmpRehydratedModBlocks.CYAN_REDSTONE_LAMP.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.LIT_BLUE_REDSTONE_LAMP) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = TheWetSmpRehydratedModBlocks.BLUE_REDSTONE_LAMP.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.LIT_PURPLE_REDSTONE_LAMP) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = TheWetSmpRehydratedModBlocks.PURPLE_REDSTONE_LAMP.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.LIT_MAGENTA_REDSTONE_LAMP) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = TheWetSmpRehydratedModBlocks.MAGENTA_REDSTONE_LAMP.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.LIT_PINK_REDSTONE_LAMP) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = TheWetSmpRehydratedModBlocks.PINK_REDSTONE_LAMP.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.LIT_WHITE_REDSTONE_LAMP) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = TheWetSmpRehydratedModBlocks.WHITE_REDSTONE_LAMP.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.LIT_LIGHT_GREY_REDSTONE_LAMP) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = TheWetSmpRehydratedModBlocks.LIGHT_GREY_REDSTONE_LAMP.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.LIT_GREY_REDSTONE_LAMP) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = TheWetSmpRehydratedModBlocks.GREY_REDSTONE_LAMP.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.LIT_BLACK_REDSTONE_LAMP) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = TheWetSmpRehydratedModBlocks.BLACK_REDSTONE_LAMP.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.LIT_BROWN_REDSTONE_LAMP) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = TheWetSmpRehydratedModBlocks.BROWN_REDSTONE_LAMP.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					} else if (blockstate.getBlock() == TheWetSmpRehydratedModBlocks.LIT_SEPIA_REDSTONE_LAMP) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = TheWetSmpRehydratedModBlocks.SEPIA_REDSTONE_LAMP.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 4);
		}
	}
}
