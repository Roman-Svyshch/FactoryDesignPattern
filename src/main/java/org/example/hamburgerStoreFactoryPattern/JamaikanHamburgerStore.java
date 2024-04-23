package org.example.hamburgerStoreFactoryPattern;

public class JamaikanHamburgerStore extends HamburgerStore{
    @Override
    public Hamburger createHamburger(String type) {

        if (type.equals("cheese")){
            return new JamaikanChesseBurger();
        }else if (type.equals("veggie")){
            return new JamaikanVeggieBurger();
        } else return null;
    }
}
