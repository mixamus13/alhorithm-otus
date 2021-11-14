package alhorithm.bit_arithmetic;

public class Program {
    public static void main(String... args) {
        System.out.println(1100 & 1010);
        System.out.println(1100 | 1010);
        System.out.println(1100 ^ 1010);
    }
}

class BitBoardKing {
    public static void main(String... args) {
        System.out.println("position king = " + getKingBitboardMoves(19));
    }

    public static long getKingBitboardMoves(int position) {
        long king = 1L << position;
        long emptyA = 0xfefefefefefefefeL;
        long emptyH = 0x7f7f7f7f7f7f7f7fL;
        long emptyAForKing = king & emptyA;
        long emptyHForKing = king & emptyH;
        long mask = (emptyAForKing << 7) | (king << 8) | (emptyHForKing << 9) |
                    (emptyAForKing >> 1) |               (emptyHForKing << 1) |
                    (emptyAForKing >> 9) | (king >> 8) | (emptyHForKing >> 7);
        return mask;
    }
}

class BitBoardHorse {
    public static void main(String... args) {
        System.out.println("position horse = " + getHorseBitboardMoves(63));
    }

    public static long getHorseBitboardMoves(int position) {
        long horse = 1L << position;
        long mask = (horse << 8) | (horse << 16) | (horse << 17) | (horse << 15)
                | (horse >> 8) | (horse >> 16) | (horse >> 17) | (horse >> 15)
                | (horse >> 1) | (horse >> 2) | (horse >> 10) | (horse << 6)
                | (horse << 1) | (horse << 2) | (horse << 10) | (horse >> 6);
        return mask;
    }
}

/*
УРОВЕНЬ JUNIOR
0. +1 байт. Решить задачу про короля.
1. +1 байт. Решить задачу про коня.
2. +1 байт. Реализовать два алгоритма подсчёта единичных битов в числе.
Прислать отчёт о выполненном задании:
какие пункты выполнены, сколько байт собрано, сколько времени ушло на выполнение домашнего задания, ссылку на репозиторий.

УРОВЕНЬ MIDDLE
Выполнить все пункты БЕЗ системы тестирования, проверить алгоритмы вручную.
0100. +2 байт. Решить задачу про ладью.
0101. +1 байт. Реализовать подсчёт единичных битов через кэширование.

Прислать отчёт о выполненном задании:
какие пункты выполнены, сколько байт собрано, сколько времени ушло на выполнение домашнего задания, ссылку на репозиторий.

УРОВЕНЬ SENIOR
Выполнить все пункты, проверить алгоритмы через систему тестирования.
1001. +2 байта. Решить задачу про слона.
1010. +2 байта. Решить задачу про ферзя.
 */