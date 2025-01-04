package Interfaces_and_Abstraction.Telephony;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Smartphone implements Callable, Browsable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = new ArrayList<>();
        this.urls = new ArrayList<>();
    }

    public void addNumber(String number){
        this.numbers.add(number);
    }

    public void addUrl(String url){
        this.urls.add(url);
    }

    @Override
    public String browse() {

        return urls.stream()
                .map(url -> {
                    if (url.chars().anyMatch(Character::isDigit)) {
                        return "Invalid URL!";
                    }
                    return "Browsing: " + url + "!";
                })
                .collect(Collectors.joining(System.lineSeparator()));

    }


    @Override
    public String call() {

        for (String number : numbers) {
            for (char ch : number.toCharArray()) {
                if (!Character.isDigit(ch)) {
                    return "Invalid number!";
                }
            }
        }
        return numbers.stream()
                .map(number -> "Calling... " + number)
                .collect(Collectors.joining(System.lineSeparator()));
    }
}
