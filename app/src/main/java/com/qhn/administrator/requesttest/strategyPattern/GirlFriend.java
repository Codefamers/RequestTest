package com.qhn.administrator.requesttest.strategyPattern;

/**
 * Created by Administrator on 2016/10/12 0012.
 */

public abstract class GirlFriend {
    AppearanceStyle appearanceStyle;
    GirlCharacterStyle  girlCharacterStyle;

    public void setAppearanceStyle(AppearanceStyle appearanceStyle) {
        this.appearanceStyle = appearanceStyle;
    }

    public void setGirlCharacterStyle(GirlCharacterStyle girlCharacterStyle) {
        this.girlCharacterStyle = girlCharacterStyle;
    }

    public GirlFriend() {
        appearanceStyle=new BeautifulAppearance();
        girlCharacterStyle= new SoftCharacter();
    }

    public void createGirlFriend(){
        appearanceStyle.appearanceFeature();
        girlCharacterStyle.characterStyle();
    }
    public abstract void display();
}
