import java.util.Random;
import java.util.Scanner;

public class ExercitiiPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //10.	Scrieți un program care să calculeze și să afișeze cel
        // mai mare divizor comun al două numere(numerele se pot citi de la tastatura)
        //algoritm euclid cu impartire
//        System.out.println("introdu primul nr");
//        int nr1 = scanner.nextInt();
//        System.out.println("introdu al2lea nr");
//        int nr2 = scanner.nextInt();
//
//        while (nr2!=0){
//            int temp = nr2;
//            nr2 = nr1%nr2;
//            nr1 = temp;
//        }
//
//        int cmmdc = nr1;
//        System.out.println("cel mai mare divizor comun este " + nr1);

        //11.	Scrieți un program care să verifice dacă un an dat este bisect sau nu.
//        System.out.println("introdu un an");
//        int year = scanner.nextInt();
//
//        if (year % 4 !=0 && year % 400 != 0){
//            System.out.println("Anul " + year + " este obisnuit");
//        } else if ((year % 100 != 0 && year % 4 == 0) || (year % 100 != 0 || year % 400 ==0) ) {
//            System.out.println("Anul " + year + " este bisect");
//        }else {
//            System.out.println("Anul " + year + " nu este bisect");
//        }

        //12.	Realizați un joc simplu în care utilizatorul trebuie să răspundă la întrebări cu adevărat
        // sau fals(diferite intrebari pe care le puteti stabili voi). Pentru fiecare raspuns corect,
        // jucatorul primeste 10 puncte, iar pt fiecare raspuns gresit, trebuie sa i se scada 5 puncte.
        // La final, trebuie sa ii afisam jucatorului rezultatul: punctajul total + cate intrebari au fost corecte, si cate gresite.

//        int punctaj = 0;
//        int intrebariCorecte = 0;
//        int intrebariGresite = 0;
//
//        System.out.println("Azi e Miercuri?");
//        System.out.println(" 1 -> da, 2 -> nu");
//        int optiuneAleasa1  = scanner.nextInt();
//        if (optiuneAleasa1 == 1){
//            punctaj+=10;
//            intrebariCorecte++;
//        } else {
//            punctaj-=5;
//            intrebariGresite++;
//        }
//
//        System.out.println("Care este capitala Romaniei?");
//        System.out.println(" 1 -> Roma, 2 -> Bucuresti, 3-> Timisoara");
//        int optiuneAleasa2  = scanner.nextInt();
//        if (optiuneAleasa2 == 1){
//            punctaj-=5;
//            intrebariGresite++;
//        } else if (optiuneAleasa2 == 2){
//            punctaj+=10;
//            intrebariCorecte++;
//        } else {
//            punctaj-=5;
//            intrebariGresite++;
//        }
//
//        System.out.println("Afara ploua?");
//        System.out.println(" 1 -> da, 2 -> nu");
//        int optiuneAleasa3  = scanner.nextInt();
//        if (optiuneAleasa3 == 1){
//            punctaj-=5;
//            intrebariGresite++;
//        } else {
//            punctaj+=10;
//            intrebariCorecte++;
//        }
//
//        System.out.println("ai finalizat intrebarile");
//        System.out.println("ai " + punctaj + " puncte");
//        System.out.println("ai raspuns la " +  intrebariCorecte + " intrebari corecte");
//        System.out.println("ai raspuns la " +  intrebariGresite + " intrebari gresite");

        Random random = new Random();
        int alegereCalculator = random.nextInt(3) + 1;
        String alegere;
        switch (alegereCalculator){
            case 1: System.out.println("foarfeca");
            alegere = "foarfeca";
            break;
            case 2: System.out.println("hartie");
            break;
            case 3: System.out.println("piatra");
            break;
        }

        //System.out.println(alegereCalculator);

    }
}
