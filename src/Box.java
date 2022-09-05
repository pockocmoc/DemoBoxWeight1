/*
 В этой программе наследование применяется
 для расширения класса Box
 */

public class Box {
    double widht;
    double height;
    double depth;

    // сконструировать клон объекта

    Box(Box ob) { // передать объект конструктору
        widht = ob.widht;
        height = ob.height;
        depth = ob.depth;

    }
    // конструктор, применяемый при указании всех размеров

    Box(double w, double h, double d) {
        widht = w;
        height = h;
        depth = d;
    }
    // конструктор, применяемый в отсутствии размеров

    Box() {
        widht = - 1;
        height = - 1;
        depth = - 1;

        /*
        значение -1 служит для обозначения
        неинициализированного параллелепипеда
         */
    }
    // конструктор, применямый при создании куба

    Box(double len) {
        widht = height = depth = len;
    }
    // рассчитать и возратить объем

    double volume() {
        return widht * height * depth;
    }
}
// расширить класс Box, вкличив в него поле веса

class BoxWeight extends Box {
    double weight; // вес параллелепипеда

    // конструктор BoxWeight()

    BoxWeight (double w, double h, double d, double m) {
        widht = w;
        height = h;
        depth = d;
        weight = m;
    }
}
class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
    }
}
