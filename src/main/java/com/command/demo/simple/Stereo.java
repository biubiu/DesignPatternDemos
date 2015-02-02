package com.command.demo.simple;

/**
 * User: Shawn cao
 * Date: 15/2/2
 * Time: PM2:11
 */
public class Stereo {

    Integer volume;
    public String on(){
        System.out.println("stereo on");
        return "stereo on";
    }

    public void setCD(){
        System.out.println("set cd on stereo");
    }

    public void setVolume(Integer volume){
            this.volume = volume;
    }
}
