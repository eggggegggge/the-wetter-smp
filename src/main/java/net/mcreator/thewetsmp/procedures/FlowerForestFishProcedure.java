package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Score;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

public class FlowerForestFishProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sel = 0;
		double time = 0;
		double altitude = 0;
		double fish = 0;
		double jellyfish = 0;
		double luck = 0;
		double koi = 0;
		double goldfish = 0;
		double glowkoi = 0;
		double flowerfish = 0;
		/*fishing factors*/
		luck = LuckCheckProcedure.execute(entity);/*loot factors*/
		time = world.dayTime();
		altitude = Math.floor(y);/*define base values*/
		koi = 18;
		goldfish = 25;
		flowerfish = 29;
		if (altitude < 60) {
			glowkoi = 34;
			jellyfish = 39;/*apply modifiers*/
			if (luck > 1) {
				koi = koi + 1;
				goldfish = goldfish + 2;
				flowerfish = flowerfish + 4;
				glowkoi = glowkoi + 7;
				jellyfish = jellyfish + 10;
			} else if (luck < 0) {
				koi = koi + 2;
				goldfish = goldfish - 1;
				flowerfish = flowerfish - 3;
				glowkoi = glowkoi - 7;
				jellyfish = jellyfish - 4;
			} /*fish*/
			fish = glowkoi;
			if (time > 13000 && time < 23000) {
				fish = jellyfish;
			}
			if (entity instanceof Player _player) {
				Scoreboard _sc = _player.getScoreboard();
				Objective _so = _sc.getObjective("PlayerRNG");
				if (_so == null)
					_so = _sc.addObjective("PlayerRNG", ObjectiveCriteria.DUMMY, new TextComponent("PlayerRNG"),
							ObjectiveCriteria.RenderType.INTEGER);
				Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
				_scr.setScore((int) (Math.random() * (fish + 1)));
			}
			if (new Object() {
				public int getScore(String score, Entity _ent) {
					if (_ent instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null) {
							Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
							return _scr.getScore();
						}
					}
					return 0;
				}
			}.getScore("PlayerRNG", entity) >= 0 && new Object() {
				public int getScore(String score, Entity _ent) {
					if (_ent instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null) {
							Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
							return _scr.getScore();
						}
					}
					return 0;
				}
			}.getScore("PlayerRNG", entity) <= koi) {
				RemoveBaitProcedure.execute(world, entity);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"give @s the_wet_smp_rehydrated:koi 1");
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.addFreshEntity(new ExperienceOrb(_level, x, (y - 0.5), z, 4));
			} else if (new Object() {
				public int getScore(String score, Entity _ent) {
					if (_ent instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null) {
							Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
							return _scr.getScore();
						}
					}
					return 0;
				}
			}.getScore("PlayerRNG", entity) >= koi + 1 && new Object() {
				public int getScore(String score, Entity _ent) {
					if (_ent instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null) {
							Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
							return _scr.getScore();
						}
					}
					return 0;
				}
			}.getScore("PlayerRNG", entity) <= goldfish) {
				RemoveBaitProcedure.execute(world, entity);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"give @s the_wet_smp_rehydrated:goldfish 1");
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.addFreshEntity(new ExperienceOrb(_level, x, (y - 0.5), z, 6));
			} else if (new Object() {
				public int getScore(String score, Entity _ent) {
					if (_ent instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null) {
							Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
							return _scr.getScore();
						}
					}
					return 0;
				}
			}.getScore("PlayerRNG", entity) >= goldfish + 1 && new Object() {
				public int getScore(String score, Entity _ent) {
					if (_ent instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null) {
							Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
							return _scr.getScore();
						}
					}
					return 0;
				}
			}.getScore("PlayerRNG", entity) <= flowerfish) {
				RemoveBaitProcedure.execute(world, entity);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"give @s the_wet_smp_rehydrated:flowerfish 1");
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.addFreshEntity(new ExperienceOrb(_level, x, (y - 0.5), z, 8));
			} else if (new Object() {
				public int getScore(String score, Entity _ent) {
					if (_ent instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null) {
							Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
							return _scr.getScore();
						}
					}
					return 0;
				}
			}.getScore("PlayerRNG", entity) >= flowerfish + 1 && new Object() {
				public int getScore(String score, Entity _ent) {
					if (_ent instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null) {
							Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
							return _scr.getScore();
						}
					}
					return 0;
				}
			}.getScore("PlayerRNG", entity) <= glowkoi) {
				RemoveBaitProcedure.execute(world, entity);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"give @s the_wet_smp_rehydrated:glow_koi 1");
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.addFreshEntity(new ExperienceOrb(_level, x, (y - 0.5), z, 4));
			} else if (new Object() {
				public int getScore(String score, Entity _ent) {
					if (_ent instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null) {
							Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
							return _scr.getScore();
						}
					}
					return 0;
				}
			}.getScore("PlayerRNG", entity) >= glowkoi + 1 && new Object() {
				public int getScore(String score, Entity _ent) {
					if (_ent instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null) {
							Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
							return _scr.getScore();
						}
					}
					return 0;
				}
			}.getScore("PlayerRNG", entity) <= jellyfish) {
				RemoveBaitProcedure.execute(world, entity);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"give @s the_wet_smp_rehydrated:green_jellyfish 1");
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.addFreshEntity(new ExperienceOrb(_level, x, (y - 0.5), z, 8));
			}
		} else {
			jellyfish = 34;/*apply modifiers*/
			if (luck > 1) {
				koi = koi + 1;
				goldfish = goldfish + 2;
				flowerfish = flowerfish + 4;
				jellyfish = jellyfish + 7;
			} else if (luck < 0) {
				koi = koi + 2;
				goldfish = goldfish - 1;
				flowerfish = flowerfish - 3;
				jellyfish = jellyfish - 7;
			} /*fish*/
			fish = flowerfish;
			if (time > 13000 && time < 23000) {
				fish = jellyfish;
			}
			if (entity instanceof Player _player) {
				Scoreboard _sc = _player.getScoreboard();
				Objective _so = _sc.getObjective("PlayerRNG");
				if (_so == null)
					_so = _sc.addObjective("PlayerRNG", ObjectiveCriteria.DUMMY, new TextComponent("PlayerRNG"),
							ObjectiveCriteria.RenderType.INTEGER);
				Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
				_scr.setScore((int) (Math.random() * (fish + 1)));
			}
			if (new Object() {
				public int getScore(String score, Entity _ent) {
					if (_ent instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null) {
							Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
							return _scr.getScore();
						}
					}
					return 0;
				}
			}.getScore("PlayerRNG", entity) >= 0 && new Object() {
				public int getScore(String score, Entity _ent) {
					if (_ent instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null) {
							Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
							return _scr.getScore();
						}
					}
					return 0;
				}
			}.getScore("PlayerRNG", entity) <= koi) {
				RemoveBaitProcedure.execute(world, entity);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"give @s the_wet_smp_rehydrated:koi 1");
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.addFreshEntity(new ExperienceOrb(_level, x, (y - 0.5), z, 4));
			} else if (new Object() {
				public int getScore(String score, Entity _ent) {
					if (_ent instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null) {
							Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
							return _scr.getScore();
						}
					}
					return 0;
				}
			}.getScore("PlayerRNG", entity) >= koi + 1 && new Object() {
				public int getScore(String score, Entity _ent) {
					if (_ent instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null) {
							Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
							return _scr.getScore();
						}
					}
					return 0;
				}
			}.getScore("PlayerRNG", entity) <= goldfish) {
				RemoveBaitProcedure.execute(world, entity);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"give @s the_wet_smp_rehydrated:goldfish 1");
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.addFreshEntity(new ExperienceOrb(_level, x, (y - 0.5), z, 6));
			} else if (new Object() {
				public int getScore(String score, Entity _ent) {
					if (_ent instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null) {
							Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
							return _scr.getScore();
						}
					}
					return 0;
				}
			}.getScore("PlayerRNG", entity) >= goldfish + 1 && new Object() {
				public int getScore(String score, Entity _ent) {
					if (_ent instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null) {
							Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
							return _scr.getScore();
						}
					}
					return 0;
				}
			}.getScore("PlayerRNG", entity) <= flowerfish) {
				RemoveBaitProcedure.execute(world, entity);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"give @s the_wet_smp_rehydrated:flowerfish 1");
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.addFreshEntity(new ExperienceOrb(_level, x, (y - 0.5), z, 8));
			} else if (new Object() {
				public int getScore(String score, Entity _ent) {
					if (_ent instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null) {
							Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
							return _scr.getScore();
						}
					}
					return 0;
				}
			}.getScore("PlayerRNG", entity) >= flowerfish + 1 && new Object() {
				public int getScore(String score, Entity _ent) {
					if (_ent instanceof Player _player) {
						Scoreboard _sc = _player.getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null) {
							Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
							return _scr.getScore();
						}
					}
					return 0;
				}
			}.getScore("PlayerRNG", entity) <= jellyfish) {
				RemoveBaitProcedure.execute(world, entity);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"give @s the_wet_smp_rehydrated:green_jellyfish 1");
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.addFreshEntity(new ExperienceOrb(_level, x, (y - 0.5), z, 8));
			}
		}
		if (entity instanceof Player _player) {
			Scoreboard _sc = _player.getScoreboard();
			Objective _so = _sc.getObjective("PlayerRNG");
			if (_so == null)
				_so = _sc.addObjective("PlayerRNG", ObjectiveCriteria.DUMMY, new TextComponent("PlayerRNG"), ObjectiveCriteria.RenderType.INTEGER);
			Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
			_scr.setScore(-1);
		}
	}
}
