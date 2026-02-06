package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {
    public static boolean validateUsername(String s) {
        return s.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$");
    }

    public static boolean validatePlate(String s) {
        return s.matches("^[A-Z]{2}[0-9]{4}$");
    }

    public static boolean validateHex(String s) {
        return s.matches("^#[0-9a-fA-F]{6}$");
    }

    public static void extractEmails(String text) {
        Matcher m = Pattern
                .compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")
                .matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    public static void extractCapitalWords(String text) {
        Matcher m = Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    public static void extractDates(String text) {
        Matcher m = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b").matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    public static void extractLinks(String text) {
        Matcher m = Pattern.compile("https?://\\S+").matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    public static String normalizeSpaces(String s) {
        return s.replaceAll("\\s+", " ");
    }

    public static String censorWords(String s) {
        return s.replaceAll("\\b(damn|stupid)\\b", "****");
    }

    public static boolean validateIP(String ip) {
        return ip.matches(
                "^((25[0-5]|2[0-4]\\d|1?\\d?\\d)\\.){3}" +
                        "(25[0-5]|2[0-4]\\d|1?\\d?\\d)$"
        );
    }

    public static boolean validateCard(String s) {
        return s.matches("4\\d{15}") || s.matches("5\\d{15}");
    }

    public static void extractLanguages(String text) {
        Matcher m = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b").matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    public static void extractCurrency(String text) {
        Matcher m = Pattern.compile("\\$?\\d+(\\.\\d{2})?").matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    public static void findRepeatingWords(String text) {
        Matcher m = Pattern.compile("\\b(\\w+)\\s+\\1\\b").matcher(text);
        while (m.find()) {
            System.out.println(m.group(1));
        }
    }

    public static boolean validateSSN(String s) {
        return s.matches("^\\d{3}-\\d{2}-\\d{4}$");
    }

    public static void main(String[] args) {

        System.out.println(validateUsername("user_123"));
        System.out.println(validatePlate("AB1234"));
        System.out.println(validateHex("#FFA500"));
        System.out.println(validateIP("192.168.1.1"));
        System.out.println(validateSSN("123-45-6789"));

        extractEmails("Contact us at support@example.com and info@company.org");
        extractCapitalWords("The Eiffel Tower is in Paris");
        extractDates("Event on 12/05/2023 and 15/08/2024");
        extractLinks("Visit https://google.com");
        extractLanguages("I love Java and Python");
        extractCurrency("Price is $45.99 and discount 10.50");
        findRepeatingWords("This is is a test test");
    }
}

