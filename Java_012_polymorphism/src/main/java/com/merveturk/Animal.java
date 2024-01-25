package com.merveturk;


import lombok.*;

@Getter
@Setter

public class Animal {
    private String name,sound,info,infoText;

    Animal (){
        this("Bulunmuyor","Bulunmuyor");
    }
    Animal(String name,String sound){
        this.name= name;
        this.sound = sound;
        this.info = null;
        setInfoText(info);
    }
    Animal (String name,String sound,String info){
        this.name=name;
        this.sound=sound;
        this.info = info;
        setInfoText(info);
    }

    public void setInfoText(String info) {
        this.infoText = "-> Benim İsmim: "+getName()
                +" " + "\n-> Çıkardığım Ses: "+getSound()
                +"\n-> Türüm: "+info;
    }

    public String animalInfo(){
        return "< Hayvan Bilgileri >\n-----\n"+getInfoText();
    }


}
