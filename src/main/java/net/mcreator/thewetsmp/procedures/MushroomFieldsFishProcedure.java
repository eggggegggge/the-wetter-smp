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

public class MushroomFieldsFishProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sel = 0;
		double time = 0;
		double altitude = 0;
		double fish = 0;
		double jellyfish = 0;
		double luck = 0;
		double fungigoby = 0;
		double shiitakeorfe = 0;
		double dryadsaequorea = 0;
		double shroomykoi = 0;
		/*fishing factors*/
		luck = LuckCheckProcedure.execute(entity);/*loot factors*/
		time = world.dayTime();
		altitude = Math.floor(y);/*define base values*/
		fungigoby = 9;
		shiitakeorfe = 18;
		dryadsaequorea = 22;
		shroomykoi = 27;
		jellyfish = 33;/*apply modifiers*/
		if (luck > 1) {
			fungigoby = fungigoby - 1;
			shiitakeorfe = shiitakeorfe - 1;
			dryadsaequorea = dryadsaequorea + 2;
			shroomykoi = shroomykoi + 3;
			jellyfish = jellyfish + 2;
		} else if (luck < 0) {
			fungigoby = fungigoby + 1;
			shiitakeorfe = shiitakeorfe + 1;
			dryadsaequorea = dryadsaequorea - 2;
			shroomykoi = shroomykoi - 5;
			jellyfish = jellyfish + 2;
		} /*fish*/
		fish = shroomykoi;
		if (altitude < 60) {
			fish = jellyfish;
		}
		if (entity instanceof Player _player) {
			Scoreboard _sc = _player.getScoreboard();
			Objective _so = _sc.getObjective("PlayerRNG");
			if (_so == null)
				_so = _sc.addObjective("PlayerRNG", ObjectiveCriteria.DUMMY, new TextComponent("PlayerRNG"), ObjectiveCriteria.RenderType.INTEGER);
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
		}.getScore("PlayerRNG", entity) <= fungigoby) {
			RemoveBaitProcedure.execute(world, entity);
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"give @s the_wet_smp_rehydrated:fungi_gobi 1");
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, x, (y - 0.5), z, 2));
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
		}.getScore("PlayerRNG", entity) >= fungigoby + 1 && new Object() {
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
		}.getScore("PlayerRNG", entity) <= shiitakeorfe) {
			RemoveBaitProcedure.execute(world, entity);
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"give @s the_wet_smp_rehydrated:shiitake_orfe 1");
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, x, (y - 0.5), z, 2));
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
		}.getScore("PlayerRNG", entity) >= shiitakeorfe + 1 && new Object() {
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
		}.getScore("PlayerRNG", entity) <= dryadsaequorea) {
			RemoveBaitProcedure.execute(world, entity);
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"give @s the_wet_smp_rehydrated:dryads_aequorea 1");
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, x, (y - 0.5), z, 11));
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
		}.getScore("PlayerRNG", entity) >= dryadsaequorea + 1 && new Object() {
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
		}.getScore("PlayerRNG", entity) <= shroomykoi) {
			RemoveBaitProcedure.execute(world, entity);
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"give @s the_wet_smp_rehydrated:shroomy_koi 1");
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
		}.getScore("PlayerRNG", entity) >= shroomykoi + 1 && new Object() {
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
							"give @s the_wet_smp_rehydrated:pink_jellyfish 1");
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, x, (y - 0.5), z, 7));
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
