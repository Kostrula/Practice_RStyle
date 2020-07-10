package ru.softlab.galkin.onlinebank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.softlab.galkin.onlinebank.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    private static User defaultUser = new User();
    private static List<Card> listCards = new ArrayList<Card>();
    private static Card defaultCard = new Card();
    private static List<Account> listAccount = new ArrayList<Account>();
    private static Account defaultAccount = new Account();
    static {
        defaultUser.setDefault();
        defaultCard.setDefault();
        listCards.add(defaultCard);
        defaultAccount.setDefault();
        listAccount.add(defaultAccount);
    }
    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("listCards", listCards);
        model.addAttribute("user", defaultUser);
        model.addAttribute("listAccounts", listAccount);
        return "index";
    }

    @RequestMapping("/info")
    public String info(Model model){
        model.addAttribute("user", defaultUser);
        return "info";
    }

   @RequestMapping("/description_card")
    public  String description_card(Model model){
        model.addAttribute("card", defaultCard);
       return "description_card";
    }
    /*@RequestMapping("/edit")
        public ModelAndView editCustomerForm(@RequestParam long id) {
        ModelAndView mav = new ModelAndView("edit_customer");
        Customer customer = customerService.get(id);
        mav.addObject("customer", customer);
        //Вот такую штуку нашел
    return mav;
    }*/

    @RequestMapping("/description_acc")
    public  String description_acc(Model model){
        model.addAttribute("acc", defaultAccount);
        return "description_acc";
    }

    @RequestMapping("/new_acc")
    public String newAccountForm(Map<String, Object> model) {
        Account acc = new Account();
        model.put("acc", acc);
        return "new_acc";
    }

    @RequestMapping("/new_card")
    public String newCardForm(Map<String, Object> model) {
        Card card = new Card();
        model.put("card", card);
        return "new_card";
    }

    @RequestMapping("/welcome")
    public String getWelcome(){
        return "welcome";
    }
}
