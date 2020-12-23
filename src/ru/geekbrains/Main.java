package ru.geekbrains;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new FileReader(
                    "test.csv"));


            String line;
            Scanner scanner;
            int index = 0;
            List<AppDate> empList = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                AppDate emp = new AppDate();
                scanner = new Scanner(line);
                scanner.useDelimiter(";");
                while (scanner.hasNext()) {
                    String data = scanner.next();
                    if (index == 0)
                        emp.setId(Integer.parseInt(data));
                    else if (index == 1)
                        emp.setName(data);
                    else if (index == 2)
                        emp.setRole(data);
                    else if (index == 3)
                        emp.setSalary(data);
                    else
                        System.out.println("Некорректные данные" + data);
                    index++;
                }
                index = 0;
                empList.add(emp);
            }


            reader.close();

            System.out.println(empList);

        }

    }



