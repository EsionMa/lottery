package me.zohar.lottery.game.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import me.zohar.lottery.game.domain.GameSituation;

public interface GameSituationRepo extends JpaRepository<GameSituation, String>, JpaSpecificationExecutor<GameSituation> {

	List<GameSituation> findTop5By();
}
