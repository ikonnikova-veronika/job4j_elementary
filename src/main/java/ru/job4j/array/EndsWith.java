package ru.job4j.array;

public class EndsWith {
    @SuppressWarnings("checkstyle:NoWhitespaceAfter")
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            result = post[post.length - i - 1] == word[word.length - i - 1];
            if (!result) {
                break;
            }
        }
        return result;
    }
}
