package alhorithm.how_do_homework;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HappyTicketsFourSign {
    public static void main(String... args) {
        lucky();
    }

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