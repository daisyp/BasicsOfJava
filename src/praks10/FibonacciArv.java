package praks10;

public class FibonacciArv {
    public static void main(String[] args){


        int i = 0;
        long fibValue = 0;

        //kui arv l�heb suuremaks kui lubatud integer v��rtus, muutub see negatiivseks
        while (fibValue >= 0) {
            //rekursiooniga v�ga aeglane variant:
            //fibValue =  fibonacci(i);

            //rekursioonita kiire variant int t��pi tagastusega:
            //fibValue = effectiveFibonacci(i);

            //rekursioonita kiire variant long t��pi tagastusega:
            fibValue = effectiveLongFibonacci(i);

            if (fibValue >= 0){
                System.out.println(fibValue);
                i++;
            }

        }
        //prindib v�lja mitmes fibonacci arv oli viimati prinditud v��rtus
        // fibonacci: 47
        // effectiveFibonacci: 47
        // effectiveLongFibonacci : 93
        // siit ka 32 bitise ja 64 bitise muutuja erinevus. viimane suudab endas hoida palju suuremaid arve
        System.out.println("Final: " + i);

    }

    /**
     * rekursiooniga variant
     * v�ga aeglane tulemuse arvutamine
     * @param n - mitmes fibonacci arv
     * @return tulemus
     */
    public static int fibonacci(int n){
        if (n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    /**
     * ilma rekursioonita. palju-palju kiirem
     * @param n mitmes fibonacci arv
     * @return tulemus
     */
    public static int effectiveFibonacci(int n){
        //defineerin int t��pi muutujad, andes osadele neist ka algv��rtused
        int prev = 0, tmp, cur = 1;

        if (n == 0){
            return prev;
        }

        for(int i = 0; i < n-1; i++){
            //salvestan ajutiselt viimase arvu
            tmp = cur;
            //viimasele arvule lisatakse eelmise v��rtus
            cur += prev;
            //eelmine arv saab v��rtuseks viimase arvu ajutiselt salvestatud v��rtuse
            prev = tmp;
        }
        return cur;
    }

    /**
     * ilma rekursioonita kiire variant
     * tagastab LONG t��pi muutuja, mis hoiab endas palju suuremaid arve kui INTEGER
     * @param n mitmes fibonacci arv
     * @return tulemus
     */
    public static long effectiveLongFibonacci(int n){
        //defineerin long t��pi muutujad, andes osadele neist ka algv��rtused
        long prev = 0, tmp, cur = 1;

        if (n == 0){
            return prev;
        }

        for(int i = 0; i < n-1; i++){
            //salvestan ajutiselt viimase arvu
            tmp = cur;
            //viimasele arvule lisatakse eelmise v��rtus
            cur += prev;
            //eelmine arv saab v��rtuseks viimase arvu ajutiselt salvestatud v��rtuse
            prev = tmp;
        }
        return cur;
    }
}
