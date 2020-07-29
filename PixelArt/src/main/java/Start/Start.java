package Start;

import Interfaz.Interfaz;
import Sprite.Sprite;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samuelson
 */
public class Start {
    Color color;
    int numero;

    public Start() {
    }

    
    public void Start(int numero) {
        Interfaz interfaz = new Interfaz();
        Sprite sprite = new Sprite();
        interfaz.setSprite(sprite);
        sprite.setInterfaz(interfaz);
        sprite.crearSprite(numero, numero);
        interfaz.crearLienzo(sprite);
        interfaz.setVisible(true);
        
    }
}
