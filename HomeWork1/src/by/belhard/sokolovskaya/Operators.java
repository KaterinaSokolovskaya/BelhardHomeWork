package by.belhard.sokolovskaya;

import java.util.Scanner;

public class Operators {

    void one() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Это число четное!");
        } else {
            System.out.println("Это число нечетное");
        }
    }

    void two() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер дня недели: ");
        int day = sc.nextInt();
        String dayNameIf;
        String dayNameSwitch;

        if (day == 1) {
            dayNameIf = "Понедельник";
        } else if (day == 2) {
            dayNameIf = "Вторник";
        } else if (day == 3) {
            dayNameIf = "Среда";
        } else if (day == 4) {
            dayNameIf = "Четверг";
        } else if (day == 5) {
            dayNameIf = "Пятница";
        } else if (day == 6) {
            dayNameIf = "Суббота";
        } else if (day == 7) {
            dayNameIf = "Воскресенье";
        } else {
            dayNameIf = "Такого дня нет.";
        }

        switch (day) {
            case 1:
                dayNameSwitch = "Понедельник";
                break;
            case 2:
                dayNameSwitch = "Вторник";
                break;
            case 3:
                dayNameSwitch = "Среда";
                break;
            case 4:
                dayNameSwitch = "Четверг";
                break;
            case 5:
                dayNameSwitch = "Пятница";
                break;
            case 6:
                dayNameSwitch = "Суббота";
                break;
            case 7:
                dayNameSwitch = "Воскресенье";
                break;
            default:
                dayNameSwitch = "Такого дня нет";
        }

        System.out.println("День недели (IF): " + dayNameIf);
        System.out.println("День недели (SWITCH): " + dayNameSwitch);
    }

    void three() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = sc.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = sc.nextInt();
        System.out.println("Введите третье число: ");
        int thirdNumber = sc.nextInt();

        int sum;
        if (firstNumber < secondNumber) {
            if (firstNumber < thirdNumber) {
                sum = secondNumber + thirdNumber;
            } else {
                sum = firstNumber + secondNumber;
            }
        } else {
            if (secondNumber < thirdNumber) {
                sum = firstNumber + thirdNumber;
            } else {
                sum = firstNumber + secondNumber;
            }
        }
        System.out.println("Сумма наибольших чисел равна " + sum);
    }

    void four() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = sc.nextInt();
        int normalYear = 365;
        int leapYear = 366;

        if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("В этом году " + normalYear + " дней.");
        } else if (year % 4 == 0) {
            System.out.println("В этом году " + leapYear + " дней.");
        } else {
            System.out.println("В этом году " + normalYear + " дней.");
        }
    }

    void five() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите '1' для сложения, '2' для вычитания, '3' для умножения, '4' для деления: ");
        int numberOfOperation = sc.nextInt();
        System.out.println("Введите два целых числа (второе не должно быть '0'): ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        switch (numberOfOperation) {
            case 1:
                System.out.println(firstNumber + secondNumber);
                break;
            case 2:
                System.out.println(firstNumber - secondNumber);
                break;
            case 3:
                System.out.println(firstNumber * secondNumber);
                break;
            case 4:
                if (secondNumber == 0) {
                    System.out.println("Делитель не может быть '0'.");
                } else {
                    System.out.println(firstNumber / secondNumber);
                }
                break;
            default:
                System.out.println("Номер операции введен неверно!");
        }
    }

    void six() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 0 до 999: ");
        int number = sc.nextInt();
        String isEvenNumber;
        String nDigit;

        if (number >= 0 && number <= 999) {
            if (number % 2 == 0) {
                isEvenNumber = "четное";
            } else {
                isEvenNumber = "нечетное";
            }

            if ((number / 100) > 0) {
                nDigit = "трехзначное";
            } else if ((number / 10) > 0) {
                nDigit = "двухзначное";
            } else {
                nDigit = "однозначное";
            }

            System.out.println(isEvenNumber + " " + nDigit + " число");
        } else {
            System.out.println("Введено некорректное число.");
        }
    }

    void seven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа (день и номер месяца): ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        String zodiac;

        switch (month) {
            case 1:
                if (day >= 20 && day <= 31) {
                    zodiac = "Водолей";
                } else if (day > 0 && day < 20) {
                    zodiac = "Козерог";
                } else {
                    zodiac = "День введен некорректно.";
                }
                break;
            case 2:
                if (day >= 19 && day <= 29) {
                    zodiac = "Рыбы";
                } else if (day > 0 && day < 19) {
                    zodiac = "Водолей";
                } else {
                    zodiac = "День введен некорректно.";
                }
                break;
            case 3:
                if (day >= 21 && day <= 31) {
                    zodiac = "Овен";
                } else if (day > 0 && day < 21) {
                    zodiac = "Рыбы";
                } else {
                    zodiac = "День введен некорректно.";
                }
                break;
            case 4:
                if (day >= 20 && day <= 30) {
                    zodiac = "Телец";
                } else if (day > 0 && day < 20) {
                    zodiac = "Овен";
                } else {
                    zodiac = "День введен некорректно.";
                }
                break;
            case 5:
                if (day >= 21 && day <= 31) {
                    zodiac = "Близнецы";
                } else if (day > 0 && day < 21) {
                    zodiac = "Телец";
                } else {
                    zodiac = "День введен некорректно.";
                }
                break;
            case 6:
                if (day >= 22 && day <= 30) {
                    zodiac = "Рак";
                } else if (day > 0 && day < 22) {
                    zodiac = "Близнецы";
                } else {
                    zodiac = "День введен некорректно.";
                }
                break;
            case 7:
                if (day >= 23 && day <= 31) {
                    zodiac = "Лев";
                } else if (day > 0 && day < 23) {
                    zodiac = "Рак";
                } else {
                    zodiac = "День введен некорректно.";
                }
                break;
            case 8:
                if (day >= 23 && day <= 31) {
                    zodiac = "Дева";
                } else if (day > 0 && day < 23) {
                    zodiac = "Лев";
                } else {
                    zodiac = "День введен некорректно.";
                }
                break;
            case 9:
                if (day >= 23 && day <= 30) {
                    zodiac = "Весы";
                } else if (day > 0 && day < 23) {
                    zodiac = "Дева";
                } else {
                    zodiac = "День введен некорректно.";
                }
                break;
            case 10:
                if (day >= 23 && day <= 31) {
                    zodiac = "Скорпион";
                } else if (day > 0 && day < 23) {
                    zodiac = "Весы";
                } else {
                    zodiac = "День введен некорректно.";
                }
                break;
            case 11:
                if (day >= 23 && day <= 30) {
                    zodiac = "Стрелец";
                } else if (day > 0 && day < 23) {
                    zodiac = "Скорпион";
                } else {
                    zodiac = "День введен некорректно.";
                }
                break;
            case 12:
                if (day >= 22 && day <= 31) {
                    zodiac = "Козерог";
                } else if (day > 0 && day < 22) {
                    zodiac = "Стрелец";
                } else {
                    zodiac = "День введен некорректно.";
                }
                break;
            default:
                zodiac = "Месяц введен некорректно.";
        }
        System.out.println(zodiac);
    }

    void eight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер масти (1 - пики, 2 - трефы, 3 - бубны, 4 - червы) и номер достоинства карты: ");
        int suitOfCardNumber = sc.nextInt();
        int cardValueNumber = sc.nextInt();
        String suitOfCard;
        String cardValue;

        switch (suitOfCardNumber){
            case 1:
                suitOfCard = "пик";
                break;
            case 2:
                suitOfCard = "треф";
                break;
            case 3:
                suitOfCard = "бубен";
                break;
            case 4:
                suitOfCard = "червей";
                break;
            default:
                System.out.println("Неверно введен номер масти.");
                suitOfCard = "";
        }

        if (cardValueNumber == 6){
            cardValue = "Шестерка";
        } else if (cardValueNumber == 7) {
            cardValue = "Семерка";
        } else if (cardValueNumber == 8) {
            cardValue = "Восмерка";
        } else if (cardValueNumber == 9) {
            cardValue = "Девятка";
        } else if (cardValueNumber == 10) {
            cardValue = "Десятка";
        } else if (cardValueNumber == 11) {
            cardValue = "Валет";
        } else if (cardValueNumber == 12) {
            cardValue = "Дама";
        } else if (cardValueNumber == 13) {
            cardValue = "Король";
        } else if (cardValueNumber == 14) {
            cardValue = "Туз";
        } else {
            System.out.println("Неверно введен номер карты.");
            cardValue = "";
        }

        System.out.println(cardValue + " " + suitOfCard);
    }
}
