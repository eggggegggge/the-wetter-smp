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

public class DesertHillsFishProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sel = 0;
		double time = 0;
		double altitude = 0;
		double fish = 0;
		double jellyfish = 0;
		double luck = 0;
		double glassfish = 0;
		double crab = 0;
		/*fishing factors*/
		luck = (double) LuckCheckProcedure.execute(entity);/*loot factors*/
		time = (double) (world.dayTime());
		altitude = (double) (Math.floor(y));/*define base values*/
		glassfish = (double) 5;
		crab = (double) 16;
		jellyfish = (double) 23;/*apply modifiers*/
		if (luck > 1) {
			glassfish = (double) (glassfish + 8);
			crab = (double) (crab - 1);
			jellyfish = (double) (jellyfish + 3);
		} else if (luck < 0) {
			glassfish = (double) (glassfish - 2);
			crab = (double) (crab + 4);
			jellyfish = (double) (jellyfish + 2);
		} /*fish*/
		fish = (double) crab;
		if (altitude < 60) {
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
		}.getScore("PlayerRNG", entity) <= glassfish) {
			RemoveBaitProcedure.execute(world, entity);
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"give @s the_wet_smp_rehydrated:glassfish 1");
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
		}.getScore("PlayerRNG", entity) >= glassfish + 1 && new Object() {
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
		}.getScore("PlayerRNG", entity) <= crab) {
			RemoveBaitProcedure.execute(world, entity);
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"give @s the_wet_smp_rehydrated:crab 1");
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, x, (y - 0.5), z, 5));
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
		}.getScore("PlayerRNG", entity) >= crab + 1 && new Object() {
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
							"give @s the_wet_smp_rehydrated:yellow_jellyfish 1");
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
