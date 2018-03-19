package ru.job4j.condition;

import java.lang.Math;
/**
 * @author Igor Khmelevskiy (igorkkhm@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     *
     * Формула.
     *
     * (ab + ac + bc) / 2
     *
     * @param ab расстояние между точками a и b.
     * @param ac расстояние между точками a и c.
     * @param bc расстояние между точками b и c.
     * @return Полупериметр.
     */
    public double period(double ab, double ac, double bc) {
        ab = this.a.distanceTo(this.b);
        ac = this.a.distanceTo(this.c);
        bc = this.b.distanceTo(this.c);
        return (ab + ac + bc)/2;

    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * @return Вернуть площадь, если треугольник существует, или -1, если треугольника нет.
     */
    public double area() {
        double rsl = -1;
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab, ac, bc);
        if(this.exist(ab, ac, bc)) {
            return Math.sqrt(p*(p-ab)*(p-ac)*(p-bc));
        }
        else return rsl;
    }

    /**
     * Метод проверяет, можно ли построить треугольник с такими длинами сторон.
     * @param ab длина от точки a до точки b.
     * @param ac длина от точки a до точки c.
     * @param bc длина от точки b до точки c.
     * @return True, если треугольник существует, и false, если не существует.
     */
    private boolean exist(double ab, double ac, double bc) {
        return ((ab + ac) > bc) && ((ac + bc) > ab) && ((ab + bc) > ac);
    }

}
