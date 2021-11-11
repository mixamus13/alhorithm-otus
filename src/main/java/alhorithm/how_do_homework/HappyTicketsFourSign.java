package alhorithm.how_do_homework;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HappyTicketsFourSign {
    public static void main(String... args) {
        lucky();
    }

    //  3422||2234
    private static int lucky() {
        int count = 0;
        for (int a1 = 0; a1 <= 9; a1++) {
            for (int a2 = 0; a2 <= 9; a2++) {
                for (int a3 = 0; a3 <= 9; a3++) {
                    for (int a4 = 0; a4 <= 9; a4++) {
                        for (int b1 = 0; b1 <= 9; b1++) {
                            for (int b2 = 0; b2 <= 9; b2++) {
                                for (int b3 = 0; b3 <= 9; b3++) {
                                    for (int b4 = 0; b4 <= 9; b4++) {
                                        if (a1 + a2 + a3 + a4 == b1 + b2 + b3 + b4) {
                                            count++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        log.info("result: " + count);
        return count;
    }
}

@Slf4j
class HappyTicketsOneSign {
    public static void main(String... args) {
        lucky();
    }

    //  2||2
    private static int lucky() {
        int count = 0;
        for (int a1 = 0; a1 <= 9; a1++) {
            for (int b1 = 0; b1 <= 9; b1++) {
                if (a1 == b1) {
                    count++;
                }
            }
        }
        log.info("result: " + count);
        return count;
    }
}

@Slf4j
class HappyTicketsTwoSign {
    public static void main(String... args) {
        lucky();
    }

    //  21||03
    private static int lucky() {
        int count = 0;
        for (int a1 = 0; a1 <= 9; a1++) {
            for (int a2 = 0; a2 <= 9; a2++) {
                for (int b2 = 0; b2 <= 9; b2++) {
                    for (int b1 = 0; b1 <= 9; b1++) {
                        if (a1 + a2 == b1 + b2) {
                            count++;
                        }
                    }
                }
            }
        }
        log.info("result: " + count);
        return count;
    }
}

@Slf4j
class HappyTicketsRecursion {
    public static void main(String... args) {
        luckyTickets(0, 0, 0);
    }

    //  21||03
    private static void luckyTickets(int digitNumber, int sumOne, int sumTwo) {
        int count = 0;
        int n = 0;
        if (digitNumber == n) {
            if (sumOne == sumTwo) {
                count++;
                return;
            }
        }

        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                luckyTickets(digitNumber + 1, sumOne + a, sumTwo + b);
            }
        }
    }
}