package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.thewetsmp.block.AquamarineGlassBlock;
import net.mcreator.thewetsmp.TheWetSmpMod;

import java.util.Map;
import java.util.HashMap;

public class BufferOnBlockRightClickedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency entity for procedure BufferOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency x for procedure BufferOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency y for procedure BufferOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency z for procedure BufferOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency world for procedure BufferOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		boolean latency = false;
		boolean no = false;
		if ((!((new Object() {
			public boolean getValue(IWorld world, BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "cooldown")) == (true)))) {
			if ((((entity.getDisplayName().getString())).equals((new Object() {
				public String getValue(IWorld world, BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "owner"))))) {
				if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == AquamarineGlassBlock.block)) {
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getBlock() == AquamarineGlassBlock.block)) {
						if (((new Object() {
							public boolean getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "latencyLoaded")) == (false))) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("latencyLoaded", (true));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("latencyLoaded", (true));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) (y - 2), (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("latencyLoaded", (true));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("the_wet_smp:buffer.new_latency")),
										SoundCategory.NEUTRAL, (float) 0.1, (float) 1);
							} else {
								((World) world).playSound(x, y, z,
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("the_wet_smp:buffer.new_latency")),
										SoundCategory.NEUTRAL, (float) 0.1, (float) 1, false);
							}
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								Y4StoreInfoProcedure.executeProcedure($_dependencies);
							}
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								Y3StoreInfoProcedure.executeProcedure($_dependencies);
							}
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								Y2StoreInfoProcedure.executeProcedure($_dependencies);
							}
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								Y1StoreInfoProcedure.executeProcedure($_dependencies);
							}
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								Y0StoreInfoProcedure.executeProcedure($_dependencies);
							}
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								YN1StoreInfoProcedure.executeProcedure($_dependencies);
							}
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								YN2StoreInfoProcedure.executeProcedure($_dependencies);
							}
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								YN3StoreInfoProcedure.executeProcedure($_dependencies);
							}
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								YN4StoreInfoProcedure.executeProcedure($_dependencies);
							}
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								ZN3StoreInfoProcedure.executeProcedure($_dependencies);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("cooldown", (true));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("cooldown", (true));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) (y - 2), (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("cooldown", (true));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
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
									if (!world.isRemote()) {
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										TileEntity _tileEntity = world.getTileEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_tileEntity != null)
											_tileEntity.getTileData().putBoolean("cooldown", (false));
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
									if (!world.isRemote()) {
										BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
										TileEntity _tileEntity = world.getTileEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_tileEntity != null)
											_tileEntity.getTileData().putBoolean("cooldown", (false));
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
									if (world instanceof World && !world.isRemote()) {
										((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
												(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
														.getValue(new ResourceLocation("block.note_block.chime")),
												SoundCategory.NEUTRAL, (float) 1, (float) 1);
									} else {
										((World) world).playSound(x, y, z,
												(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
														.getValue(new ResourceLocation("block.note_block.chime")),
												SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
									}
									if (!world.isRemote()) {
										BlockPos _bp = new BlockPos((int) x, (int) (y - 2), (int) z);
										TileEntity _tileEntity = world.getTileEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_tileEntity != null)
											_tileEntity.getTileData().putBoolean("cooldown", (false));
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 160);
						} else {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("latencyLoaded", (false));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("latencyLoaded", (false));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) (y - 2), (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("latencyLoaded", (false));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("the_wet_smp:buffer.latency")),
										SoundCategory.NEUTRAL, (float) 0.1, (float) 1);
							} else {
								((World) world).playSound(x, y, z,
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("the_wet_smp:buffer.latency")),
										SoundCategory.NEUTRAL, (float) 0.1, (float) 1, false);
							}
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								BuildLatencyProcedure.executeProcedure($_dependencies);
							}
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								BuildLatency2Procedure.executeProcedure($_dependencies);
							}
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								BuildLatency3Procedure.executeProcedure($_dependencies);
							}
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								BuildLatency4Procedure.executeProcedure($_dependencies);
							}
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								BuildLatency5Procedure.executeProcedure($_dependencies);
							}
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								BuildLatency6Procedure.executeProcedure($_dependencies);
							}
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								BuildLatency7Procedure.executeProcedure($_dependencies);
							}
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								BuildLatency8Procedure.executeProcedure($_dependencies);
							}
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								BuildLatency9Procedure.executeProcedure($_dependencies);
							}
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								BuildLatency10Procedure.executeProcedure($_dependencies);
							}
						}
					}
				}
			}
		} else {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.chest.locked")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.chest.locked")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		}
	}
}
