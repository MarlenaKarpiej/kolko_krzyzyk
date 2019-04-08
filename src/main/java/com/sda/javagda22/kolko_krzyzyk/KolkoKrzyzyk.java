package com.sda.javagda22.kolko_krzyzyk;

import java.util.Random;
import java.util.Scanner;

public class KolkoKrzyzyk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char[][] plansza = new char[3][3];
        System.out.println("Kółko czy krzyżyk ?\nOto plansza:");
        char x = '1';
        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza.length; j++) {
                plansza[i][j] = x;
                x++;
                System.out.print(plansza[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Losujemy kto zaczyna...wymik:");
        int ktoZaczyna = random.nextInt(2);
        if (ktoZaczyna == 0) {
            System.out.println("Rozpoczyna komputer");
        } else {
            System.out.println("Rozpoczyna gracz");
        }

        int wylosowanePolePrzezKomputer;
        boolean czyPoprawnieZajetePole;
        do {
            if (ktoZaczyna % 2 == 1) {
                System.out.println("Twój ruch. Wybierz wolne pole od 1 do 9");
                czyPoprawnieZajetePole = false;
                do {
                    int k = scanner.nextInt();
                    switch (k) {
                        case 1:
                            if (plansza[0][0] == '1') {
                                plansza[0][0] = 'X';
                                for (int i = 0; i < plansza.length; i++) {
                                    for (int j = 0; j < plansza.length; j++) {
                                        System.out.print(plansza[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                czyPoprawnieZajetePole = true;
                            } else {
                                System.out.println("Wybierz wolne pole ");
                                czyPoprawnieZajetePole = false;
                            }
                            break;
                        case 2:
                            if (plansza[0][1] == '2') {
                                plansza[0][1] = 'X';
                                for (int i = 0; i < plansza.length; i++) {
                                    for (int j = 0; j < plansza.length; j++) {
                                        System.out.print(plansza[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                czyPoprawnieZajetePole = true;
                            } else {
                                System.out.println("Wybierz wolne pole ");
                                czyPoprawnieZajetePole = false;
                            }
                            break;
                        case 3:
                            if (plansza[0][2] == '3') {
                                plansza[0][2] = 'X';
                                for (int i = 0; i < plansza.length; i++) {
                                    for (int j = 0; j < plansza.length; j++) {
                                        System.out.print(plansza[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                czyPoprawnieZajetePole = true;
                            } else {
                                System.out.println("Wybierz wolne pole ");
                                czyPoprawnieZajetePole = false;
                            }
                            break;
                        case 4:
                            if (plansza[1][0] == '4') {
                                plansza[1][0] = 'X';
                                for (int i = 0; i < plansza.length; i++) {
                                    for (int j = 0; j < plansza.length; j++) {
                                        System.out.print(plansza[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                czyPoprawnieZajetePole = true;
                            } else {
                                System.out.println("Wybierz wolne pole ");
                                czyPoprawnieZajetePole = false;
                            }
                            break;
                        case 5:
                            if (plansza[1][1] == '5') {
                                plansza[1][1] = 'X';
                                for (int i = 0; i < plansza.length; i++) {
                                    for (int j = 0; j < plansza.length; j++) {
                                        System.out.print(plansza[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                czyPoprawnieZajetePole = true;
                            } else {
                                System.out.println("Wybierz wolne pole ");
                                czyPoprawnieZajetePole = false;
                            }
                            break;
                        case 6:
                            if (plansza[1][2] != '6') {
                                plansza[1][2] = 'X';
                                for (int i = 0; i < plansza.length; i++) {
                                    for (int j = 0; j < plansza.length; j++) {
                                        System.out.print(plansza[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                czyPoprawnieZajetePole = true;
                            } else {
                                System.out.println("Wybierz wolne pole ");
                                czyPoprawnieZajetePole = false;
                            }
                            break;
                        case 7:
                            if (plansza[2][0] == '7') {
                                plansza[2][0] = 'X';
                                for (int i = 0; i < plansza.length; i++) {
                                    for (int j = 0; j < plansza.length; j++) {
                                        System.out.print(plansza[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                czyPoprawnieZajetePole = true;
                            } else {
                                System.out.println("Wybierz wolne pole ");
                                czyPoprawnieZajetePole = false;
                            }
                            break;
                        case 8:
                            if (plansza[2][1] == '8') {
                                plansza[2][1] = 'X';
                                for (int i = 0; i < plansza.length; i++) {
                                    for (int j = 0; j < plansza.length; j++) {
                                        System.out.print(plansza[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                czyPoprawnieZajetePole = true;
                            } else {
                                System.out.println("Wybierz wolne pole ");
                                czyPoprawnieZajetePole = false;
                            }
                            break;
                        case 9:
                            if (plansza[2][2] == '9') {
                                plansza[2][2] = 'X';
                                for (int i = 0; i < plansza.length; i++) {
                                    for (int j = 0; j < plansza.length; j++) {
                                        System.out.print(plansza[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                czyPoprawnieZajetePole = true;
                            } else {
                                System.out.println("Wybierz wolne pole ");
                                czyPoprawnieZajetePole = false;
                            }
                            break;
                    }
                } while (czyPoprawnieZajetePole == false);
            } else {
                System.out.print("Ruch komputera ");
                czyPoprawnieZajetePole = false;
                do {
                    wylosowanePolePrzezKomputer = random.nextInt(9) + 1;
                    System.out.println("wylosowana liczba: " + wylosowanePolePrzezKomputer);
                    switch (wylosowanePolePrzezKomputer) {
                        case 1:
                            if (plansza[0][0] == '1') {
                                plansza[0][0] = 'O';
                                for (int i = 0; i < plansza.length; i++) {
                                    for (int j = 0; j < plansza.length; j++) {
                                        System.out.print(plansza[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                czyPoprawnieZajetePole = true;
                            } else {
                                System.out.println("Ponowne losowanie pola");
                                czyPoprawnieZajetePole = false;
                            }
                            break;
                        case 2:
                            if (plansza[0][1] == '2') {
                                plansza[0][1] = 'O';
                                for (int i = 0; i < plansza.length; i++) {
                                    for (int j = 0; j < plansza.length; j++) {
                                        System.out.print(plansza[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                czyPoprawnieZajetePole = true;
                            } else {
                                System.out.println("Ponowne losowanie pola");
                                czyPoprawnieZajetePole = false;
                            }
                            break;
                        case 3:
                            if (plansza[0][2] == '3') {
                                plansza[0][2] = 'O';
                                for (int i = 0; i < plansza.length; i++) {
                                    for (int j = 0; j < plansza.length; j++) {
                                        System.out.print(plansza[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                czyPoprawnieZajetePole = true;
                            } else {
                                System.out.println("Ponowne losowanie pola");
                                czyPoprawnieZajetePole = false;
                            }
                            break;
                        case 4:
                            if (plansza[1][0] == '4') {
                                plansza[1][0] = 'O';
                                for (int i = 0; i < plansza.length; i++) {
                                    for (int j = 0; j < plansza.length; j++) {
                                        System.out.print(plansza[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                czyPoprawnieZajetePole = true;
                            } else {
                                System.out.println("Ponowne losowanie pola");
                                czyPoprawnieZajetePole = false;
                            }
                            break;
                        case 5:
                            if (plansza[1][1] == '5') {
                                plansza[1][1] = 'O';
                                for (int i = 0; i < plansza.length; i++) {
                                    for (int j = 0; j < plansza.length; j++) {
                                        System.out.print(plansza[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                czyPoprawnieZajetePole = true;
                            } else {
                                System.out.println("Ponowne losowanie pola");
                                czyPoprawnieZajetePole = false;
                            }
                            break;
                        case 6:
                            if (plansza[1][2] != '6') {
                                plansza[1][2] = 'O';
                                for (int i = 0; i < plansza.length; i++) {
                                    for (int j = 0; j < plansza.length; j++) {
                                        System.out.print(plansza[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                czyPoprawnieZajetePole = true;
                            } else {
                                System.out.println("Ponowne losowanie pola");
                                czyPoprawnieZajetePole = false;
                            }
                            break;
                        case 7:
                            if (plansza[2][0] == '7') {
                                plansza[2][0] = 'O';
                                for (int i = 0; i < plansza.length; i++) {
                                    for (int j = 0; j < plansza.length; j++) {
                                        System.out.print(plansza[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                czyPoprawnieZajetePole = true;
                            } else {
                                System.out.println("Ponowne losowanie pola");
                                czyPoprawnieZajetePole = false;
                            }
                            break;
                        case 8:
                            if (plansza[2][1] == '8') {
                                plansza[2][1] = 'O';
                                for (int i = 0; i < plansza.length; i++) {
                                    for (int j = 0; j < plansza.length; j++) {
                                        System.out.print(plansza[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                czyPoprawnieZajetePole = true;
                            } else {
                                System.out.println("Ponowne losowanie pola");
                                czyPoprawnieZajetePole = false;
                            }
                            break;
                        case 9:
                            if (plansza[2][2] == '9') {
                                plansza[2][2] = 'O';
                                for (int i = 0; i < plansza.length; i++) {
                                    for (int j = 0; j < plansza.length; j++) {
                                        System.out.print(plansza[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                                czyPoprawnieZajetePole = true;
                            } else {
                                System.out.println("Ponowne losowanie pola");
                                czyPoprawnieZajetePole = false;
                            }
                            break;
                    }
                } while (czyPoprawnieZajetePole == false);
            }

            if (plansza[0][0] == plansza[0][1] && plansza[0][0] == plansza[0][2]) {
                System.out.println("Wygrana");
                break;
            } else if (plansza[1][0] == plansza[1][1] && plansza[1][0] == plansza[1][2]) {
                System.out.println("Wygrana");
                break;
            } else if (plansza[2][0] == plansza[2][1] && plansza[2][0] == plansza[2][2]) {
                System.out.println("Wygrana");
                break;
            } else if (plansza[0][0] == plansza[1][0] && plansza[0][0] == plansza[2][0]) {
                System.out.println("Wygrana");
                break;
            } else if (plansza[0][1] == plansza[1][1] && plansza[0][1] == plansza[2][1]) {
                System.out.println("Wygrana");
                break;
            } else if (plansza[0][2] == plansza[1][2] && plansza[0][2] == plansza[2][2]) {
                System.out.println("Wygrana");
                break;
            } else if (plansza[0][0] == plansza[1][1] && plansza[0][0] == plansza[2][2]) {
                System.out.println("Wygrana");
                break;
            } else if (plansza[0][2] == plansza[1][1] && plansza[0][2] == plansza[2][0]) {
                System.out.println("Wygrana");
                break;
            } else if (plansza[0][0] != '1' && plansza[0][1] != '2' && plansza[0][2] != '3' &&
                    plansza[1][0] != '4' && plansza[1][1] != '5' && plansza[1][2] != '6' &&
                    plansza[2][0] != '7' && plansza[2][1] != '8' && plansza[2][2] != '9') {
                System.out.println("Remis");
                break;
            }
            ktoZaczyna++;
        }
        while (ktoZaczyna < 10);
    }
}
