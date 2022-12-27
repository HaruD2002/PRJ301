
import java.io.InputStream;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author duynh
 */
public class allCase {

    //1
    public double add2number(double a, double b) {
        return a + b;
    }

    //2
    public double sub2number(double a, double b) {
        return a - b;
    }

    //3
    public double mul2number(double a, double b) {
        return a * b;
    }

    //4
    public double div2number(double a, double b) {
        return a / b;
    }

    //5
    public double biggerNumber(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //6
    public int countWord(String word) {
        int count = word.length();
        return count;
    }

    //7
    public String toUpperCase(String word) {
        String toUpper = word.toUpperCase();
        return toUpper;
    }

    //8
    public String toLowerCase(String word) {
        String toLower = word.toLowerCase();
        return toLower;
    }

    //9
    public double SquarePerimeter(double side) {
        return side * 4;
    }

    //10
    public double TrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    //11
    public double RectanglePerimeter(double a, double b) {
        return (a + b) / 2;
    }

    //12
    public double CirclePerimeter(double radius) {
        double pi = Math.PI;
        return 2 * radius * pi;
    }

    //13
    public double KitePerimeter(double a, double b) {
        return 2 * a + 2 * b;
    }

    //14
    public double TrapezoidPerimeter(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    //15
    public double HexagonPerimeter(int side) {
        return side * 6;
    }

    //16
    public double SquareArea(int side) {
        return Math.pow(side, 2);
    }

    //17
    public double EllipseArea(double a, double b) {
        return Math.PI * a * b;
    }

    //18
    public double TriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    //19
    public double CircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    //20
    public double TrapezoidArea(double base, double size, double height) {
        return (base + size) / 2 * height;
    }

    //21
    public double CubeArea(double side) {
        return 6 * Math.pow(side, 2);
    }

    //22
    public double CylinderArea(double radius, double height) {
        return 2 * Math.PI * radius * (radius + height);
    }

    //23
    public double ConeArea(double radius, double height) {
        return Math.PI * radius * (radius + height);
    }

    //24
    public double SphereArea(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    //25
    public double Hemisphere(double radius) {
        return 3 * Math.PI * Math.pow(radius, 2);
    }

    //26
    public int[] bubbleSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < (list.length - i); j++) {
                if (list[j - 1] > list[j]) {
                    int temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }

    //27
    public String[] sortWord(String[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].compareTo(list[j]) > 0) {
                    String temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }

    //28
    public boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    //29
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //30
    public double calculateAverage(int[] list) {
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum / list.length;
    }

    //31
    public double findCos(double number) {
        return Math.cos(number);
    }
    //32

    public double findSin(double number) {
        return Math.sin(number);
    }

    //33
    public double findTan(double number) {
        return Math.tan(number);
    }

    //34
    public double cubeNumber(double number) {
        return Math.pow(number, 3);
    }

    //35
    public double powerNumber(double number, double power) {
        return Math.pow(number, power);
    }

    //36
    public double addNnumber(int[] list) {
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }

        return sum;
    }

    //36
    public double subNnumber(int[] list) {
        double sub = 0;
        for (int i = 0; i < list.length; i++) {
            sub -= list[i];
        }

        return sub;
    }

    //38
    public double mulNnumber(int[] list) {
        double result = 0;
        for (int i = 0; i < list.length; i++) {
            result *= list[i];
        }

        return result;
    }

    //39
    public double divNnumber(int[] list) {
        double div = 0;
        for (int i = 0; i < list.length; i++) {
            div /= list[i];
        }

        return div;
    }

    //40
    public double getAbsolutevalue(double number) {
        return Math.abs(number);
    }

    //41
    public double vietnamIncome(double income) {
        double result = 0;
        if (income <= 5000000) {
            result = income * 0.05;
        } else if (income > 5000000 && income <= 10000000) {
            result = income * 0.1;
        } else if (income > 10000000 && income <= 18000000) {
            result = income * 0.15;
        } else if (income > 18000000 && income <= 32000000) {
            result = income * 0.2;
        } else if (income > 32000000 && income <= 52000000) {
            result = income * 0.25;
        } else if (income > 52000000 && income <= 80000000) {
            result = income * 0.30;
        } else if (income > 80000000) {
            result = income * 0.35;
        } else {
            result = 0;
        }
        return result;
    }

    //42
    public String getGrade(double score) {
        double mark = (score * 100) / 100;
        if (mark >= 90) {
            return "A";
        } else if (mark < 90 && mark >= 80) {
            return "B";
        } else if (mark < 80 && mark >= 70) {
            return "C";
        } else if (mark < 70 && mark >= 60) {
            return "D";
        } else if (mark < 60 && mark >= 50) {
            return "E";
        } else if (mark < 50 && mark >= 40) {
            return "F";
        } else {
            return "Fail";
        }
    }

    //43
    public boolean isArightangeltriangle(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
            int a1 = a * a;
            int b1 = b * b;
            int c1 = c * c;
            if (c1 == a1 + b1 || b1 == a1 + c1 || a1 == b1 + c1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //44
    public double cubeVolumn(double side) {
        return Math.pow(side, 3);
    }

    //45
    public double cuboidVolumn(double side, double length, double height) {
        return side * length * height;
    }

    //46
    public double ConeVolumn(double radius, double height) {
        return (1 / 3) * Math.PI * Math.pow(radius, 2) * height;
    }

    //47
    public double CylinderVolumn(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    //48
    public double SphereVolumn(double radius) {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    //49
    public double hemisphereVolumn(double radius) {
        return (2 / 3) * Math.PI * Math.pow(radius, 3);
    }

    //50 
    public double PyramidVolumn(double height, double length, double side) {
        return (1 / 3) * ((height * side) * height);
    }

    //51
    public double forceof2object(double mass1, double mass2, double distance) {
        double G = 6.673e-11;
        return (G * mass1 * mass2) / Math.pow(distance, 2);
    }

    //52
    public double forceOfearthToObject(double mass) {
        return 9.8 * mass;
    }

    //53
    public double velocity(double initialVelocity, double acceleration, double time) {
        return initialVelocity + (acceleration * time);
    }

    //54
    public double kineticEnergy(double mass, double velocity) {
        return (1 / 2) * mass * Math.pow(velocity, 2);
    }

    //55
    public double gravitationalPotentialEnergy(double mass, double gravity, double height) {
        return mass * gravity * height;
    }

    //56
    public boolean getGender(String gender) {
        if (gender.equals("male")) {
            return true;
        } else {
            return false;
        }
    }

    //57
    public int multiplicationTable2(int number) {
        return 2 * number;
    }

    //58
    public int multiplicationTable3(int number) {
        return 3 * number;
    }

    //59
    public int multiplicationTable4(int number) {
        return 4 * number;
    }

    //60
    public int multiplicationTable5(int number) {
        return 5 * number;
    }

    //61
    public int multiplicationTable6(int number) {
        return 6 * number;
    }

    //62
    public int multiplicationTable7(int number) {
        return 7 * number;
    }

    //63
    public int multiplicationTable8(int number) {
        return 8 * number;
    }

    //64
    public int multiplicationTable9(int number) {
        return 9 * number;
    }

    //65
    public int multiplicationTable10(int number) {
        return 10 * number;
    }

    //66
    public double numberpow(double number, double pows) {
        return Math.pow(number, pows);
    }

    //67
    public boolean vertify(String user, String password) {
        return !user.isEmpty() && !password.isEmpty() && password.length() > 10;
    }

    //68
    public boolean isACat(String sound) {
        return sound.equals("meow");
    }

    //69
    public boolean isADog(String sound) {
        return sound.equals("goof");
    }

    //70
    public boolean whenGoToSleep(int time) {
        if (time > 24) {
            return false;
        } else return time == 3 || time == 4;
    }
    
    //71
   
    //72
    
    //73
    
    //74
    
    //75
    
    //76
    
    //77
    
    //78
    
    //79
    
    //80

    public static void main(String[] args) {
        allCase test = new allCase();
        String lower = test.toLowerCase("TeST");
        System.out.println(lower);
    }

}
