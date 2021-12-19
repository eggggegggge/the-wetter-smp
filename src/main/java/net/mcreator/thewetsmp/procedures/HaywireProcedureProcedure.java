package net.mcreator.thewetsmp.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Score;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

public class HaywireProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			Scoreboard _sc = _player.getScoreboard();
			Objective _so = _sc.getObjective("PlayerRNG");
			if (_so == null)
				_so = _sc.addObjective("PlayerRNG", ObjectiveCriteria.DUMMY, new TextComponent("PlayerRNG"), ObjectiveCriteria.RenderType.INTEGER);
			Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
			_scr.setScore((int) (Math.random() * 32));
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
		}.getScore("PlayerRNG", entity) == 1) {
			if (entity instanceof Player _player) {
				Scoreboard _sc = _player.getScoreboard();
				Objective _so = _sc.getObjective("PlayerRNG");
				if (_so == null)
					_so = _sc.addObjective("PlayerRNG", ObjectiveCriteria.DUMMY, new TextComponent("PlayerRNG"),
							ObjectiveCriteria.RenderType.INTEGER);
				Score _scr = _sc.getOrCreatePlayerScore(_player.getScoreboardName(), _so);
				_scr.setScore(-1);
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"spreadplayers ~ ~ 10 16 false @s");
			}
		}
	}
}
