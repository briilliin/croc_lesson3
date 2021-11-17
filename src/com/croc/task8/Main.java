package com.croc.task8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(Paths.get(args[0]));
        } catch (IOException e) {
            System.out.println("Не удалось открыть указанный файл, ошибка: " + e.getMessage());
            //System.out.println(pathToFile.toAbsolutePath());
            return;
        }

        Pattern pattern = Pattern.compile("[a-zа-яA-ZА-Я_0-9]+");
        int count = 0;
        while (scanner.hasNextLine()) {
            Matcher matcher = pattern.matcher(scanner.nextLine());
            while (matcher.find()) {
                count++;
            }
        }
        System.out.println(count);
    }


    public static List<String> readListFromFile(String inputFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(inputFile));
        List<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextLine());
        }
        return list;
    }
}