package jp.co.sss.energy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.energy.repository.DrinkRepository;

@Controller
public class DrinkController {

	@Autowired
	DrinkRepository repository;

	@RequestMapping("/drink/findAll")
	public String showItemList(Model model) {
		model.addAttribute("drinks", repository.findAll());
		return "drink/drink_list";
	}

	@RequestMapping("/drink/findAllByOrderByPriceAsc")
	public String showItemListByOrderByPriceAsc(Model model) {
		model.addAttribute("drinks", repository.findAllByOrderByPriceAsc());
		return "drink/drink_list2";
	}

	@RequestMapping("/drink/findAllByOrderByCafeinDesc")
	public String showItemListByOrderByCafeinDesc(Model model) {
		model.addAttribute("drinks", repository.findAllByOrderByCafeinDesc());
		return "drink/drink_list3";
	}

}
