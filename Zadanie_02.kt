package com.example.myapplication

/*
1. Znajdź największy element w tablicy (cyfry 0-9)
2. Znajdź najmniejszy element w tablicy (cyfry 0-9)
3. Znajdź drugi największy element (vice-max) w tablicy (cyfry 0-9)
4. Oblicz sumę wszystkich elementów tablicy (liczby 10-99)
5. Oblicz sumę elementów parzystych w tablicy (cyfry 0-9)
6. Oblicz sumę elementów nieparzystych w tablicy (cyfry 0-9)
7. Sprawdź czy tablica jest lustrzana (palindrom) (cyfry 0-9)
8. Sprawdź czy suma elementów na parzystych indeksach równa się sumie na nieparzystych indeksach (cyfry 0-9)
9. Sprawdź czy tablica jest "skacząca" - elementy naprzemiennie mniejsze i większe (cyfry 0-9)
10. Policz ile jest liczb parzystych w tablicy (cyfry 0-9)
 */

class Zadania {
    fun Zad1(intArray: IntArray): Int {
        return intArray.max();
    }
    fun Zad2(intArray: IntArray): Int
    {
        return intArray.min();
    }
    fun Zad3(T: IntArray): Int
    {
        return T.max()-1;
    }
    fun Zad4(T: IntArray): Int
    {
        var suma = 0;
        for(i in 0 until T.size)
        {
            suma += T[i];
        }

        return suma;
    }
    fun Zad5(T: IntArray): Int
    {
        var suma = 0;
        for(i in 0 until T.size)
        {
            if(i%2==0)
            {
                suma += T[i];
            }
        }

        return suma;
    }
    fun Zad6(T: IntArray): Int
    {
        var suma = 0;
        for(i in 0 until T.size)
        {
            if(i%2!=0)
            {
                suma += T[i];
            }
        }

        return suma;
    }
    fun Zad7(T: IntArray): Boolean
    {
        var odLewej = "";
        var odPrawej = "";
        for(i in 0 until T.size)
        {
            odLewej = odLewej + T[i].toString();
        }
        odPrawej = odLewej.reversed();

        if (odLewej==odPrawej)
        {
            return true;
        }
        return false;
    }
    fun Zad8(T: IntArray) : Boolean
    {
        var SumaParz = 0;
        var SumaNieParz = 0;

        for(i in 0 until T.size)
        {
            if(i%2!=0)
            {
                SumaNieParz += T[i];
            }
            else
            {
                SumaParz += T[i];
            }
        }

        if(SumaParz==SumaNieParz)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    fun Zad9(tab: IntArray): Boolean {

        var rośnie = tab[1] > tab[0]

        for (i in 1 until tab.size - 1) {
            if (rośnie && tab[i + 1] <= tab[i])
            {
                return false
            }
            if (!rośnie && tab[i + 1] >= tab[i])
            {
                return false
            }
            rośnie = !rośnie
        }
        return true
    }
    fun Zad10(tab: IntArray): Int
    {
        var iloscNieParz = 0;
        for(i in 0 until tab.size)
        {
            if(tab[i] % 2 != 0)
            {
                iloscNieParz += 1;
            }
        }
        return iloscNieParz;
    }

}