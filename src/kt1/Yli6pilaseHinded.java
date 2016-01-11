package kt1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
	 * On antud hinnete maatriks (int[][] g), milles on iga üliõpilase jaoks üks
	 * rida, mille elementideks on selle üliõpilase hinded (skaalal 0 kuni 5).
	 * Koostada Java meetod üliõpilaste pingerea moodustamiseks, mis tagastaks
	 * reanumbrite massiivi (kõrgeima keskhindega reast allapoole, võrdsete
	 * korral jääb ettepoole see rida, mille number on väiksem).
	 *
	 * Matrix of grades (int[][] g) contains one row per student where elements
	 * of the row are grades (in scale 0 to 5) of corresponding student. Write a
	 * Java method to calculate an array of row indices in descending order of
	 * average grade, in case of equal averages the row that has smaller index
	 * comes first.
	 */

public class Yli6pilaseHinded {

   /* public static void main(String[] args) {
        int[][] grades = new int[][] { { 5, 3, 1 }, { 4, 3, 5 } };
        int[] res = sortByAvg(grades); // {1,0}
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    } // main

    public static int[] sortByAvg(int[][] g) {
        return null;



    } */

    public static void main(String[] args) {
        int[][] hinded = {
                {0, 2, 5, 3, 1},
                {5, 4, 3, 2, 1, 3},
                {5, 5, 5},
                {5, 5, 4, 4},
                {5, 5, 3}
        };

        leiaParimad(hinded);
    }

    public static int[] leiaParimad(int[][] h) {
        int[] pingerida = new int[h.length];

        ArrayList<Integer[]> keskmised = new ArrayList<>();

        for (int i = 0; i < h.length; i++) {
            int[] opilane = h[i];
            double keskmine = 0;
            for (int j = 0; j < opilane.length; j++) {
                keskmine += opilane[j];
            }
            keskmine = keskmine / opilane.length;
            keskmised.add(new Integer[] {i, (int)keskmine});
        }

        Collections.sort(keskmised, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] i1, Integer[] i2) {
                if (i1[1] > i2[1]) {
                    return -1;
                } else if (i1[1] < i2[1]) {
                    return 1;
                } else {
                    if (i1[0] < i2[0]) {
                        return 1;
                    } else if (i1[0] < i2[0]) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });

        for (int i = 0; i < keskmised.size(); i++) {
            pingerida[i] = keskmised.get(i)[0];
            System.out.printf("index=%d avgGrade=%d%n", keskmised.get(i)[0], keskmised.get(i)[1]);
        }

        return pingerida;
    }


}
