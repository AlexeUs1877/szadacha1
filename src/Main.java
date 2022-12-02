public class Main {
    public static void main(String[] args) {
int number = 15;
float a = 8.5f;                        // два числа a и b для определения из них ближайшего к number
float b = 12.8f;
boolean nearest = (a - number) > (b - number);
if (a >= number || b >= number) {
    System.out.println("Число не должно быть больше или равно проверяемому.");
}
else if (a == b) {
    System.out.println("Введите разные числа.");
}
else if (nearest) {
    System.out.println("Ближайшее число к проверяемому равно: " + a);
}
else {
    System.out.println("Ближайшее число к проверяемому равно: " + b);
}

    }
}