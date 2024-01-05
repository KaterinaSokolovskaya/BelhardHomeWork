package by.belhard.sokolovskaya;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Info {

    public static void checkInfo(String name, int age) throws IncorrectInfoException {
        if (age > 100 || age < 0)
            throw new IncorrectInfoException("Возраст введен некорректно.", name, age);

        String pattern = "\\p{Punct}";
        Matcher matcher = Pattern.compile(pattern).matcher(name);
        if (name.length() > 200 || matcher.find())
            throw new IncorrectInfoException("ФИО введено некорректно.", name, age);
    }
}
