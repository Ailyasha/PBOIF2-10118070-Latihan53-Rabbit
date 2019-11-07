/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118070.latihan53.rabbit;

/**
 *
 * @author Ailyasha
 * NAMA     : Aufa Ilyasha
 * Kelas    : IF2
 * NIM      : 10118070
 */
public class Rabbit extends Animal {
    private String color, name;

    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
}
