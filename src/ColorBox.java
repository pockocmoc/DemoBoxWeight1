/*
 Этот класс расширяет класс Box,
 включая в него свойство цвета
 */
public class ColorBox extends Box{
    int color; // цвет параллелепипеда

    ColorBox(double w, double h, double d, int c) {
        widht = w;
        height = h;
        depth = d;
        color = c;
    }
}
