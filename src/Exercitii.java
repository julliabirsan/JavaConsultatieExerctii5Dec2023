import java.util.Scanner;

public class Exercitii {
    public static void main(String[] args) {

        //1.	Sa se citeasca un numar de la tastatura.
        // Daca este cuprins intre 1 si 7, sa se afiseze numele corespondent
        // zilei din saptamana(1-Luni … 7-Duminica). Daca este introdus
        // un numar diferit, sa se afiseze mesajul “ERROR”.

        Scanner scanner = new Scanner(System.in);
//        System.out.println("introdu un nr de la tastatura");
//        int optiune = scanner.nextInt();
//        switch (optiune){
//            case 1: System.out.println("Luni");
//            break;
//            case 2: System.out.println("Marti");
//            break;
//            case 3: System.out.println("Miercuri");
//            break;
//            case 4: System.out.println("Joi");
//            break;
//            case 5: System.out.println("Vineri");
//            break;
//            case 6: System.out.println("Sambata");
//            break;
//            case 7: System.out.println("Duminica");
//            break;
//            default:System.out.println("ERROR");
//        }

        //2.	Sa se calculeze suma numerelor cuprinse in intervalul [0,100].
        int sum = 0;
        for (int i = 0; i<=100; i++){
            sum+=i;
        }
        System.out.println("suma nr din intervalul [0;100] = " + sum);

        //3.	Sa se afiseze descrescator numerele curpinse in intervalul [0,50].

        for (int i = 50; i>0; i--){
            System.out.println(i);
        }

        //4.	Sa se citeasca de la tastatura un numar. Daca este cuprins intre 0 si 9,
        // sa se afiseze mesajul “Ai afisat numarul x”. Altfel, sa se afiseze mesajul “Numarul nu este permis”

//        int numarAles = scanner.nextInt();
//        if (numarAles>0 && numarAles<9){
//            System.out.println("ai afisat nr " + numarAles );
//        } else {
//            System.out.println("nr nu este permis");
//        }

        //5.	Sa se citeasca un numar de la tastatura. Daca este cuprins intre 0 si 3 sa se afiseze “DA”,
        // daca este cuprins intre 4 si 6 sa se afiseze  “NU”. Altfel, se va afisa mesajul “numarul nu este acceptat”

//     if (numarAles>0 && numarAles<3){
//         System.out.println("DA");
//     }  else if (numarAles>4 && numarAles<6){
//         System.out.println("NU");
//     } else {
//         System.out.println("numarul nu este acceptat");
//     }

     //6.	Sa se citeasca un nr de la tastatura. Cat timp nr este < 10, sa se adune
        // numarul cu 2 si sa se printeze suma finala.
//        if (numarAles<10){
//
//            System.out.println("suma finala = "+ (numarAles+2));
//        }

        //7.	Sa se citeasca 2 nr de la tastatura. Sa se faca adunarea numerelor din interval,
        // cat timp primul numar este mai mic ca al doilea. Primul numar se va incrementa cu 1.
//
//        System.out.println("introdu primul nr");
//        int nr1 = scanner.nextInt();
//        System.out.println("introdu al2lea nr");
//        int nr2 = scanner.nextInt();

//        int sum3 = 0;
//        if (nr1<nr2){
//            for (int i = nr1; i<nr2; i++){
//                sum3+=i;
//            }
//            System.out.println("suma din intervalul " + nr1 + " -> " + nr2 + " este " + sum3);
//        } else{
//            System.out.println("nr1 este mai mare ca nr2");
//        }

        //8.	Sa se citeasca 2 nr de la tastatura. Sa se faca adunarea numerelor din interval.
        // Daca suma este mai mica ca si 20, sa se afiseze “MIC”, daca este mai mare, sa se afiseze “MARE”
//        int sum4 = 0;
//        if (nr1<nr2) {
//            for (int i = nr1; i <= nr2; i++) {
//                sum4 += i;
//            }
//        } else {
//            for (int i = nr2; i <= nr1; i++) {
//                sum4 += i;
//            }
//        }
//        System.out.println(sum4);
//        if (sum4<20){
//            System.out.println("MIC");
//        } else {
//            System.out.println("MARE");
//        }

        //9.	Sa se faca adunarea numerelor citite de la tastatura, cat timp numarul citit este diferit de 0
        //+ VARIANTA CU BREAK
        //+ VARIANTA CU DO WHILE
        boolean b = true;
        int suma = 0;
        while (b){
            int nrCitit = scanner.nextInt();
            if (nrCitit!=0){
                suma +=nrCitit;
            } else {
                b = false;
            }
        }
        System.out.println("suma este = " + suma);


    }
}
