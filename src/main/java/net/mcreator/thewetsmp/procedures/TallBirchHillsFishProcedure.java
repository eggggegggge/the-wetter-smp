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

public class TallBirchHillsFishProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sel = 0;
		double time = 0;
		double altitude = 0;
		double fish = 0;
		double jellyfish = 0;
		double luck = 0;
		double flowerfish = 0;
		double nightkoi = 0;
		double watchfulreedfish = 0;
		/*fishing factors*/
		luck = (double) LuckCheckProcedure.execute(entity);/*loot factors*/
		time = (double) (world.dayTime());
		altitude = (double) (Math.floor(y));/*define base values*/
		watchfulreedfish = (double) 11;
		flowerfish = (double) 20;
		if (altitude < 60) {
			nightkoi = (double) 25;
			jellyfish = (double) 29;/*apply modifiers*/
			if (luck > 1) {
				watchfulreedfish = (double) (watchfulreedfish - 2);
				flowerfish = (double) (flowerfish + 2);
				nightkoi = (double) (nightkoi + 4);
				jellyfish = (double) (jellyfish + 4);
			} else if (luck < 0) {
				watchfulreedfish = (double) (watchfulreedfish + 2);
				flowerfish = (double) (flowerfish + 1);
				nightkoi = (double) (nightkoi - 3);
				jellyfish = (double) (jellyfish - 4);
			} /*fish*/
			fish = (double) nightkoi;
			if (time > 13000 && time < 23000) {
				fish = (double) jellyfish;
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
			}.getScore("PlayerRNG", entity) <= watchfulreedfish) {
				RemoveBaitProcedure.execute(world, entity);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"give @s the_wet_smp_rehydrated:watchful_reedfish 1");
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
			}.getScore("PlayerRNG", entity) >= watchfulreedfish + 1 && new Object() {
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
			}.getScore("PlayerRNG", entity) <= nightkoi) {
				RemoveBaitProcedure.execute(world, entity);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"give @s the_wet_smp_rehydrated:night_koi 1");
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
			}.getScore("PlayerRNG", entity) >= nightkoi + 1 && new Object() {
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
			jellyfish = (double) 25;/*apply modifiers*/
			if (luck > 1) {
				watchfulreedfish = (double) (watchfulreedfish - 2);
				flowerfish = (double) (flowerfish + 2);
				jellyfish = (double) (jellyfish + 4);
			} else if (luck < 0) {
				watchfulreedfish = (double) (watchfulreedfish + 2);
				flowerfish = (double) (flowerfish + 1);
				jellyfish = (double) (jellyfish - 3);
			} /*fish*/
			fish = (double) flowerfish;
			if (time > 13000 && time < 23000) {
				fish = (double) jellyfish;
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
			}.getScore("PlayerRNG", entity) <= watchfulreedfish) {
				RemoveBaitProcedure.execute(world, entity);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"give @s the_wet_smp_rehydrated:watchful_reedfish 1");
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
			}.getScore("PlayerRNG", entity) >= watchfulreedfish + 1 && new Object() {
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
