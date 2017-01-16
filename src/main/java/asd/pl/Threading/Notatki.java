package asd.pl.Threading;

/**
 * Created by RENT on 2017-01-16.
 */
public class Notatki{
        volatile int x;

        public static void main(String[] args) {
            // TWORZENIE WĄTKÓW
            // 1. Implementacja interfejsu Runnable
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("S");
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();

            // NIGDY NIE UŻYWAMY
            runnable.run();
            thread.run();

            // 2. Rozszerzenie klasy Thread
            Thread thread1 = new Thread() {
                @Override
                public void run() {
                    System.out.println("S");
                }
            };
            thread1.start();

            // Usypianie wątku
            try {
                // Zatrzymuje na X = 100ms
                Thread.sleep(200); // 1s = 1000ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Łączenie/synchronizowanie wątków
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Synchronized
            // 1. Blok
            Object x = new Object();
            synchronized (x) {
//            list.add(10);

            }

            //
            synchronized (x) {

            }
            // list.add


            // metody synchronized

//        x = 10;
//        x += 10;

        /*
        1. pobranie wartości / 10
        1' pobranie wartości / 10
        2. policzenie nowej wartości / 20
        2' liczy nową / 20
        3. przypisanie do zmiennej / 20
        3' przypisuje do zmiennej / 20

*/
            // volatile - każdy wątek ļedzie widział tę samą wartość pola

            // Program działający na 1 wątku, zapisujący 1000 plików na dysku
            // zapisze ścieżki do tych plików w liście
            // wypisze listę wszystkich plików


        }

        public synchronized int getX() {
            return 10;
        }
}

