public class AllPrograms {

    public static void main(String[] args) {

        Student s = new Student();
        s.display();

        int[] oneD = {10, 20, 30, 40, 50};

        System.out.println("\n\nOne-Dimensional Array:");
        for (int i = 0; i < oneD.length; i++) {
            System.out.print(oneD[i] + " ");
        }

        int[][] twoD = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("\n\nTwo-Dimensional Array:");
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

        int[][][] threeD = {
            {
                {1, 2},
                {3, 4}
            }
        };

        System.out.println("\nThree-Dimensional Array:");
        for (int i = 0; i < threeD.length; i++) {
            for (int j = 0; j < threeD[i].length; j++) {
                for (int k = 0; k < threeD[i][j].length; k++) {
                    System.out.print(threeD[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        int[][] jagged = {
            {10, 20},
            {30, 40, 50},
            {60, 70, 80, 90}
        };

        System.out.println("\nJagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        char[] ch = {'J', 'A', 'V', 'A'};

        System.out.println("\nCharacter Array:");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }

        String[] names = {"Ram", "Sita", "Ravi", "Priya"};

        System.out.println("\n\nString Array:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}

