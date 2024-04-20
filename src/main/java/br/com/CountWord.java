package br.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWord {
    public static void main(String[] args) {
        String fileName = "meuarquivo.txt";
        String wordToCount = "Java";
        int count = 1;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Dividindo a linha em palavras
                String[] words = line.split("\\s+");

                // Contando ocorrências da palavra "Java" em cada linha
                for (String word : words) {
                    if (word.equals(wordToCount)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Exibindo o resultado
        System.out.println("A palavra 'Java' aparece " + count + " vezes no arquivo.");
    }
}

