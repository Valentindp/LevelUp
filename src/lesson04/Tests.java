package lesson04;

import java.util.Scanner;

/**
 * Created by Валентин on 18.09.2016.
 */
public class Tests {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int answers[] = new int[11];


        String questions[][] = questionsForTests();
        int correctAnswers[] = correctAnswersForTests();
        String errors[][] = errorsForTests();


        for (int question = 0; question < questions.length; question++) {

            if (questions[question][0] == null) {
                continue;
            }

            System.out.println("Вопрос №" + (question + 1));

            //Выведем вопрос и варианты ответов
            for (int option = 0; option < questions[question].length; option++) {
                System.out.println(questions[question][option]);
            }
            System.out.println("Выберите вариант ответа");
            //Сохраним ответ
            answers[question] = getAnswer();
        }


        //Выводим результат
        int countCorrectAnswers = 0;
        System.out.println("Результаты теста:");
        for (int answer = 0; answer < answers.length; answer++) {
            int option = answers[answer];
            if (option == 0 || option == 5){
                continue;
            }
            System.out.println("Ответ №" + (answer+1));
            System.out.println(errors[answer][option-1]);

            //Посчитаем число правильных ответов
            if (correctAnswers[answer] == option) {
                countCorrectAnswers++;
            }
        }

        System.out.println("Количество верных ответов "+countCorrectAnswers+" из "+correctAnswers.length);

    }

    private static int getAnswer() {
        if (scanner.hasNextInt()) {
            int answer = scanner.nextInt();
            if (answer >= 5) {
                System.out.println("Неверно указан вариант. Доступные варианты от 1 до 4!");
                return 5;
            } else if (answer < 1) {
                System.out.println("Неверно указан вариант. Доступные варианты от 1 до 4!");
                return 5;
            } else {
                return answer;
            }
        } else {
            System.out.println("Неверно указан вариант. Доступные варианты от 1 до 4!");
            scanner.next();
            return 5;
        }
    }

    private static String[][] errorsForTests() {

        String errors[][] = new String[11][4];

        errors[0][0] = "Ответ не верный! Верный ответ: 2 - 1991 год";
        errors[0][1] = "Ответ верный: 1991 год";
        errors[0][2] = "Ответ не верный! Верный ответ: 2 - 1991 год";
        errors[0][3] = "Ответ не верный! Верный ответ: 2 - 1991 год";

        errors[1][0] = "Ответ не верный! Верный ответ: 4 - Sun Microsystems";
        errors[1][1] = "Ответ не верный! Верный ответ: 4 - Sun Microsystems";
        errors[1][2] = "Ответ не верный! Верный ответ: 4 - Sun Microsystems";
        errors[1][3] = "Ответ верный: Sun Microsystems";

        errors[2][0] = "Ответ не верный! Верный ответ: 2 - Объектно-ориентированный. К функциональным относят Scala и Erlang";
        errors[2][1] = "Ответ верный: jаvа - Объектно-ориентированный язык программирования";
        errors[2][2] = "Ответ не верный! Верный ответ: 2 - Объектно-ориентированный. К процедурным относят Basic и Pascal";
        errors[2][3] = "Ответ не верный! Верный ответ: 2 - Объектно-ориентированный. Метафизических языков не бывает.";

        errors[3][0] = "Ответ верный: в виртуальной машине Java Virtual Machine - JVM";
        errors[3][1] = "Ответ не верный! Верный ответ: 1 - в виртуальной машине Java Virtual Machine - JVM";
        errors[3][2] = "Ответ не верный! JDK - это комплект разработчика приложений на языке Java, в который входит и JVM отвечающая за выполнение байт-кода";
        errors[3][3] = "Ответ не верный! Верный ответ: 1 - в виртуальной машине Java Virtual Machine - JVM";

        errors[4][0] = "Ответ не верный! Абстракция эффективное средство для иерархической классификации";
        errors[4][1] = "Ответ не верный! Полиморфизм - это принцип ООП, позволяющий использовать один и тот же интерфейс для общего класса действий";
        errors[4][2] = "Ответ верный: Инкапсуляция";
        errors[4][3] = "Ответ не верный! Наследование - процесс, в результате которого один объект получает свойства другого";

        errors[5][0] = "Ответ верный: void";
        errors[5][1] = "Ответ не верный! public - модификатор доступа. Дает возможность обращаться к члену класса из кода за пределами данного класса";
        errors[5][2] = "Ответ не верный! private - модификатор доступа. Не разрешает доступ к члену класса из кода за пределами данного класса";
        errors[5][3] = "Ответ не верный! static - позволяет вызывать метод main ( ) без получения экземпляра класса";

        errors[6][0] = "Ответ не верный! doudble - тип для чисел с плавающей точкой";
        errors[6][1] = "Ответ не верный! boolean - логический тип";
        errors[6][2] = "Ответ верный: short";
        errors[6][3] = "Ответ не верный! String - строка. Не относиться к примитивным типам. Массив символов типа char";

        errors[7][0] = "Ответ не верный! Верный ответ: 4 - float";
        errors[7][1] = "Ответ не верный! Верный ответ: 4 - float";
        errors[7][2] = "Ответ не верный! Верный ответ: 4 - floats";
        errors[7][3] = "Ответ верный: float";

        errors[8][0] = "Ответ не верный! \\t - табуляция";
        errors[8][1] = "Ответ верный: \\n";
        errors[8][2] = "Ответ не верный! \\b - возврат на одну позицию";
        errors[8][3] = "Ответ не верный! \\r - возврат каретки";

        errors[9][0] = "Ответ не верный! Верный ответ: 2";
        errors[9][1] = "Ответ верный: doudble - запрещен тип для выражения оператора switch";
        errors[9][2] = "Ответ не верный! Верный ответ: 2";
        errors[9][3] = "Ответ не верный! Верный ответ: 2";

        errors[10][0] = "Ответ не верный! Верный ответ: 3";
        errors[10][1] = "Ответ не верный! Верный ответ: 3";
        errors[10][2] = "Ответ верный: do while()";
        errors[10][3] = "Ответ не верный! if else - оператор условия";

        return errors;
    }

    private static int[] correctAnswersForTests() {
        int correctAnswers[] = new int[11];

        correctAnswers[0] = 2;
        correctAnswers[1] = 4;
        correctAnswers[2] = 2;
        correctAnswers[3] = 1;
        correctAnswers[4] = 3;
        correctAnswers[5] = 1;
        correctAnswers[6] = 3;
        correctAnswers[7] = 4;
        correctAnswers[8] = 2;
        correctAnswers[9] = 2;
        correctAnswers[10] = 3;

        return correctAnswers;
    }

    private static String[][] questionsForTests() {
        String questions[][] = new String[11][5];

        questions[0][0] = "Начало разработке языка jаvа было положено в.. ?";
        questions[0][1] = "1.  1990 году";
        questions[0][2] = "2.  1991 году";
        questions[0][3] = "3.  1995 году";
        questions[0][4] = "4.  1992 году";

        questions[1][0] = "В какой компании начали разработку jаvа?";
        questions[1][1] = "1. Microsoft";
        questions[1][2] = "2. Oracle";
        questions[1][3] = "3. Apple";
        questions[1][4] = "4. Sun Microsystems";

        questions[2][0] = "Язык программирования jаvа - ";
        questions[2][1] = "1. Функциональный";
        questions[2][2] = "2. Объектно-ориентированный";
        questions[2][3] = "3. Процедурный";
        questions[2][4] = "4. Метафизический";

        questions[3][0] = "В какой системе выполняется байт-код jаvа?";
        questions[3][1] = "1. В виртуальной машине Java Virtual Machine - JVM";
        questions[3][2] = "2. В операционной системе";
        questions[3][3] = "3. В Java Development Kit (JDK)";
        questions[3][4] = "4. В декартовой системе";

        questions[4][0] = "Какой принци ОПП обеспечивает безопасность в jаvа?";
        questions[4][1] = "1. Абстракция";
        questions[4][2] = "2. Полиморфизм";
        questions[4][3] = "3. Инкапсуляция";
        questions[4][4] = "4. Наследование";

        questions[5][0] = "Какое ключевое слово сообщает компилятору о том что метод не возвращает никаких значений?";
        questions[5][1] = "1. void";
        questions[5][2] = "2. public";
        questions[5][3] = "3. private";
        questions[5][4] = "4. static";

        questions[6][0] = "byte, int, long. Какой целочисленный примитивный тип пропущен.";
        questions[6][1] = "1. doudble";
        questions[6][2] = "2. boolean";
        questions[6][3] = "3. short";
        questions[6][4] = "4. String";

        questions[7][0] = "В конце значения какого типа необходимо ставить символ f.";
        questions[7][1] = "1. doudble";
        questions[7][2] = "2. boolean";
        questions[7][3] = "3. short";
        questions[7][4] = "4. float";

        questions[8][0] = "Укажите обозначение символа новой строки";
        questions[8][1] = "1. \\t";
        questions[8][2] = "2. \\n";
        questions[8][3] = "3. \\b";
        questions[8][4] = "4. \\r";

        questions[9][0] = "Какой тип переменной запрещен для выражения оператора switch";
        questions[9][1] = "1. char";
        questions[9][2] = "2. doudble";
        questions[9][3] = "3. int";
        questions[9][4] = "4. short";

        questions[10][0] = "Выбрать конструкцыю цикла позволяющую выполнить хотя бы одну итерацию";
        questions[10][1] = "1. for (;;)";
        questions[10][2] = "2. for( : )";
        questions[10][3] = "3. do while()";
        questions[10][4] = "4. if else";

        return questions;
    }
}
