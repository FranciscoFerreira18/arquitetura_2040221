public class Main {
    public static void main(String[] args) {
        char letter = 'a';
        int number_char = 2;
        int indice1= 1;
        int indice2=3;
        char []palavra = {'a','b','c','d','r'};
        char []palavra1 = {'e','f','g','h'};
        char replace='e';
        String word = "aaaa";
        System.out.println(CharaterUtilities.lowerLetterSuccessorOf(letter));
        System.out.println(CharaterUtilities.lowerLetterPredecessorOf(letter));
        System.out.println(CharaterUtilities.lowerLetterSuccessorStepsOf(letter,number_char));
        System.out.println(CharaterUtilities.lowerLetterPredecessorStepsOf(letter,number_char));
        System.out.println(CharaterUtilities.occurrencesOfCharacterIn(letter,palavra));
        //System.out.println(CharaterUtilities.replaceCharacterIn(letter,palavra,replace));
        System.out.println(CharaterUtilities.concatenationOf(palavra,palavra1));
        System.out.println(CharaterUtilities.copyOfPartOf(palavra,indice1,indice2));
        System.out.println(CaesarCipherDecipherer.cipher(word,2));



    }
}


