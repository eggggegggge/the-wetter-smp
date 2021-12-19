package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.thewetsmp.init.TheWetSmpRehydratedModBlocks;

public class BufferOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean latency = false;
		boolean no = false;
		if (!((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "cooldown")) == true)) {
			if ((entity.getDisplayName().getString()).equals(new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "owner"))) {
				if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
						.getBlock() == TheWetSmpRehydratedModBlocks.AQUAMARINE_GLASS) {
					if ((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z)))
							.getBlock() == TheWetSmpRehydratedModBlocks.AQUAMARINE_GLASS) {
						if ((new Object() {
							public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "latencyLoaded")) == false) {
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putBoolean("latencyLoaded", (true));
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putBoolean("latencyLoaded", (true));
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos((int) x, (int) (y - 2), (int) z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putBoolean("latencyLoaded", (true));
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (world instanceof Level _level)
								_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, x, y, z,
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_wet_smp_rehydrated:buffer.new_latency")),
										SoundSource.NEUTRAL, (float) 0.1, 1);
							Y4StoreInfoProcedure.execute(world, x, y, z);
							Y3StoreInfoProcedure.execute(world, x, y, z);
							Y2StoreInfoProcedure.execute(world, x, y, z);
							Y1StoreInfoProcedure.execute(world, x, y, z);
							Y0StoreInfoProcedure.execute(world, x, y, z);
							YN1StoreInfoProcedure.execute(world, x, y, z);
							YN2StoreInfoProcedure.execute(world, x, y, z);
							YN3StoreInfoProcedure.execute(world, x, y, z);
							YN4StoreInfoProcedure.execute(world, x, y, z);
							ZN3StoreInfoProcedure.execute(world, x, y, z);
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putBoolean("cooldown", (true));
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putBoolean("cooldown", (true));
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos((int) x, (int) (y - 2), (int) z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putBoolean("cooldown", (true));
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
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
									if (!world.isClientSide()) {
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										BlockEntity _blockEntity = world.getBlockEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_blockEntity != null)
											_blockEntity.getTileData().putBoolean("cooldown", (false));
										if (world instanceof Level _level)
											_level.sendBlockUpdated(_bp, _bs, _bs, 3);
									}
									if (!world.isClientSide()) {
										BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
										BlockEntity _blockEntity = world.getBlockEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_blockEntity != null)
											_blockEntity.getTileData().putBoolean("cooldown", (false));
										if (world instanceof Level _level)
											_level.sendBlockUpdated(_bp, _bs, _bs, 3);
									}
									if (world instanceof Level _level)
										_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, x, y, z,
												ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.chime")),
												SoundSource.NEUTRAL, 1, 1);
									if (!world.isClientSide()) {
										BlockPos _bp = new BlockPos((int) x, (int) (y - 2), (int) z);
										BlockEntity _blockEntity = world.getBlockEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_blockEntity != null)
											_blockEntity.getTileData().putBoolean("cooldown", (false));
										if (world instanceof Level _level)
											_level.sendBlockUpdated(_bp, _bs, _bs, 3);
									}
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, 160);
						} else {
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putBoolean("latencyLoaded", (false));
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putBoolean("latencyLoaded", (false));
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos((int) x, (int) (y - 2), (int) z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putBoolean("latencyLoaded", (false));
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (world instanceof Level _level)
								_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, x, y, z,
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_wet_smp_rehydrated:buffer.latency")),
										SoundSource.NEUTRAL, (float) 0.1, 1);
							BuildLatencyProcedure.execute(world, x, y, z);
							BuildLatency2Procedure.execute(world, x, y, z);
							BuildLatency3Procedure.execute(world, x, y, z);
							BuildLatency4Procedure.execute(world, x, y, z);
							BuildLatency5Procedure.execute(world, x, y, z);
							BuildLatency6Procedure.execute(world, x, y, z);
							BuildLatency7Procedure.execute(world, x, y, z);
							BuildLatency8Procedure.execute(world, x, y, z);
							BuildLatency9Procedure.execute(world, x, y, z);
							BuildLatency10Procedure.execute(world, x, y, z);
						}
					}
				}
			}
		} else {
			if (world instanceof Level _level)
				_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, x, y, z,
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.chest.locked")), SoundSource.NEUTRAL, 1, 1);
		}
	}
}
