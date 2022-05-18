package jp.co.sss.energy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.sss.energy.entity.Drink;

public interface DrinkRepository extends JpaRepository<Drink, Integer> {

	List<Drink> findAllByOrderByPriceAsc();

	List<Drink> findAllByOrderByCafeinDesc();

}
