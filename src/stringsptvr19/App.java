/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsptvr19;

import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    private String rChStr;
    @SuppressWarnings("empty-statement")
    public void run() {
        System.out.println("-----Перевертыш------");
        //Просим пользователя ввести строку
        System.out.println("Введите строку!");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //Полученную строку преобразуем в массив char[]
        char[] chStr = str.toCharArray();
        //Создали новый массив для обратной строки
        char[] rChStr = new char[str.length()];
        //В цикле пройлем пр chStr и посетим 
        //Из chStr символы в обратном порядке
        for (int i = 0; i < rChStr.length; i++) {
            rChStr[i] = chStr[(chStr.length - 1 ) - i];
        }
        //Преобразуем массив символов rCharStr в строку
        String rStr = new String(rChStr);
        System.out.println("Перевёртыш: "+rStr);
        //Решение с помощью класса StringBuilder
        StringBuilder sbStr = new StringBuilder(str);
        System.out.println("Перевёртыш 2: "+sbStr.reverse().toString());
        
        int FirstSpace = str.indexOf(" ");
        int firstSpace = 0;
        int SecondSpace = str.indexOf(" ", firstSpace+1);
        int secondSpace = 0;
        if(firstSpace < 0) {
            System.out.println("Второго слова нет");
        }else if (secondSpace < 0) {
            System.out.println("Второе слво: " +str.substring(firstSpace));
        }else {
            System.out.println("Второе слово: " +str.substring(firstSpace+1));
            
        }
        System.out.println("Второй способ решения: ");
        String[] arrWords = str.split("");
        if(arrWords.length > 1 && arrWords[1] != null) {
            System.out.println("Второе слово:" + arrWords[1]);
        }else {
            System.out.println("Нет второго слова");
        }
        
        
    }
            
            
            
            
            
            
}
