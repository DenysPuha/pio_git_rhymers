package edu.kis.vh.nursery;

/**
Ta klasa służy do tworzenia tablicy i pracy z danymi tej tablicy.
 */
public class DefaultCountingOutRhymer {
    /**Maksymalny rozmiar tablicy*/
    public static final int CAPACITY = 12;

    /**Zmienna, która oznacza pustą tablicę*/
    public static final int EMPTY_INDEX = -1;

    /**Zmienna, która jest błędem pustej tablicy*/
    public static final int EMPTY_ERROR = -1;

    /**Tworzenie tablicy z maksymalnym rozmiarem*/
    private final int[] numbers = new int[CAPACITY];

    /**Tworzenie iteratora dla tablicy z początkowym znaczeniem EMPTY (-1)*/
    private int total = EMPTY_INDEX;



    /**
     funkcja która dodaje podany element do tablicy
     Jeśli tablica nie jest pelna, to element będzie dodany do tablicy i iterator będzie zwiększony
     Jeśli tablica jest pełna, funkcja nie podejmie żadnych działań
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     Funkcja sprawdza, czy jest tablica pusta.
     Jeśli tak to zwraca true, jeśli nie false
     */
    public boolean callCheck() {
        return total == EMPTY_INDEX;
    }

    /**
     Funkcja sprawdza, czy jest tablica pełna.
     Jeśli tak to zwraca true, jeśli nie - false
     */
    public boolean isFull() {
        return total==CAPACITY-1;
    }

    /**
     Funkcja zwraca ostatni dodany element do tablicy.
     Jeśli tablica jest pusta, to zwraca wartość EMPTY
     Inaczej funkcja zwraca ostatni dodany element.
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY_ERROR;
        return numbers[total];

    }

    /**
     Funkcja zwraca ostatni dodany element do tablicy usuwająć jego.
     Jeśli tablica jest pusta, to zwraca wartość EMPTY
     Inaczej funkcja zwraca ostatni dodany element i zmniejsza iterator o 1.
     */
    public int countOut() {
        if (callCheck())
            return EMPTY_ERROR;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
