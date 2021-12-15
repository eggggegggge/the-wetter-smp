package net.mcreator.thewetsmp.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thewetsmp.item.RubyEmbeddedMushroomStewItem;
import net.mcreator.thewetsmp.item.RubyEmbeddedBowlItem;
import net.mcreator.thewetsmp.item.OnyxEmbeddedMushroomStewItem;
import net.mcreator.thewetsmp.item.OnyxEmbeddedBowlItem;
import net.mcreator.thewetsmp.item.LapisEmbeddedMushroomStewItem;
import net.mcreator.thewetsmp.item.LapisEmbeddedBowlItem;
import net.mcreator.thewetsmp.item.EmeraldEmbeddedMushroomStewItem;
import net.mcreator.thewetsmp.item.EmeraldEmbeddedBowlItem;
import net.mcreator.thewetsmp.item.AquamarineEmbeddedMushroomStewItem;
import net.mcreator.thewetsmp.item.AquamarineEmbeddedBowlItem;
import net.mcreator.thewetsmp.TheWetSmpRehydratedMod;

import java.util.Map;
import java.util.HashMap;

public class RubyMushroomProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
			Entity entity = event.getTarget();
			PlayerEntity sourceentity = event.getPlayer();
			if (event.getHand() != sourceentity.getActiveHand()) {
				return;
			}
			double i = event.getPos().getX();
			double j = event.getPos().getY();
			double k = event.getPos().getZ();
			IWorld world = event.getWorld();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("sourceentity", sourceentity);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency world for procedure RubyMushroom!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency x for procedure RubyMushroom!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency y for procedure RubyMushroom!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency z for procedure RubyMushroom!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency entity for procedure RubyMushroom!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				TheWetSmpRehydratedMod.LOGGER.warn("Failed to load dependency sourceentity for procedure RubyMushroom!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (EntityTypeTags.getCollection().getTagByID(new ResourceLocation("forge:mooshrooms")).contains(entity.getType())) {
			if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == AquamarineEmbeddedBowlItem.block) {
				if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY))
						.getCount() >= 2) {
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(AquamarineEmbeddedMushroomStewItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
					}
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(AquamarineEmbeddedBowlItem.block);
						((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) sourceentity).container.func_234641_j_());
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.milk")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.milk")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				} else {
					if (sourceentity instanceof LivingEntity) {
						ItemStack _setstack = new ItemStack(AquamarineEmbeddedMushroomStewItem.block);
						_setstack.setCount((int) 1);
						((LivingEntity) sourceentity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (sourceentity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) sourceentity).inventory.markDirty();
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.milk")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.milk")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				}
			} else if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == EmeraldEmbeddedBowlItem.block) {
				if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY))
						.getCount() >= 2) {
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(EmeraldEmbeddedMushroomStewItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
					}
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(EmeraldEmbeddedBowlItem.block);
						((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) sourceentity).container.func_234641_j_());
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.milk")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.milk")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				} else {
					if (sourceentity instanceof LivingEntity) {
						ItemStack _setstack = new ItemStack(EmeraldEmbeddedMushroomStewItem.block);
						_setstack.setCount((int) 1);
						((LivingEntity) sourceentity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (sourceentity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) sourceentity).inventory.markDirty();
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.milk")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.milk")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				}
			} else if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == LapisEmbeddedBowlItem.block) {
				if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY))
						.getCount() >= 2) {
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(LapisEmbeddedMushroomStewItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
					}
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(LapisEmbeddedBowlItem.block);
						((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) sourceentity).container.func_234641_j_());
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.milk")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.milk")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				} else {
					if (sourceentity instanceof LivingEntity) {
						ItemStack _setstack = new ItemStack(LapisEmbeddedMushroomStewItem.block);
						_setstack.setCount((int) 1);
						((LivingEntity) sourceentity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (sourceentity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) sourceentity).inventory.markDirty();
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.milk")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.milk")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				}
			} else if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == OnyxEmbeddedBowlItem.block) {
				if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY))
						.getCount() >= 2) {
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(OnyxEmbeddedMushroomStewItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
					}
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(OnyxEmbeddedBowlItem.block);
						((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) sourceentity).container.func_234641_j_());
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.milk")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.milk")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				} else {
					if (sourceentity instanceof LivingEntity) {
						ItemStack _setstack = new ItemStack(OnyxEmbeddedMushroomStewItem.block);
						_setstack.setCount((int) 1);
						((LivingEntity) sourceentity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (sourceentity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) sourceentity).inventory.markDirty();
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.milk")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.milk")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				}
			} else if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == RubyEmbeddedBowlItem.block) {
				if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY))
						.getCount() >= 2) {
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(RubyEmbeddedMushroomStewItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
					}
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(RubyEmbeddedBowlItem.block);
						((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) sourceentity).container.func_234641_j_());
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.milk")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.milk")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				} else {
					if (sourceentity instanceof LivingEntity) {
						ItemStack _setstack = new ItemStack(RubyEmbeddedMushroomStewItem.block);
						_setstack.setCount((int) 1);
						((LivingEntity) sourceentity).setHeldItem(Hand.MAIN_HAND, _setstack);
						if (sourceentity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) sourceentity).inventory.markDirty();
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.milk")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.milk")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				}
			}
		}
	}
}
