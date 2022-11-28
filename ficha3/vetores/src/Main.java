public class Main {
    public static void main(String[] args) {
        final int[] studentNUmbers = {20032,30312,25342,31432};
        final String[] courseAcronyms = {"AD","WEB-FE", "WEB-BE"};
        final int [][] studentGrades= {
                {15,18,17},
                {17,13,12},
                {11,18,15},
                {15,16,17}

        };
        float higthesAverage = 0;
        int bestStudent = 0;
        for(int i = 0; i <studentNUmbers.length; i++){
            System.out.println("Aluno " + studentNUmbers[i] + " obteve as seguintes notas: ");
            float average = 0;
            for (int e = 0; e <courseAcronyms.length; e++){
                System.out.println( "\t" + courseAcronyms[e] + ": " + studentGrades[i][e]);
                average+=studentGrades[i][e];
            }
            average /= studentGrades[i].length;
            if (average > higthesAverage){
                higthesAverage = average;
                bestStudent+=studentNUmbers[i];
            }
            System.out.println("\t" + "Média: " + average);
        }
        System.out.println("A média mais alta é: " + higthesAverage + " do aluno: "+bestStudent);
    }

}