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

public class RiverFishProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sel = 0;
		double time = 0;
		double altitude = 0;
		double fish = 0;
		double salmon = 0;
		double jellyfish = 0;
		double luck = 0;
		double koi = 0;
		double scallop = 0;
		/*fishing factors*/
		luck = (double) LuckCheckProcedure.execute(entity);/*loot factors*/
		time = (double) (world.dayTime());
		altitude = (double) (Math.floor(y));/*define base values*/
		salmon = (double) 10;
		scallop = (double) 18;
		koi = (double) 23;
		jellyfish = (double) 27;/*apply modifiers*/
		if (luck > 1) {
			salmon = (double) (salmon - 3);
			scallop = (double) (scallop + 1);
			koi = (double) (koi + 2);
			jellyfish = (double) (jellyfish - 2);
		} else if (luck < 0) {
			salmon = (double) (salmon + 3);
			scallop = (double) (scallop - 1);
			koi = (double) (koi - 2);
			jellyfish = (double) (jellyfish + 0);
		} /*fish*/
		fish = (double) koi;
		if (time > 13000 && time < 23000) {
			fish = (double) jellyfish;
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
		}.getScore("PlayerRNG", entity) <= salmon) {
			RemoveBaitProcedure.execute(world, entity);
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"give @s minecraft:salmon 1");
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
		}.getScore("PlayerRNG", entity) >= salmon + 1 && new Object() {
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
		}.getScore("PlayerRNG", entity) <= scallop) {
			RemoveBaitProcedure.execute(world, entity);
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"give @s the_wet_smp_rehydrated:scallop 1");
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
		}.getScore("PlayerRNG", entity) >= scallop + 1 && new Object() {
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
		}.getScore("PlayerRNG", entity) <= jellyfish) {
			RemoveBaitProcedure.execute(world, entity);
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"give @s the_wet_smp_rehydrated:blue_jellyfish 1");
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, x, (y - 0.5), z, 8));
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
