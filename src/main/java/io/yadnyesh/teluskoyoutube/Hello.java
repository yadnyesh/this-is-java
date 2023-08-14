package io.yadnyesh.teluskoyoutube;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Hello {
    public static void main(String[] args) {
        int marks[] = {5,6,7};
        log.info(String.valueOf(marks[1]));

        int nums[][] = new int[3][4];

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}
