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
import net.minecraft.state.Property;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.thewetsmp.item.OsmiumIngotItem;
import net.mcreator.thewetsmp.item.OsmiumDustItem;
import net.mcreator.thewetsmp.item.IronDustItem;
import net.mcreator.thewetsmp.item.GoldDustItem;
import net.mcreator.thewetsmp.item.BismuthIngotItem;
import net.mcreator.thewetsmp.item.BismuthDustItem;
import net.mcreator.thewetsmp.block.CompressorBlock;
import net.mcreator.thewetsmp.block.CompressingCompressor8Block;
import net.mcreator.thewetsmp.block.CompressingCompressor7Block;
import net.mcreator.thewetsmp.block.CompressingCompressor6Block;
import net.mcreator.thewetsmp.block.CompressingCompressor5Block;
import net.mcreator.thewetsmp.block.CompressingCompressor4Block;
import net.mcreator.thewetsmp.block.CompressingCompressor3Block;
import net.mcreator.thewetsmp.block.CompressingCompressor2Block;
import net.mcreator.thewetsmp.block.CompressingCompressor1Block;
import net.mcreator.thewetsmp.TheWetSmpMod;

import java.util.Random;
import java.util.Map;

public class CompressProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency entity for procedure Compress!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency x for procedure Compress!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency y for procedure Compress!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency z for procedure Compress!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpMod.LOGGER.warn("Failed to load dependency world for procedure Compress!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		boolean block = false;
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.piston.extend")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.piston.extend")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
		}
		if ((block == (false))) {
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == BismuthDustItem.block)) {
				block = (boolean) (true);
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BismuthDustItem.block);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
				if ((((new Random()).nextInt((int) 1 + 1)) == 0)) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(BismuthIngotItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world)
								.playSound(null, new BlockPos((int) x, (int) y, (int) z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("block.note_block.xylophone")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("block.note_block.xylophone")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				}
			} else if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == OsmiumDustItem.block)) {
				block = (boolean) (true);
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(OsmiumDustItem.block);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
				if ((((new Random()).nextInt((int) 3 + 1)) == 1)) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(OsmiumIngotItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world)
								.playSound(null, new BlockPos((int) x, (int) y, (int) z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("block.note_block.xylophone")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("block.note_block.xylophone")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				}
			} else if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == GoldDustItem.block)) {
				block = (boolean) (true);
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(GoldDustItem.block);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
				if ((((new Random()).nextInt((int) 2 + 1)) == 1)) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(Items.GOLD_INGOT));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world)
								.playSound(null, new BlockPos((int) x, (int) y, (int) z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("block.note_block.xylophone")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("block.note_block.xylophone")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				}
			} else if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == IronDustItem.block)) {
				block = (boolean) (true);
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(IronDustItem.block);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
				if ((((new Random()).nextInt((int) 1 + 1)) == 1)) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(Items.IRON_INGOT));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world)
								.playSound(null, new BlockPos((int) x, (int) y, (int) z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("block.note_block.xylophone")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("block.note_block.xylophone")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				}
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
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						BlockState _bs = CompressingCompressor2Block.block.getDefaultState();
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
							{
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								BlockState _bs = CompressingCompressor4Block.block.getDefaultState();
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
									{
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										BlockState _bs = CompressingCompressor6Block.block.getDefaultState();
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
											{
												BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
												BlockState _bs = CompressingCompressor8Block.block.getDefaultState();
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
													{
														BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
														BlockState _bs = CompressingCompressor7Block.block.getDefaultState();
														BlockState _bso = world.getBlockState(_bp);
														for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
															Property _property = _bs.getBlock().getStateContainer()
																	.getProperty(entry.getKey().getName());
															if (_property != null && _bs.get(_property) != null)
																try {
																	_bs = _bs.with(_property, (Comparable) entry.getValue());
																} catch (Exception e) {
																}
														}
														world.setBlockState(_bp, _bs, 3);
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
															{
																BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																BlockState _bs = CompressingCompressor5Block.block.getDefaultState();
																BlockState _bso = world.getBlockState(_bp);
																for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
																	Property _property = _bs.getBlock().getStateContainer()
																			.getProperty(entry.getKey().getName());
																	if (_property != null && _bs.get(_property) != null)
																		try {
																			_bs = _bs.with(_property, (Comparable) entry.getValue());
																		} catch (Exception e) {
																		}
																}
																world.setBlockState(_bp, _bs, 3);
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
																	{
																		BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																		BlockState _bs = CompressingCompressor3Block.block.getDefaultState();
																		BlockState _bso = world.getBlockState(_bp);
																		for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues()
																				.entrySet()) {
																			Property _property = _bs.getBlock().getStateContainer()
																					.getProperty(entry.getKey().getName());
																			if (_property != null && _bs.get(_property) != null)
																				try {
																					_bs = _bs.with(_property, (Comparable) entry.getValue());
																				} catch (Exception e) {
																				}
																		}
																		world.setBlockState(_bp, _bs, 3);
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
																			{
																				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																				BlockState _bs = CompressingCompressor1Block.block.getDefaultState();
																				BlockState _bso = world.getBlockState(_bp);
																				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues()
																						.entrySet()) {
																					Property _property = _bs.getBlock().getStateContainer()
																							.getProperty(entry.getKey().getName());
																					if (_property != null && _bs.get(_property) != null)
																						try {
																							_bs = _bs.with(_property, (Comparable) entry.getValue());
																						} catch (Exception e) {
																						}
																				}
																				world.setBlockState(_bp, _bs, 3);
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
																					{
																						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																						BlockState _bs = CompressorBlock.block.getDefaultState();
																						BlockState _bso = world.getBlockState(_bp);
																						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																								.getValues().entrySet()) {
																							Property _property = _bs.getBlock().getStateContainer()
																									.getProperty(entry.getKey().getName());
																							if (_property != null && _bs.get(_property) != null)
																								try {
																									_bs = _bs.with(_property,
																											(Comparable) entry.getValue());
																								} catch (Exception e) {
																								}
																						}
																						world.setBlockState(_bp, _bs, 3);
																					}
																					MinecraftForge.EVENT_BUS.unregister(this);
																				}
																			}.start(world, (int) 1);
																			MinecraftForge.EVENT_BUS.unregister(this);
																		}
																	}.start(world, (int) 1);
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 1);
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, (int) 1);
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, (int) 5);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, (int) 1);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 1);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 1);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 1);
			block = (boolean) (false);
		}
	}
}
