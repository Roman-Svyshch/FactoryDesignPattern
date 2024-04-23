package org.example.hamburgerStoreFactoryPattern;

public class MozabikianHamburgerStore extends HamburgerStore{
    @Override
    public Hamburger createHamburger(String type) {
        if (type.equals("cheese")){
            return new MozambikianChesseBurger();
        }else if(type.equals("veggie")){
            return new MozabikianVeggieBurger();
        } else return null;
    }
}
