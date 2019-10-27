package rank;

import java.util.HashMap;
import java.util.Map;

/**
 * created by @author suraj on 21/10/19
 */
public class GOT2 {


    final static int mod = 1000000007;

    static int solve(String s) {

        Map<String, Integer> charCount = new HashMap<>();

        for (String chr : s.split("")) {
            charCount.merge(chr, 1, Integer::sum);
        }

        long totalHalf = 0;

        long combinator = 1;

        for (Integer count : charCount.values()) {
            int half = count / 2;
            totalHalf += half;
            if (half > 1) {
                combinator = (combinator % mod * fact(half) % mod) % mod;
            }
        }

        int modInverse = modInverse(combinator, mod);

        totalHalf = (int) fact(totalHalf);

        return (int) (totalHalf % mod * modInverse % mod) % mod;

    }

    static long fact(long n) {
        long res = 1;
        for (int i = 2; i <= n; i++) {
            res = (res % mod * i % mod) % mod;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(solve("wklmxibigvaeqzigwbgysgfbvyvcqczmmnzlxatdxtjqvrwrucsmixpfvkhnniabxbnudizbejtzcpszrmlbkdihnrvczxezytvdbvgfgzgiobhhnvkzyuhnleqndwmbrhgucnckmitdlcmzzzyzthnfnfsqdgtunaospqcdbximcvlbwmbpvqulvobyuxskzieozgtagcoizclvooklehwzvaxsxrcwaimbofbwjrgitsfhiqvnzrmwrmqqfumhcaitilprdwcwqhgyzbnaucxoqnevitdktlddzvxcrzajigjkjxkgzjupxymhrprndxsespglqiwbpflacxgdhaugbhnuygjddchxtpkmygnpmarqxyweaqkdzzyaghdllljhcvtacgrqgjidjgkjzwpywnycwepirartwkwaqnqwyabhhntgkiggvhktlzdccuxyetyuhqsfswpzjihtqqbnxlgknkopelplfnfofavxwkzhsgbkyexxsghfsvwwjljoapehrzepkdwemxrmcqkuwtborznamwoonsvetbtfhqkvpdhtttpqnseertedqutfookhqfnzxzuncbgvvynkquoknsnfojlcxxlpcaoabipfmxdjvqtokhyabnfrwstwpgluhcwkmlqyktjijcwwluwmhddeyycphnlqrhaeuqefjopvslrefpqouwuswwkdmvtddujzmqgwevrwgkanbtevryqpxatjxoockacxqivwgosmyvczqgwjgmydotmoidqsdurvdmrlajzygbzyhwhqkitbbipllfgqaxlfmcsmnrnwtoucmesxooapwpdjwlzyimfuoxjdpwzkkwoxajwoxyftnkclvbmgptadrliijiuweitgrrwqpbjemlrjodpdzsisdranbwjhgenaxjqomasanlkcpzhqrqixjkmkgvrmbgbdhijklnpqtvwz"));
    }

    static int modInverse(long num, int mod) {
        return (int) findMMIFermat(num, mod);
    }

    static long fastPow(long base, long n, long m) {
        if (n == 0)
            return 1;
        if (n == 1)
            return base;
        long halfn = fastPow(base, n / 2, m);
        if (n % 2 == 0)
            return (halfn * halfn) % m;
        else
            return (((halfn * halfn) % m) * base) % m;
    }

    static long findMMIFermat(long n, int M) {
        return fastPow(n, M - 2, M);
    }

}
